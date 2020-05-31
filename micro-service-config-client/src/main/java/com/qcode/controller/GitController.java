package com.qcode.controller;

import com.qcode.config.GitAutoRefreshConfig;
import com.qcode.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GitController {
	@Autowired
	private GitConfig gitConfig;

	@Autowired
	private GitAutoRefreshConfig gitAutoRefreshConfig;

	@GetMapping("/show")
	public Object show(){
		gitConfig.getEnv();
		return gitConfig;
	}


	@GetMapping("/autoShow")
	public Object autoShow(){
		return gitAutoRefreshConfig;
	}
}
