package com.projetoaula2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClasseController {

	@GetMapping("/")
	public String index() {

	return "index.html";
}
	@GetMapping("/sobre")
	public String sobre() {
		return "sobre.html";
	}
}