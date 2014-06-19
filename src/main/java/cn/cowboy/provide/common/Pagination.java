package cn.cowboy.provide.common;
/**
 * 
* @ClassName: Pagination
* @Description: 分页工具类
* @author Tangyinbo
* @date 2014-6-19 下午9:51:36
*
 */
public class Pagination {
	private static final Integer PAGE_ROW_COUNT = 10;
	private boolean firstPage;
	private boolean lastPage;
	private Integer currentPage=1;
	private boolean hasNextPage;
	private boolean hasFrontPage;
	private Integer pageCount;
	private Integer rowCount;
	private Integer showCount=PAGE_ROW_COUNT;
	private Integer nextRows;
	public Pagination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isHasNextPage() {
		return (this.currentPage-1)<this.getPageCount()?true:false;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public boolean isHasFrontPage() {
		return this.currentPage>1?true:hasFrontPage;
	}
	public void setHasFrontPage(boolean hasFrontPage) {
		this.hasFrontPage = hasFrontPage;
	}
	public Integer getPageCount() {
		return ((this.rowCount+this.showCount)/this.showCount);
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getShowCount() {
		return showCount;
	}
	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	
	public Integer getNextRows() {
		return (this.currentPage-1)*getShowCount();
	}
	public void setNextRows(Integer nextRows) {
		this.nextRows = nextRows;
	}
	public boolean isFirstPage() {
		return currentPage==2?true:firstPage;
	}
	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}
	public boolean isLastPage() {
		return currentPage<getPageCount()?lastPage:true;
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
}
