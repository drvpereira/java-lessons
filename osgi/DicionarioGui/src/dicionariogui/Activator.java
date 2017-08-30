package dicionariogui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		new DicionarioFrame(context).setVisible(true);
	}

	public void stop(BundleContext context) throws Exception {
		
	}

}
