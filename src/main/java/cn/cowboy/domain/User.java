package cn.cowboy.domain;

/**
 * 
* @ClassName: User
* @Description: 用户实体类
* @author Tangyinbo
* @date 2014-5-9 下午3:06:10
*
 */
public class User {
	private Integer userId;
	private String userName;
	private String password;
	private String salt;
	private boolean locked;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userName, String password, String salt, boolean locked) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.salt = salt;
		this.locked = locked;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	public String toString(){
		return this.userName+":"+this.password+":"+this.salt;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
}
