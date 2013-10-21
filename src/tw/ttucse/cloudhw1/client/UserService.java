package tw.ttucse.cloudhw1.client;

import com.google.appengine.api.users.User;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService{
	public void addUser(User user) throws IllegalArgumentException;
	public void editUser(User user) throws IllegalArgumentException;
	public User getUser(String account) throws IllegalArgumentException;
	public boolean deleteUser(User user) throws IllegalArgumentException;
	
}
