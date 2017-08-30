package versao7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

	@Bean @Scope("prototype")
	public Monitor monitorLcd() {
		return new MonitorLcd();
	}
	
	@Bean
	public Monitor monitorLed() {
		return new MonitorLed();
	}
	
	@Bean
	public Monitor doisMonitores() {
		return new DoisMonitores(monitorLcd(), monitorLed());
	}
	
	
	@Bean
	public Teclado tecladoUsb() {
		return new TecladoUsb();
	}
	
	@Bean
	public Impressora impressoraLaser() {
		return new ImpressoraLaser();
	}
	
	@Bean
	public Computador computador() {
		Computador c = new Computador();
		c.setMarca("HP");
		c.setMonitor(doisMonitores());
		c.setTeclado(tecladoUsb());
		c.setImpressora(impressoraLaser());
		return c;
	}
	
	
	
}
