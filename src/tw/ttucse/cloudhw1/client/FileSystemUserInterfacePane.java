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
import com.google.gwt.user.client.ui.FlexTable;

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
		
		Label lblNewLabel = new Label("CloudApp  -  File Systems");
		lblNewLabel.setStyleName("FileSystemUI_Title");
		
		verticalPanel.add(lblNewLabel);
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel.add(horizontalPanel);
		
		Button btnNewButton = new Button("Creat Floder");
		horizontalPanel.add(btnNewButton);
		
		Label lblNewLabel_2 = new Label("　　　　");
		horizontalPanel.add(lblNewLabel_2);
		
		Button btnNewButton_1 = new Button("Upload File");
		horizontalPanel.add(btnNewButton_1);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		dockLayoutPanel.add(absolutePanel_1);
		
		VerticalPanel verticalPanel_1 = new VerticalPanel();
		absolutePanel_1.add(verticalPanel_1, 10, 10);
		verticalPanel_1.setSize("430px", "217px");
		
		FlexTable flexTable = new FlexTable();
		flexTable.setBorderWidth(1);
		flexTable.setCellSpacing(5);
		flexTable.setCellPadding(5);
		verticalPanel_1.add(flexTable);
		
		Label lblNewLabel_3 = new Label("File Name");
		flexTable.setWidget(0, 0, lblNewLabel_3);
		
		Label lblNewLabel_4 = new Label("Remove");
		flexTable.setWidget(0, 1, lblNewLabel_4);
	}
}
