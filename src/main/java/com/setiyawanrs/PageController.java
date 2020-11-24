package com.setiyawanrs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	//Mapping ke classpath main/resource/template/halo.html
	@RequestMapping("/halo")
	public String index() {
		return "halo";
	}
	
	//Mapping ke classpath main/resource/template/salam.html
	@RequestMapping("/salam")
	public String salam(@RequestParam(value = "nama") String nama, Model model) {
		model.addAttribute("nama", nama);
		return "salam";
	}
}
