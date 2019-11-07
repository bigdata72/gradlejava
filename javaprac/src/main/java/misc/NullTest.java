package misc;

import java.util.HashMap;
import java.util.Map;

public class NullTest {
	private Map<String, User> userMap = new HashMap<>();
	public static void main(String[] args) {
		NullTest test = new NullTest();
		test.createUser();
		test.getUser();
		test.checkUser();
	}

	private void createUser(){
		User user1 = new User("arijit");
		userMap.put("123", user1);
	}

	private void getUser(){
		User user = userMap.get("123");
		user = null;
//		userMap.put("123", user);
	}

	private void checkUser(){
		User user = userMap.get("123");
		boolean nullCheck = user==null ? true : false;
		System.out.println("Result is ="+nullCheck);
	}

	static class User{
		private String name;
		public User(String name){
			this.name = name;
		}
	}
}
