package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class BookController {
	@Autowired
	BookDAO dao;// 전역변수(글로벌변수)

	@RequestMapping("insert3.multi")
	public void insert(BookDTO bag) {

		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);// 주소를 봤는데 저장할때마다 vo와 dao가 매번다른 주소에 만들어짐
		// 싱글톤을 사용해야됨
		// 2가지 방법으로 할 수 있음
		// 어노테이션@(표시)방법, xml방법 dao에서 씀
		dao.insert(bag);

	}

	@RequestMapping("delete3.multi")
	public void delete(int id) {

		System.out.println("delete요청됨.");
		System.out.println(id);
		System.out.println(dao);// 주소를 봤는데 저장할때마다 vo와 dao가 매번다른 주소에 만들어짐

		dao.delete(id);

	}

	@RequestMapping("update3.multi")
	public void update(BookDTO bag) {

		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println(dao);// 주소를 봤는데 저장할때마다 vo와 dao가 매번다른 주소에 만들어짐
		// 싱글톤을 사용해야됨
		// 2가지 방법으로 할 수 있음
		// 어노테이션@(표시)방법, xml방법 dao에서 씀
		dao.update(bag);

	}

	@RequestMapping("one3.multi")
	public void one(int id, Model model) {

		System.out.println("one요청됨.");
		System.out.println(id);
		System.out.println(dao);// 주소를 봤는데 저장할때마다 vo와 dao가 매번다른 주소에 만들어짐
		// 싱글톤을 사용해야됨
		// 2가지 방법으로 할 수 있음
		// 어노테이션@(표시)방법, xml방법 dao에서 씀
		BookDTO bag = dao.one(id);
		// bag에 검색결과 다 들어있음
		// vies아래 one.jsp로 쓸 수 있도록 설정해주어야함
		model.addAttribute("bag", bag);

	}

}
