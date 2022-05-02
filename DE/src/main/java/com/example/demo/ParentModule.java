package com.example.demo;

public class ParentModule{
    public String api_name;
    public String id;
	public String getApi_name() {
		return api_name;
	}
	public void setApi_name(String api_name) {
		this.api_name = api_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ParentModule [api_name=" + api_name + ", id=" + id + "]";
	}
	

    
}
