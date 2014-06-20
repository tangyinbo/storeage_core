package cn.cowboy.domain;

/**
 * 
* @ClassName: StoreDict
* @Description: 数据词典
* @author Tangyinbo
* @date 2014-6-20 下午2:04:52
*
 */
public class StoreDict {
	private String dictId;
	private String dictTypeId;
	private String dictName;
	private String stat;
	private String description;
	private Integer seq;
	public StoreDict() {
		super();
	}
	public String getDictId() {
		return dictId;
	}
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getDictTypeId() {
		return dictTypeId;
	}
	public void setDictTypeId(String dictTypeId) {
		this.dictTypeId = dictTypeId;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
}
