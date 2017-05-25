package com.algorithms.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = -3522664829518476324L;
	
	private String name;
	private static Singleton instance;
	
	private Singleton (){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Singleton getInstance(){
		if(instance==null){
			synchronized (Singleton.class) {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	
	private Object readResolve(){
		return getInstance();
		
	}
	
}
