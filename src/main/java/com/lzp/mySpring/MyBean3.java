package com.lzp.mySpring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class MyBean3 {
	 private Integer simpleProperty;

	public Integer getSimpleProperty() {
		return simpleProperty;
	}

	public void setSimpleProperty(Integer simpleProperty) {
		this.simpleProperty = simpleProperty;
	}
	private MyBean myBean;

	public MyBean getMyBean() {
		return myBean;
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}
	
	private ArrayList<MyBean> list;
	private HashMap<String,MyBean> map;
	public ArrayList<MyBean> getList() {
		return list;
	}

	public void setList(ArrayList<MyBean> list) {
		this.list = list;
	}

	public HashMap<String, MyBean> getMap() {
		return map;
	}

	public void setMap(HashMap<String, MyBean> map) {
		this.map = map;
	}

	public HashSet<MyBean> getSet() {
		return set;
	}

	public void setSet(HashSet<MyBean> set) {
		this.set = set;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	private HashSet<MyBean> set;
	private Properties properties;
	
}

