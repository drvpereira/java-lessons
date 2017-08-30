package async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private AsyncMailSender sender;

	public void enviarEmail(String teste) {
		sender.adicionar(teste);
	}
	
}
