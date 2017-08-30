package async;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.task.SimpleAsyncTaskExecutor;

public class AsyncTasks extends Thread {

	private List<AsyncTaskDefinition> tasks;
	
	public AsyncTasks() {
		tasks = new ArrayList<AsyncTaskDefinition>();
	}

	public void addTask(AsyncTaskDefinition task) {
		tasks.add(task);
	}
	
	@Override
	public void run() {
		for (AsyncTaskDefinition task : tasks) {
			SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
			executor.setThreadPriority(Thread.MIN_PRIORITY);
			executor.execute(task);
		}
	}
	
	public void setTasks(List<AsyncTaskDefinition> tasks) {
		this.tasks = tasks;
	}

}
