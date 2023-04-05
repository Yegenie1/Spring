package com.multi.mvc08;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class MusicController {
	@Autowired
	MusicDAO dao;// 전역변수(글로벌변수)

	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색

	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될지를
	// 써주어야 한다.
	@RequestMapping("insert4.multi")
	public void insert(MusicVO bag, Model model) {
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
		model.addAttribute("bag", bag);

	}

	@RequestMapping("update4.multi")
	public void update(MusicVO bag, Model model) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("delete4.multi")
	public void delete(int id, Model model) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
		model.addAttribute("id", id);
	}

	@RequestMapping("one4.multi")
	public void one(int id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MusicVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("one7.multi")
	public void one7(int id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MusicVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("list4.multi")
	public void list(Model model) {

		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		ArrayList<MusicVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);

	}
	
	@RequestMapping("list8.multi")
	public void list8(Model model) {

		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		ArrayList<MusicVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);

	}

	// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8

}
