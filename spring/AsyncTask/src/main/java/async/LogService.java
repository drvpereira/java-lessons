package async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	@Autowired
	private AsyncLogger logger;
	
	public void logar(String x) {
		logger.adicionar(x);
	}
	
}
