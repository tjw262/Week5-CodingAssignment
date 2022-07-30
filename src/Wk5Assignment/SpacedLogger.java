package Wk5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			sb.append(log.charAt(i) + " ");
		}
		System.out.println(sb.toString());
	}

	@Override
	public void error(String error) {
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			sb2.append(error.charAt(i) + " ");
		}
		System.out.println("Error: " + sb2.toString());
	}

}
