package kodlama�OHW3.core.logging;

public class DatabaseLogger implements ILogger{
	@Override
	public void log(String data) {
		System.out.println("Veri VER�TABANI' na y�klendi : "+ data);
		
	}
}
