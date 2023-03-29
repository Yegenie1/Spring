package com.multi.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;
@Component
public class BookDAO {
	public int insert(BookDTO bag) {
		int result = 0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!

			// (String id,String pw,String name,String tel)
			String sql = "insert into book( name, url, img) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			// R이라는 언어 빼고 인덱스는 0부터 시작
			// 유일하게 db는 인덱스가 1부터 시작
			//ps.setInt(1, bag.getId());
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());
			// ==>insert into hr.member values ('a','a','a','a')
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println("도서 추가 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}
	
	public int delete(int id) {
		int result = 0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");
			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!
			String sql = "delete from book where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setInt(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println("게시물 삭제 성공");
			}

			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int update(BookDTO bag) {
		int result = 0;

		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!
			String sql = "update book set name=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setString(1, bag.getName());
			ps.setInt(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();// insert, update, delete문만 sql문 실행결과가 int
			if (result >= 1) {
				System.out.println("게시물수정 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;

	}
	
	public BookDTO one(int id) {

		ResultSet rs = null;

		BookDTO bag = null;

		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!
			String sql = "select * from book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setInt(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();// select의 결과는 항목명+row테이블==>executeQuery
			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				id = rs.getInt(1); // id
				String name = rs.getString(2); 
				String url1 = rs.getString(3); 
				String img = rs.getString(4); 
				System.out.println(id + " " + name + " " +url1 + " " + img);
				// 검색결과를 검색화면 UI부분으로 주어야함
				// 가방만들기
				bag = new BookDTO();
				bag.setId(id);
				bag.setName(name);
				bag.setUrl(url1);
				bag.setImg(img);

			} else {
				System.out.println("검색결과 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

}
