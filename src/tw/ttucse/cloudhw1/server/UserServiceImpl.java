package tw.ttucse.cloudhw1.server;

import tw.ttucse.cloudhw1.client.UserService;
import tw.ttucse.cloudhw1.jdo.User;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class UserServiceImpl extends RemoteServiceServlet implements UserService{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
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

}
