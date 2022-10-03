package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.OperatorService;
import com.example.demo.vo.ResponseTemplateVO;


@RestController
@RequestMapping("operators")
public class OperatorController {
	@Autowired
	OperatorService service;
	
	@GetMapping("{id}")
	public ResponseTemplateVO getOperatorWithOS(@PathVariable int id) {
		return service.getOperatorWithOS(id);
	}
}
