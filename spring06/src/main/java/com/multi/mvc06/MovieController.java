package com.multi.mvc06;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//컨트롤러로 등록, 싱글톤 생성
public class MovieController {
	@RequestMapping("movie")
	public void com(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo",vo);
	}
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		list.add("참외");
		list.add("포도");
		list.add("수박");
		model.addAttribute("list",list);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("제주도");
		list.add("부산");
		list.add("다낭");
		list.add("미국");
		list.add("싱가포르");
		model.addAttribute("list",list);
	}

}
