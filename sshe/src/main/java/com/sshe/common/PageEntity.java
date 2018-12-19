package com.sshe.common;

import java.util.List;

public class PageEntity<T> {
	private Integer pageSize;
	private Integer pageNo;
	private Integer total;
	private List<T> data;
	
	
	
	
	public PageEntity() {
		super();
	}
	
	public PageEntity(Integer pageSize, Integer pageNo, Integer total, List<T> data) {
		super();
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.total = total;
		this.data = data;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
