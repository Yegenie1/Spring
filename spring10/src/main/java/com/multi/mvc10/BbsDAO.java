package com.multi.mvc10;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용한다고 설정해야함
//2가지 방법으로 할 수 있음
//어노테이션@(표시)방법, xml방법
@Component //bbsdao를 싱글톤으로 만들어줌
public class BbsDAO {// 테이블당 하나씩==>crud완성하기
	
	@Autowired
	SqlSessionTemplate my;

//	public ArrayList<BbsVO> list() {
//		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
//
//		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
//		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미//bag만 넣겠다
//		
//		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
//
//		BbsVO bag = null;
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			// String url = "jdbc:mysql://localhost:3306/multi";
//			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
//			String user = "root";
//			String password = "1234";
//			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
//			System.out.println("2. mySQL 연결 성공.");
//			// 컨트롤 + 쉬프트 + f : 코드 자동 정리!
//
//			// ipaddress ==> InetAddress
//			// String url = "http://wwww.naver.com";
//			// URL u = new URL(url);
//			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
//			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
//			// SQL부품으로 만들어주어야 함.
//			// PreparedStatement가 SQL부품!!
//
//			String sql = "select * from bbs";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			// 삭제!!!! ps.setString(1, id);
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
//
//			rs = ps.executeQuery(); // select문 전송시
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
//				// true이면 있다라는 의미, false이면 없다라는 의미
//				// 1. 검색겨로가가 있으면,
//				// System.out.println("검색결과 있음. 성공.");
//				// 2. 각 컬럼에서 값들을 꺼내오자.
//				int NO = rs.getInt(1); // id
//				String title = rs.getString(2); // pw
//				String content = rs.getString(3); // name
//				String writer = rs.getString(4); // tel
//				System.out.println(NO + " " + title + " " + content + " " + writer);
//				// 검색결과를 검색화면 UI부분으로 주어야함
//				// 가방만들기
//				bag = new BbsVO();
//				bag.setNo(NO);
//				bag.setTitle(title);
//				bag.setContent(content);
//				bag.setWriter(writer);
//
//				// 4. list에 bag을 추가해주자.
//				list.add(bag);
//			}
//			// System.out.println(result);
//			ps.close();
//			rs.close();
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		// return id, pw, name, tel은 XXXXX!
//		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
//		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
//		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
//		return list;
//
//	}
//
	public BbsVO one(int no) {
		BbsVO bag = my.selectOne("bbs.one", no);
		return bag;
	}

	public int delete(int no) {
		System.out.println(my+">>>>>>>");
		int result = my.delete("bbs.del",no);
		return result;
	}

	public int update(BbsVO bag) {
		System.out.println(my+">>>>>>>");
		int result = my.update("bbs.up",bag);
		return result;
	}

	public int insert(BbsVO bag) {
		System.out.println(my+">>>>>>>");
		int result = my.insert("bbs.create",bag);
		return result;

	}

}
