package versao7;

public class DoisMonitores implements Monitor {

	private Monitor lcd;
	private Monitor led;
	
	public DoisMonitores(Monitor lcd, Monitor led) {
		this.lcd = lcd;
		this.led = led;
	}
	
	@Override
	public void exibir(String msg) {
		lcd.exibir(msg);
		led.exibir(msg);
	}

}
