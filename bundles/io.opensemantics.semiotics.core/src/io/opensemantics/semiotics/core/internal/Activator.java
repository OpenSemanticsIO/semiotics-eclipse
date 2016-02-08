package io.opensemantics.semiotics.core.internal;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

  public Activator() {
  }

  public static final String PLUGIN_ID = "io.opensemantics.semiotics.core"; //$NON-NLS-1$
  private static Activator plugin;

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  public static Activator getDefault() {
    return plugin;
  }

  public static void log(int status, String message) {
    plugin.getLog().log(new Status(status, PLUGIN_ID, message));
  }
}
