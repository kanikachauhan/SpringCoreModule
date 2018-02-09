package com.springcore.beans;

import java.util.Map;

public class SecondaryUser extends User{

	private int goodies;
	private Map<String,String> goodieTypeMap;
	public int getGoodies() {
		return goodies;
	}
	public void setGoodies(int goodies) {
		this.goodies = goodies;
	}
	public Map<String, String> getGoodieTypeMap() {
		return goodieTypeMap;
	}
	public void setGoodieTypeMap(Map<String, String> goodieTypeMap) {
		this.goodieTypeMap = goodieTypeMap;
	}
	
}
