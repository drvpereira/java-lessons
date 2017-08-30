package versao8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("MeuMonitor")
public class MonitorLcd implements Monitor {

	@Override
	public void exibir(String msg) {
		System.out.println("[Monitor LCD] " + msg);
	}

}
