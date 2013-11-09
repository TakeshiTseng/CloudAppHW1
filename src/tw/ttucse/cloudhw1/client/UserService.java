package tw.ttucse.cloudhw1.client;


import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService{
	void addUser(User user) throws IllegalArgumentException;
	void editUser(User user) throws IllegalArgumentException;
	User getUser(String account) throws IllegalArgumentException;
	boolean deleteUser(User user) throws IllegalArgumentException;
	List<User> getUsers() throws IllegalArgumentException;
}
