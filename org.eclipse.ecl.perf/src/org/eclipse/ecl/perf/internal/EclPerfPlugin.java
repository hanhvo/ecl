package org.eclipse.ecl.perf.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class EclPerfPlugin extends Plugin {
	public static final String PLUGIN_ID = "org.eclipse.ecl.perf";
	private static EclPerfPlugin plugin;

	public static EclPerfPlugin getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		perfService = new PerfService();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		perfService = null;
		super.stop(context);
	}

	private PerfService perfService;

	public PerfService getPerfService() {
		return perfService;
	}

	public static void logWarn(String message) {
		getDefault().getLog().log(
				new Status(IStatus.WARNING, PLUGIN_ID, message));
	}
}
