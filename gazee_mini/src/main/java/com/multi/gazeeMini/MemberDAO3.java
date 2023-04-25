package com.multi.gazeeMini;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//스프링에 dao는 싱글톤으로 하나만 만들어서 사용한다고 설정해야함
@Component
public class MemberDAO3 {// 테이블당 하나씩

	@Autowired
	SqlSessionTemplate my;


	public void upseed(MemberVO bag) {
		int result = my.update("member.upseed", bag);
		System.out.println(result);
	}

	public MemberVO seedcheck(String nickname) {
		MemberVO bag = my.selectOne("member.seedcheck", nickname);
		return bag;
	}
	


}