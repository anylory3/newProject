package com.spring.board.dto;

public class CommonDto {
	private String pagination;
	private String functionName;
	private int currentPage;
	private int countPerList;
	private int countPerPage;
	private int totalListCount;
	private int limit;
	private int offset;
	
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String getPagination() {
		return pagination;
	}
	public void setPagination(String pagination) {
		this.pagination = pagination;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCountPerList() {
		return countPerList;
	}
	public void setCountPerList(int countPerList) {
		this.countPerList = countPerList;
	}
	public int getCountPerPage() {
		return countPerPage;
	}
	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}
	public int getTotalListCount() {
		return totalListCount;
	}
	public void setTotalListCount(int totalListCount) {
		this.totalListCount = totalListCount;
	}

}
