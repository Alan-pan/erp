package com.zgjy.entity;

import java.util.List;

public class Pager<T> {
	private int total;//总共多少条数据
	private List<T>rows;//每一页显示的数据
	
	public Pager() {
		super();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Pager [total=" + total + ", rows=" + rows + "]";
	}
}
