package w5d1p1a.helloworld.com.p1;

public class HI {
	String user;

	public HI() { }

	public String getUser() {
	return user;
	}

	public void setUser(String user) {
	this.user = user;
	}

	@Override
	public String toString() {
	return "Hi [user=" + user + "]";
	}

}
