package versao5;

public class MonitorLed implements Monitor {

	@Override
	public void exibir(String msg) {
		System.out.println("[Monitor Led] " + msg);
	}

}