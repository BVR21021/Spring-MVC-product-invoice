package com.venky;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	@RequestMapping("/req1")
	public String result(@RequestParam int no, @RequestParam String itemName,@RequestParam int quantity,@RequestParam int cost,ModelMap m) {
		m.put("key1",no+":Item Number");
		m.put("key2",itemName+":Item Name");
		m.put("key3",quantity+":Item Quantity");
		m.put("key4",cost+":Item Cost");
		double total=cost*quantity;
		m.put("key5",total +":Total Bill Amount is");
		return "result";
	}
}
