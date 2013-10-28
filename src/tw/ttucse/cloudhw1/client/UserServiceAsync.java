package tw.ttucse.cloudhw1.client;
import tw.ttucse.cloudhw1.jdo.User;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserServiceAsync {
	public void addUser(User user, AsyncCallback<Void> callBack) throws IllegalArgumentException;
	public void editUser(User user, AsyncCallback<Void> callBack) throws IllegalArgumentException;
	public void getUser(String account, AsyncCallback<User> callBack) throws IllegalArgumentException;
	public void deleteUser(User user, AsyncCallback<Boolean> callBack) throws IllegalArgumentException;
}
