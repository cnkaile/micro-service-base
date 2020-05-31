package com.qcode.controller;

import com.qcode.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitDataController {
	@Value("${data.env}")
	private String env;
	@Value("${data.user.username}")
	private String userName;
	@Value("${data.user.password}")
	private String passWord;

	@Autowired
	private GitConfig gitConfig;

	@GetMapping("/infoValue")
	public String infoValue(){
		return env + " - " + userName + " - " + passWord;
	}

	@GetMapping("/infoConf")
	public String infoConf(){
		return gitConfig.toString();
	}



}
