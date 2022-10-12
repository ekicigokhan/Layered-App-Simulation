package kodlamaÝOHW3.core.logging;

public class FileLogger implements ILogger {
	@Override
	public void log(String data) {
		System.out.println("Veri DOSYA' ya yüklendi : " + data);

	}
}
