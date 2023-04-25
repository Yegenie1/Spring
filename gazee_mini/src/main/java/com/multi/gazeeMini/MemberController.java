package com.multi.gazeeMini;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! dependency
public class MemberController {
	
	@Autowired
	MemberDAO3 dao; //전역변수(글로벌 변수) 
	
	@RequestMapping("upseed")
	public void upseed(MemberVO bag, Model model) {
		System.out.println(bag);
		dao.upseed(bag);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("seedcheck")
	public void seedcheck(String nickname, Model model) {
		System.out.println(nickname);
		MemberVO bag = dao.seedcheck(nickname);
		model.addAttribute("bag", bag);
	}
	
	
	
	
}