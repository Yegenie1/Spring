package com.multi.mvc08;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	@RequestMapping("json1")
	@ResponseBody//요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}
	
	@RequestMapping("json2")
	@ResponseBody//요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");		
		MemberVO bag2 = new MemberVO();
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}
	
	@RequestMapping("json3")
	@ResponseBody 
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setContent("hahahaha");
		return bag;  
	}
	
	@RequestMapping("json4")
	@ResponseBody 
	public ArrayList<BbsVO> json4() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setContent("hahahaha");
		
		BbsVO bag2 = new BbsVO();
		bag2.setNo(2);
		bag2.setContent("smile");
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;  
	}
	
	@RequestMapping("map")
	@ResponseBody 
	public RestVO map() {
		RestVO bag = new RestVO();
		bag.setDestination("코엑스");;
		bag.setLat(37.5117);
		bag.setLon(127.0592);
		return bag;  
	}
}
