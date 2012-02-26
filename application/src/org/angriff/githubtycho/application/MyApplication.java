package org.angriff.githubtycho.application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class MyApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("start app");
		
		Thread.sleep(2000);
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("stop app");
	}

}
