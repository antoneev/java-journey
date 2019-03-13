package project1;

public class Predictor {

	public String getPrediction(Interface instance) {
		// TODO Auto-generated method stub

		if (instance.getPlay().equals("yes")){
			return "yes";
		}
		if (instance.getPlay().equals("no")) {
			return "no";
		}
		
		if (instance.getOutlook().equals("sunny")){
			if((instance.getTemperature() >= 72 && instance.getTemperature() <= 85) && 
					(instance.getHumidity() >= 85 && instance.getHumidity() <= 95))
				return "no";
			else 
				return "yes";
		}

		if (instance.getOutlook().equals("overcast")){
			if((instance.getTemperature() >= 73 && instance.getTemperature() <= 81) && 
					(instance.getHumidity() >= 66 && instance.getHumidity() <= 75))
				return "no";
			else 
				return "yes";
		}

		if (instance.getOutlook().equals("rainy")){
			if((instance.getTemperature() >= 65 && instance.getTemperature() <= 71) && 
					(instance.getHumidity() >= 70 && instance.getHumidity() <= 91) && (instance.getWindy() == true))
				return "no";
			else 
				return "yes";
		}

		return "yes";
	}
}