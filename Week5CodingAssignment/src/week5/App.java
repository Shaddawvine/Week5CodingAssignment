package week5;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		spaced.Error("Chrono");
		spaced.Log("Chrono");
		asterisk.Error("Chrono");
		asterisk.Log("Chrono");
		
		
		
	}

}
