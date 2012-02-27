package org.angriff.githubtycho.application;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MyApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("start app");

		Display firstDisplay = new Display();
		Shell firstShell = new Shell(firstDisplay);
		firstShell.setText("First Example");
		firstShell.setSize(200, 100);
		firstShell.open();
		while (!firstShell.isDisposed()) {
			if (!firstDisplay.readAndDispatch())
				firstDisplay.sleep();
		}
		firstDisplay.dispose();

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("stop app");
	}

}
