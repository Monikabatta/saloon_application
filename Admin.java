package entity;

public class Admin {
	String userId;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String userId) {
		super();
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Admin [userId=" + userId + "]";
	}
	

}
