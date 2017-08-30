package versao8;

public class DoisMonitores implements Monitor {

	private Monitor lcd;
	private Monitor led;
	
	@Override
	public void exibir(String msg) {
		lcd.exibir(msg);
		led.exibir(msg);
	}

}
