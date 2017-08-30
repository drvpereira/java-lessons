package async;

import org.springframework.stereotype.Component;

@Component
public class AsyncMailSender extends AsyncTaskDefinition {

	@Override
	public void execute(Object obj) {
		System.out.println("Sending email " + obj);
	}

}
