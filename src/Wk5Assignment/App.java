package Wk5Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Peace");
		
		logger2.log("Welcome");
		logger2.error("Farewell");

	}

}
