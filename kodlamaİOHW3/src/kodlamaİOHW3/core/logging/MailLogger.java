package kodlama�OHW3.core.logging;

public class MailLogger implements ILogger {
	@Override
	public void log(String data) {
		System.out.println("Veri MA�L' e y�klendi : "+ data);

	}
}
