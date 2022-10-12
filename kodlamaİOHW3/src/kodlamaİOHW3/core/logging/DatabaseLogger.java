package kodlamaÝOHW3.core.logging;

public class DatabaseLogger implements ILogger{
	@Override
	public void log(String data) {
		System.out.println("Veri VERÝTABANI' na yüklendi : "+ data);
		
	}
}
