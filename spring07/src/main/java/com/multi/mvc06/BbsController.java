package com.multi.mvc06;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class BbsController {
	@Autowired
	BbsDAO dao;// 전역변수(글로벌변수)
	@Autowired
	ReplyDAO dao2;// 전역변수(글로벌변수)

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
		// 메서드의 입력변수(파라메터)로 변수를
		// 선언해두면, 컨트롤러내의 메서드내에서는
		// 1)bag을 만들어서
		// 2)클라이언트로 부터 전달된 데이터도 받아줌.
		// 3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);// 주소를 봤는데 저장할때마다 vo와 dao가 매번다른 주소에 만들어짐
		// 싱글톤을 사용해야됨
		// 2가지 방법으로 할 수 있음
		// 어노테이션@(표시)방법, xml방법 dao에서 씀
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
		//bbs상세페이지 만들때, replydao를 가져와야함
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list",list);
		model.addAttribute("bag", bag);
	}
	@RequestMapping("one6.multi")
	public void one6(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
	

	@RequestMapping("list2.multi")
	public void list(Model model) {

		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);

	}
	
	@RequestMapping("list5.multi")
	public void list5(Model model) {

		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);

	}

	// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8

}
