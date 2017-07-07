package com.wwg.dto;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wwg.util.Page;

public class PageRequest<T> {

	/**
	 * 页数
	 */
	private int pageNum;

	/**
	 * 每页数据条数
	 */
	private int pageSize;

	/**
	 * 总记录数
	 */
	private long total;

	/**
	 * 总页数
	 */
	private int pages;
	
	private List<T> list;
	
	public PageRequest(PageInfo<T> pageInfo) {
		this.pageNum = pageInfo.getPageNum()-1;
		this.pageSize = pageInfo.getPageSize();
		this.total = pageInfo.getTotal();
		this.pages = pageInfo.getPages();
		this.list = pageInfo.getList();
	}
	
	public PageRequest(List<T> list, Page page, long total) {
		this.pageNum = page.getPageNum();
		this.pageSize = page.getPageSize();
		this.total = total;
		this.pages = (int) Math.ceil((float)total / this.pageSize);
		this.list = list;
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

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
