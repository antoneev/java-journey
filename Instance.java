package project1;

public class Instance implements Interface{

	private String outlook;
	private int temperature;
	private int humidity;
	private boolean windy;
	private String play;

	public Instance() {
		outlook = " "; 
		temperature = 0;
		humidity = 0;
		windy = true;
		play = " ";
	}

	public Instance(String outlook, int temperature, int humidity, boolean windy, String play) {
		this.outlook = outlook; 
		this.temperature = temperature;
		this.humidity = humidity;
		this.windy = windy;
		this.play = play;
	}

	public void setOutlook(String outlook) {
		this.outlook = outlook;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public void setWindy(boolean windy) {
		this.windy = windy;
	}

	public void setPlay(String play) {
		this.play = play;
	}
	
	public String getOutlook() {
		return outlook;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public boolean getWindy() {
		return windy;
	}

	public String getPlay() {
		return play;
	}
	
	public String toString() {
		return "Weather: Outlook: " +outlook+ "\t " + "Temperature: " +temperature+ "\t" + "Humidity: "+humidity+ "\t" + "Windy: "+windy+" Play: " +play+ "\n";

	}


}

