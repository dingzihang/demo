package com.dzh.itchat4j.wechat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzh.itchat4j.wechat.utils.QRcodeUtil;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Value("#{config['local.disk.path']}")
	private String qrPath; 
	
	@RequestMapping(value="/getQR")
	@ResponseBody
    public String getQR(){
		return "";
	}
	
}
