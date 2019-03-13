package project1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename = "./project1/Data.txt";
		FileInputOutput Data = new FileInputOutput(filename);
		Predictor playTennis = new Predictor();

		for(int i = 0; i < Data.getWeatherData().size(); i++) {
			Interface instance = Data.getWeatherData().get(i);
			System.out.println(instance+"Prediction: "+playTennis.getPrediction(instance));
		}

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner intInput = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner boolInput = new Scanner(System.in);

		System.out.println("What's the weather look like today?");
		System.out.print("Outlook: " + "\t");
		String out = input.nextLine() ;
		System.out.print("Temperature: " + "\t");
		int temp = intInput.nextInt();
		System.out.print("Humdity: " + "\t");
		int hum = intInput.nextInt();
		System.out.print("Windy: " + "\t");
		boolean wind = boolInput.nextBoolean();
		System.out.print("Was it a nice day to play tennis?: ");
		String play = input.nextLine();
		Data.write(new Instance(out, temp, hum, wind, play));


	}

}
