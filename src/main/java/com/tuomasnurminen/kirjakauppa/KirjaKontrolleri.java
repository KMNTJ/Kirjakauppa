package com.tuomasnurminen.kirjakauppa;

import com.tuomasnurminen.beans.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class KirjaKontrolleri {

	
	@RequestMapping("/index")
	public String index(Model model){
		return "index";
	}
}
