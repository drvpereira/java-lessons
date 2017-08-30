package async;

import java.util.LinkedList;
import java.util.Queue;

public abstract class AsyncTaskDefinition implements Runnable {

	private Queue<Object> queue = new LinkedList<Object>();
	
	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				Object obj = queue.poll();
				if (obj == null) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					execute(obj);
				}
			}
		}
	}
	
	
	public void adicionar(Object obj) {
		synchronized (queue) {
			queue.add(obj);
			queue.notify();
		}
	}
	
	public abstract void execute(Object obj);
	
}
