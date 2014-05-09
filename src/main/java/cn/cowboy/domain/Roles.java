package cn.cowboy.domain;

public class Roles {
	private Integer roleId;
	private String RoleName;
	private String description;
	private boolean available;
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Roles(Integer roleId, String roleName, String description, boolean available) {
		super();
		this.roleId = roleId;
		RoleName = roleName;
		this.description = description;
		this.available = available;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
