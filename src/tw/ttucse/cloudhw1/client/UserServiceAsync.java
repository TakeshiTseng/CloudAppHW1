package tw.ttucse.cloudhw1.client;
<<<<<<< HEAD
import tw.ttucse.cloudhw1.jdo.User;
=======
import tw.ttucse.cloudhw.entity.User;
>>>>>>> 3c38bc0789153931e02ceb4415c2c4edd56a00d6

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserServiceAsync {
	public void addUser(User user, AsyncCallback<Void> callBack) throws IllegalArgumentException;
	public void editUser(User user, AsyncCallback<Void> callBack) throws IllegalArgumentException;
	public void getUser(String account, AsyncCallback<User> callBack) throws IllegalArgumentException;
	public void deleteUser(User user, AsyncCallback<Boolean> callBack) throws IllegalArgumentException;
}
