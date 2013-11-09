package tw.ttucse.cloudhw1.client;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Button;

public class TestPanel extends Composite {
	private static List<User> userlist;
	private final LoginServiceAsync loginServiceAsync = GWT.create(LoginService.class);	
	private final UserServiceAsync userServiceAsync = GWT.create(UserService.class);
			
	public TestPanel() {
		userServiceAsync.getUsers(new AsyncCallback<List<User>>(){

			@Override
			public void onFailure(Throwable caught) {
				System.out.println("failure");
			}

			@Override
			public void onSuccess(List<User> result) {
				System.out.println("success");
				userlist=result;				
			}
			
		});
		
		userServiceAsync.addUser(new User("123","123"), new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable caught) {
				System.out.println("test failure");
				
			}

			@Override
			public void onSuccess(Void result) {
				System.out.println("test success");
				
			}
			
		});

//        System.out.println(userlist.size());
	    VerticalPanel vtp = new VerticalPanel();
	    
	    FlexTable flexTable = new FlexTable();
	    vtp.add(flexTable);
	    
	    Button btnNewButton = new Button("Create");
	    flexTable.setWidget(0, 0, btnNewButton);
	    
	    Button btnNewButton_1 = new Button("Modify");
	    flexTable.setWidget(0, 1, btnNewButton_1);
	    
	    Button btnNewButton_2 = new Button("Remove");
	    flexTable.setWidget(0, 2, btnNewButton_2);
		
		CellTable<User> cellTable = new CellTable<User>();
		initWidget(vtp);
		cellTable.setSize("800px", "600px");
		
		cellTable.setPageSize(30);
		
		
		TextColumn<User> textColumn = new TextColumn<User>() {
			@Override
			public String getValue(User object) {
				return object.getAccount();
			}
		};
		cellTable.addColumn(textColumn, "Account");
		
		TextColumn<User> textColumn_1 = new TextColumn<User>() {
			@Override
			public String getValue(User object) {
				return object.getPassword();
			}
		};
		cellTable.addColumn(textColumn_1, "Password");
		
		TextColumn<User> textColumn_2 = new TextColumn<User>() {
			@Override
			public String getValue(User object) {
				return object.getUsername();
			}
		};
		cellTable.addColumn(textColumn_2, "User Name");
		
//		AsyncDataProvider<User> provider = new AsyncDataProvider<User>() {
//		      @Override
//		      protected void onRangeChanged(HasData<User> display) {
//		        int start = display.getVisibleRange().getStart();
//		        int end = start + display.getVisibleRange().getLength();
//		        System.out.println(userlist.size());
//		        end = end >= userlist.size() ? userlist.size() : end;
//		        List<User> sub = userlist.subList(start, end);
//		        updateRowData(start, sub);
//		      }
//		};
//		provider.addDataDisplay(cellTable);
//		provider.updateRowCount(CONTACTS.size(), true);
//		
//		SimplePager pager = new SimplePager();
//		pager.setDisplay(cellTable);
		
		vtp.add(cellTable);
//		vtp.add(pager);
		
		
		final CellTable<Contact> table = new CellTable<Contact>();
	    // Display 3 rows in one page
	    table.setPageSize(3);

	}

  /**
   * A simple data type that represents a contact.
   */
  private static class Contact {
    private final String address;
    private final Date birthday;
    private final String name;

    public Contact(String name, Date birthday, String address) {
      this.name = name;
      this.birthday = birthday;
      this.address = address;
    }
  }

  /**
   * The list of data to display.
   */
  @SuppressWarnings("deprecation")
  private static final List<Contact> CONTACTS = Arrays.asList(
      new Contact("John", new Date(80, 4, 12), "123 Abc Avenue"), 
      new Contact("Joe", new Date(85, 2, 22), "22 Lance Ln"), 
      new Contact("Tom", new Date(85, 3, 22), "33 Lance Ln"), 
      new Contact("Jack", new Date(85, 4, 22), "44 Lance Ln"), 
      new Contact("Tim", new Date(85, 5, 22), "55 Lance Ln"), 
      new Contact("Mike", new Date(85, 6, 22), "66 Lance Ln"), 
      new Contact("George", new Date(46, 6, 6),"77 Lance Ln"));
}