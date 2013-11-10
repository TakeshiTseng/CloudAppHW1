package tw.ttucse.cloudhw1.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CloudAppHW1 implements EntryPoint {
	
	

	/**
	 * This is the entry point method.
	 */
	
	public void onModuleLoad() {
		LoginDialogBox loginDialobBox = new LoginDialogBox();
		loginDialobBox.setAnimationEnabled(true);
		loginDialobBox.setText("Login DialogBox");
		
		loginDialobBox.center();
	}
}
