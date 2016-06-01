package com.choa.s4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/member/*")
public class MemberController {

	@RequestMapping(value="login" , method=RequestMethod.GET)
	public void login(){
		System.out.println("로그인 폼 이동..");
		
		
	} //loginForm이동
	
	@RequestMapping(value="loginProcess", method=RequestMethod.POST) 
	public void login(Model modle){
		MemberDAO mdao = new MemberDAO();
		MemberDTO mdto = new MemberDTO();
		String path="";
		mdto = mdao.login(mdto);
		if(mdto!=null){
			
			path="redirect:";
			
		}else{
			
			
			
		}
		
		System.out.println(mdto);
	}
	
}