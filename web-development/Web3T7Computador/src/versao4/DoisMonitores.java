package versao4;

public class DoisMonitores implements Monitor {

	private Monitor lcd = new MonitorLcd();
	private Monitor led = new MonitorLed();
	
	@Override
	public void exibir(String msg) {
		lcd.exibir(msg);
		led.exibir(msg);
	}

}
