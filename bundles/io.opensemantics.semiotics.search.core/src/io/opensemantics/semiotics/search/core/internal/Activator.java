package io.opensemantics.semiotics.search.core.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;

public class Activator implements BundleActivator {

  private static BundleContext context;
  private static LogService logging;

  static BundleContext getContext() {
    return context;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext bundleContext) throws Exception {
    Activator.context = bundleContext;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext bundleContext) throws Exception {
    Activator.context = null;
  }

  protected void bindLogger(LogService logging) {
    Activator.logging = logging;
  }

  protected void unbindLogger(LogService logging) {
    Activator.logging = null;
  }

  public static void log(int level, String message) {
    if (Activator.logging != null) {
      Activator.logging.log(level, message);
    }
  }
}
