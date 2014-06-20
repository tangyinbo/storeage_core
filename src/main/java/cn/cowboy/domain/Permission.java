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
	private Integer privId;
	private String permission;
	private String description;
	private String stat="S0A";
	private Integer parentPriv;
	private String privUrl;
	private String type;
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Permission(String permission, String description, String stat) {
		super();
		this.permission = permission;
		this.description = description;
		this.stat = stat;
	}

	public Permission(Integer privId, String permission, String description, String stat,Integer parentPriv,String privUrl) {
		super();
		this.privId = privId;
		this.permission = permission;
		this.description = description;
		this.stat = stat;
		this.parentPriv = parentPriv;
		this.privUrl = privUrl;
	}
	
	public Integer getPrivId() {
		return privId;
	}

	public void setPrivId(Integer privId) {
		this.privId = privId;
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

	public Integer getParentPriv() {
		return parentPriv;
	}

	public void setParentPriv(Integer parentPriv) {
		this.parentPriv = parentPriv;
	}

	public String getPrivUrl() {
		return privUrl;
	}

	public void setPrivUrl(String privUrl) {
		this.privUrl = privUrl;
	}

	@Override
	public String toString() {
		return this.privId+"->"+this.description+"->"+this.permission+"->"+this.privUrl+"->"+this.parentPriv+"->"+this.getStat();
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
