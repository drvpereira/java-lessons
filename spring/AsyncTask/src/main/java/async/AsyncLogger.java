package async;

import org.springframework.stereotype.Component;

@Component
public class AsyncLogger extends AsyncTaskDefinition {

	@Override
	public void execute(Object obj) {
		System.out.println("Logging " + obj);
	}

}
