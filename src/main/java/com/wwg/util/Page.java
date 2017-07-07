package com.wwg.util;

import java.io.Serializable;

public class Page implements Serializable {
	
	private static final long serialVersionUID = 3838946215137840325L;

	private Integer pageNum;

	private Integer pageSize;
	
	public Page() {
		
	}
	
	public Page(int pageNum, int pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}
	
	public static Page buildPage(int pageNum, int pageSize) {
		return new Page(pageNum, pageSize);
	}
	
	public static Page buildPage() {
		return new Page(1, 10);
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
