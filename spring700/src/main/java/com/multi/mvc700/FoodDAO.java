package com.multi.mvc700;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FoodDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(FoodVO bag) {
		int result= my.insert("food.create",bag);
		return result;

	}
	
	public int delete(int no) {
		int result= my.delete("food.delete", no);
		return result;
	}

	public int update(FoodVO bag) {
		int result = my.update("food.update",bag);
		return result;

	}
	
	public FoodVO one(int no) {
		FoodVO bag = my.selectOne("food.one", no);

		return bag;
	}
	
	public List<FoodVO> list() {
		List<FoodVO> list = my.selectList("food.all");
		return list;
	}

}
