package tw.ttucse.cloudhw1.client;

<<<<<<< HEAD
import tw.ttucse.cloudhw1.jdo.User;

=======
import tw.ttucse.cloudhw.entity.User;
>>>>>>> 3c38bc0789153931e02ceb4415c2c4edd56a00d6
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService{
	void addUser(User user);
	public void editUser(User user) throws IllegalArgumentException;
	public User getUser(String account) throws IllegalArgumentException;
	public boolean deleteUser(User user) throws IllegalArgumentException;
	
}
