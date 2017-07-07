package com.wwg.dto;

import com.wwg.util.Page;

public class PageDto {
	
	private int pageNum;
	
	private int pageSize;

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
	
	public Page buildPage() {
		return new Page(pageNum, pageSize);
	}
	
}
