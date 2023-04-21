package com.multi.mvc11;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//스프링에 dao는 싱글톤으로 하나만 만들어서 사용한다고 설정해야함
@Component
public class MemberDAO3 {// 테이블당 하나씩

	@Autowired
	SqlSessionTemplate my;

	public void delete(String id) {
		int result = my.delete("member.del", id);
		System.out.println(result);
	}

	public void update(MemberVO bag) {
		int result = my.update("member.up", bag);
		System.out.println(result);
	}

	public void insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		System.out.println(result);
	}

	public MemberVO one(String id) {
		MemberVO bag = my.selectOne("member.one", id);
		return bag;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = my.selectList("member.all");
		//row하나당 어떤 vo에 넣을지만 지정하면 my.selectList()를 호출한 경우에는 myBatis가 list vo가 잔뜩 들어간 List로 만들어준다.
		System.out.println(list.size());
		return list;
	}

}