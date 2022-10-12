package kodlamaÝOHW3.core.logging;

public class MailLogger implements ILogger {
	@Override
	public void log(String data) {
		System.out.println("Veri MAÝL' e yüklendi : "+ data);

	}
}
