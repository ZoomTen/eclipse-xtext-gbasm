/*
 * generated by Xtext 2.26.0
 */
package org.zumi.xtext.gbasm.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.zumi.xtext.gbasm.ui.internal.GbasmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GbasmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(GbasmActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		GbasmActivator activator = GbasmActivator.getInstance();
		return activator != null ? activator.getInjector(GbasmActivator.ORG_ZUMI_XTEXT_GBASM_GBASM) : null;
	}

}
