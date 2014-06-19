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
	private String password="123456";
	private String salt;
	private String stat="S0A";
	private String realName;
	private String email;
	private String phone;
	private String sex;
	private Integer age;
	private String description;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Integer userId, String userName, String password, String salt, String stat, String realName, String email, String phone, String sex, Integer age, String description) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.salt = salt;
		this.stat = stat;
		this.realName = realName;
		this.email = email;
		this.phone = phone;
		this.sex = sex;
		this.age = age;
		this.description = description;
	}


	public User(Integer userId, String userName, String password, String salt, String stat) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.salt = salt;
		this.stat = stat;
	}

	public User(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getCredentialsSalt() {
		return this.userName+this.salt;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}
