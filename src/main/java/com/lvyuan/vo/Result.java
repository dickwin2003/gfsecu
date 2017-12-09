package com.lvyuan.vo;

import java.util.List;
import java.util.Map;

public class Result {
	private int ret;
	private int size;
	private Map data;
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Map getData() {
		return data;
	}
	public void setData(Map data) {
		this.data = data;
	}
	public Result(int ret, int size, Map data) {
		super();
		this.ret = ret;
		this.size = size;
		this.data = data;
	}
	
}
