package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operators")
public class Operator {
	@Id
	private int opid;
	private String opname;
	private int osid;
	
	public int getOpid() {
		return opid;
	}
	public void setOpid(int opid) {
		this.opid = opid;
	}
	public String getOpname() {
		return opname;
	}
	public void setOpname(String opname) {
		this.opname = opname;
	}
	public int getOsid() {
		return osid;
	}
	public void setOsid(int osid) {
		this.osid = osid;
	}
	
	@Override
	public String toString() {
		return "Operator [opid=" + opid + ", opname=" + opname + ", osid=" + osid + "]";
	}
}
