package tw.ttucse.cloudhw1.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;

public class FileSystemUserInterfacePane extends Composite{
	public FileSystemUserInterfacePane() {
		
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.EM);
		initWidget(dockLayoutPanel);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		dockLayoutPanel.addNorth(absolutePanel, 4.9);
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		absolutePanel.add(verticalPanel, 0, 0);
		verticalPanel.setSize("450px", "63px");
		
		Label lblNewLabel = new Label("雲端硬碟");
		
		verticalPanel.add(lblNewLabel);
		
		Label lblNewLabel_1 = new Label("File System");
		verticalPanel.add(lblNewLabel_1);
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel.add(horizontalPanel);
		
		Button btnNewButton = new Button("Creat Floder");
		horizontalPanel.add(btnNewButton);
		
		Label lblNewLabel_2 = new Label("　　　　");
		horizontalPanel.add(lblNewLabel_2);
		
		Button btnNewButton_1 = new Button("Upload File");
		horizontalPanel.add(btnNewButton_1);
	}
}
