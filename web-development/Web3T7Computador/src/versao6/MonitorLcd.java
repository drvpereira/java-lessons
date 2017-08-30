package versao6;

public class MonitorLcd implements Monitor {

	@Override
	public void exibir(String msg) {
		System.out.println("[Monitor LCD] " + msg);
	}

}
