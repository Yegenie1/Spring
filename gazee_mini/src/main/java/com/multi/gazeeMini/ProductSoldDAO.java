package com.multi.gazeeMini;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductSoldDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public List<ProductSoldVO> selltb(String seller) {
		List<ProductSoldVO> list = my.selectList("productsold.selltb",seller);
		System.out.println(list.size());
		return list;
	}
	
	public List<ProductSoldVO> buytb(String buyer) {
		List<ProductSoldVO> list = my.selectList("productsold.buytb",buyer);
		System.out.println(list.size());
		return list;
	}
}
