package com.multi.mvc11;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! dependency
public class MemberController {
	
	@Autowired
	//MemberDAO의 싱글톤 객체 ram의 어디에 있는지 찾아서 
	//그 주소를 아래 변수에 넣어주세요.
	MemberDAO3 dao; //전역변수(글로벌 변수) 
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
//	@RequestMapping("login")
//	public String login(MemberVO bag, HttpSession session) {
//		System.out.println(bag);
//		//dao를 이용해서 db처리할 예정.
//		//views아래로 넘어가게 되어있음.
//		//views아래 login.jsp를 호출하게 됨.
//		int result = dao.login(bag);//1, 0
//		if(result == 1) {
//			//로그인이 성공하면, 세션을 잡아두자.!!!
//			session.setAttribute("id", bag.getId());
//			return "ok"; //views아래 파일이름.jsp
//		}else {
//			//views아래가 아니고, webapp아래
//			//member.jsp로 가고 싶은 경우!
//			return "redirect:member.jsp";
//		}
//	}

	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println(id);
		MemberVO bag = dao.one(id);
		model.addAttribute("bag", bag);
		//bag에 검색결과 다 들어있음.
		//views아래 one.jsp로 쓸 수 있도록 설정해주어야 함.
		//views까지 전달할 속성으로 추가해주세요. 
	}
	

	@RequestMapping("list")
	public void list(Model model) {
		List<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}