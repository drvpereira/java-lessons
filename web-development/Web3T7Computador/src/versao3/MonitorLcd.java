package versao3;

public class MonitorLcd implements Monitor {

	@Override
	public void exibir(String msg) {
		System.out.println("[Monitor LCD] " + msg);
	}

}
