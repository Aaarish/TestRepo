package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Operator;
import com.example.demo.repository.OperatorRepo;
import com.example.demo.vo.OS;
import com.example.demo.vo.ResponseTemplateVO;


@Service
public class OperatorService {
	@Autowired
	OperatorRepo repo;

	@Autowired
	RestTemplate restTemplate;
	
	public ResponseTemplateVO getOperatorWithOS(int id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		
		Operator operator = repo.findById(id).orElse(null);
		OS os = restTemplate.getForObject("http://OS-Service/os/" + operator.getOsid(), OS.class);
		
		vo.setOperator(operator);
		vo.setOs(os);
		
		return vo;
	}
}
