package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	// http://서버IP:port/context명/서블릿매핑/요청맵핑값 
	// 요청 url?  http://localhost:8090/app/list
	@RequestMapping("/list")
	public String list() {
		logger.info("logger:MainController:{}", "/list 요청");	
		return "hello"; // jsp 정보
	}
	// http://서버IP:port/context명/서블릿매핑/요청맵핑값 
    // 요청 url?  http://localhost:8090/app/add
	@RequestMapping("/add")
	public String add() {
		logger.info("logger:MainController:{}", "/add 요청");	
		return "hello";// jsp 정보
	}
	//깃허브용 주석이라고 생각하면 될듯 aadsfakl
	
}
