package com.example.demo.vo;


public class OS {
	private int osid;
	private String osname;
	
	public int getOsid() {
		return osid;
	}
	public void setOsid(int osid) {
		this.osid = osid;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	
	@Override
	public String toString() {
		return "OS [osid=" + osid + ", osname=" + osname + "]";
	}
}
