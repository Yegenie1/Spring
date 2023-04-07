package com.multi.mvc10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookDTO bag) {
		int result= my.insert("book.create",bag);
		return result;

	}
	
	public int delete(int id) {
		int result= my.delete("book.delete", id);
		return result;
	}

	public int update(BookDTO bag) {
		int result = my.update("book.update",bag);
		return result;

	}
	
	public BookDTO one(int id) {
		BookDTO bag = my.selectOne("book.one", id);

		return bag;
	}
	
	public List<BookDTO> list() {
		List<BookDTO> list = my.selectList("book.all");
		return list;
	}

}
