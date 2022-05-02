package com.example.demo;

public class Profile{
    public String name;
    public String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", id=" + id + "]";
	}
	
    
}
