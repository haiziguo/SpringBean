package com.lzp.mySpring;

public class MyBean2 {
	
	private MyBean myBean;
	
	public MyBean getMyBean() {
		return myBean;
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	private int intProperty;

	public int getIntProperty() {
		return intProperty;
	}

	public void setIntProperty(int intProperty) {
		this.intProperty = intProperty;
	}

	public MyBean2(int intProperty,MyBean myBean) {
		this.intProperty = intProperty;
		this.myBean=myBean;
		
	}
}
