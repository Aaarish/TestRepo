package com.example.demo.vo;

import com.example.demo.entity.Operator;

public class ResponseTemplateVO {
	private Operator operator;
	private OS os;
	
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public OS getOs() {
		return os;
	}
	public void setOs(OS os) {
		this.os = os;
	}
	
	@Override
	public String toString() {
		return "ResponseTemplateVO [operator=" + operator + ", os=" + os + "]";
	}
}
