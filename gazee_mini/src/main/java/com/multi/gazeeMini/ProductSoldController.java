package com.multi.gazeeMini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductSoldController {

	@Autowired
	ProductSoldDAO dao;
	
	@RequestMapping("selltb")
	public void selltb(Model model,String seller) {
		List<ProductSoldVO> list = dao.selltb(seller);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("buytb")
	public void buytb(Model model,String buyer) {
		List<ProductSoldVO> list = dao.buytb(buyer);
		model.addAttribute("list", list);
	}
}
