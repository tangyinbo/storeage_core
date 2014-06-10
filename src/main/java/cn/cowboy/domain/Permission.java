package cn.cowboy.domain;
/**
 * 
* @ClassName: Permission
* @Description: 权限实体
* @author Tangyinbo
* @date 2014-6-10 下午5:24:52
*
 */
public class Permission {
	private Integer priv_id;
	private String permission;
	private String description;
	private String stat;
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permission(Integer priv_id, String permission, String description, String stat) {
		super();
		this.priv_id = priv_id;
		this.permission = permission;
		this.description = description;
		this.stat = stat;
	}
	public Integer getPriv_id() {
		return priv_id;
	}
	public void setPriv_id(Integer priv_id) {
		this.priv_id = priv_id;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
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
	

}
