package br.com.minoru.web.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloResource {
	
	@GetMapping("/")
	public String getHello(String name, Model model	) {
		System.out.println("Teste");
		return "hello";
		
	}
}
