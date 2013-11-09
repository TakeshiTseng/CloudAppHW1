package tw.ttucse.cloudhw1.server;

import java.util.List;

import javax.jdo.PersistenceManager;

import tw.ttucse.cloudhw1.client.PMF;
import tw.ttucse.cloudhw1.client.User;
import tw.ttucse.cloudhw1.client.UserService;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class UserServiceImpl extends RemoteServiceServlet implements UserService{
	private static final long serialVersionUID = -2554257850851305233L;


	public UserServiceImpl() {
		System.out.println("userserviceImpl");
//		PersistenceManager pm = PMF.getInstance().getPersistenceManager();
//		User user = new User("admin", "admin");
//		try {
//			pm.makePersistent(user);
//		} finally {
//			pm.close();
//		}
	}
	
	
	@Override
	public void addUser(User user) {
		System.out.println("test");
		
	}

	@Override
	public void editUser(User user) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String account) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(User user) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<User> getUsers() throws IllegalArgumentException {
		System.out.println("test");
		PersistenceManager pm = PMF.getInstance().getPersistenceManager();
		String query = "SELECT FROM " + User.class.getName() ;
		
		try{
			@SuppressWarnings("unchecked")
			List<User> users = (List<User>) pm.newQuery(query).execute();
			System.out.println(users.size());
			return users;
		} finally{
			pm.close();
		}
	}

}
