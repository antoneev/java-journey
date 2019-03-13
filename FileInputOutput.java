package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

//https://stackabuse.com/reading-and-writing-files-in-java/

public class FileInputOutput {

	private String filename;
	private ArrayList<Instance> WeatherPredictor;
	private ArrayList<String> playTennis;
	

	public FileInputOutput(String fileName) {
		this.filename = fileName;
		WeatherPredictor = new ArrayList<Instance>();
		playTennis = new ArrayList<String>();
		read();
	}

	public ArrayList<Instance> getWeatherData(){
		return WeatherPredictor;
	}
	
	public ArrayList<String> getPlay() {
		return playTennis;
	}
	
	public void write(Instance Data) throws IOException {		
		String write = "\n" + Data.getOutlook() + "," + Data.getTemperature() + "," + Data.getHumidity() +
				"," + Data.getWindy() + "," + new Predictor().getPrediction(Data);
		playTennis.add(new Predictor().getPrediction(Data));

		File fn = new File(filename);
		FileWriter filewrite = new FileWriter(fn, true);
		filewrite.write(write);
		filewrite.flush();
		filewrite.close();
	}

	public void read() {
		InputStream ins = null; 
		Reader r = null; 
		BufferedReader br = null; 
		String eof = null;
		try {
			String s = "";
			ins = new FileInputStream(filename);
			r = new InputStreamReader(ins, "UTF-8"); 
			br = new BufferedReader(r);
			while ((s = br.readLine()) != eof) {
				String[] data = s.split(",");
				WeatherPredictor.add(new Instance(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Boolean.parseBoolean(data[3]), data[4]));
				playTennis.add(data[4]);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println("Didn't save to " + filename);
		}
	}
}

