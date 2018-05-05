package com.controller;
import java.util.List;
import java.util.ArrayList;
public class HomeControl {
	private String name;
    private List<String> count;
	public HomeControl(String name, List<String> count) {
		super();
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}	
	public void display(){
		System.out.println("Hello"+name);
		for(String i:count){
			System.out.println("Thr integer is"+i);
		}
	}
}
