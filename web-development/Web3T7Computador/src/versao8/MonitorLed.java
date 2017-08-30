package versao8;

import org.springframework.stereotype.Component;

@Component 
public class MonitorLed implements Monitor {

	@Override
	public void exibir(String msg) {
		System.out.println("[Monitor LED] " + msg);
	}

}
