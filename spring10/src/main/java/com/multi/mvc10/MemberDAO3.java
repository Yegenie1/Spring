package com.multi.mvc10;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//스프링에 dao는 싱글톤으로 하나만 만들어서 사용한다고 설정해야함
@Component
public class MemberDAO3 {// 테이블당 하나씩

	@Autowired
	SqlSessionTemplate my;
	
	public int delete(String id) {
		int result = my.delete("member.del", id);
		return result;
	}
	
	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}
	
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		return result;
	}
	// 메서드를 만드는 것 ==> 정의(define)

	// 특정한 방법으로 실행하는 클래스(model, 방법)
//		public int login(MemberVO bag) {
//			return result;
//		}
	//
//		public ArrayList<MemberVO> list() {
//			return list;
//		}
	//
//		// 메서드를 만드는 것 ==> 메서드 정의(define)!
//		// 메서드를 정의했다고 실행되는 것은 아니다.!
//		// 메서드를 쓰는 것 ==> 메서드 호출(call)!
	
	
	
		public MemberVO one(String id) {
			MemberVO bag = my.selectOne("member.one", id);
			return bag;
		}
	
}