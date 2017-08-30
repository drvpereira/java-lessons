package tradutoringles;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import dicionariocore.Tradutor;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		context.registerService(Tradutor.class.getName(), new TradutorIngles(), null);
	}

	public void stop(BundleContext context) throws Exception {

	}

}
