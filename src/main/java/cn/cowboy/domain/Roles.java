package cn.cowboy.domain;

public class Roles {
	private Integer roleId;
	private String RoleName;
	private String description;
	private String stat;
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(Integer roleId, String roleName, String description, String stat) {
		super();
		this.roleId = roleId;
		RoleName = roleName;
		this.description = description;
		this.stat = stat;
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

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}
	@Override
	public String toString() {
		return this.RoleName+":"+this.description+":"+this.stat;
	}
}
