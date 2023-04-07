package com.multi.mvc10;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 스프링에서 제어하는 역할로 등록!
public class BbsController {
	@Autowired
	BbsDAO dao;// 전역변수(글로벌변수)

	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색

	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될지를
	// 써주어야 한다.
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	}

	@RequestMapping("update2.multi")
	public void update(BbsVO bag, Model model) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		model.addAttribute("bag",bag);
		dao.update(bag);
	}

	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}

	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
	
//	@RequestMapping("one22.multi")
//	@ResponseBody//views로 넘어가지 않고, return값이 bag데이터를 json으로 만들어서 클라이언트로 전송
//	//클라이언트 브라우저에서는 success : funtion(x)
//	//결과가 함수의 입력변수인 x로 들어간다
//	//public BbsVO one22(int no) {
//	//	System.out.println("one요청됨.");
//	//	System.out.println(no);
//		//BbsVO bag = dao.one(no);
//		//System.out.println(bag);
//		//return bag;
//	//}
//	@RequestMapping("one6.multi")
//	public void one6(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		model.addAttribute("bag", bag);
//	}
//	
//
//	@RequestMapping("list2.multi")
//	public void list(Model model) {
//
//		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size());
//		model.addAttribute("list", list);
//
//	}
//	
//	@RequestMapping("list5.multi")
//	public void list5(Model model) {
//
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size());
//		model.addAttribute("list", list);
//
//	}
//	@RequestMapping("list55.multi")
//	@ResponseBody
//	public ArrayList<BbsVO> list55(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size());
//		return list;
//	}
//
//	// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
//
}
