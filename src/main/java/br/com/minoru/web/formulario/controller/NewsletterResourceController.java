package br.com.minoru.web.formulario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.minoru.web.formulario.dto.NewsletterRequest;
import br.com.minoru.web.formulario.model.Carro;
import br.com.minoru.web.formulario.repository.CarroRepository;
import br.com.minoru.web.formulario.service.EnderecoService;

@Controller
public class NewsletterResourceController {
	
	@Autowired
	private EnderecoService service;
	
	@Autowired
	private CarroRepository repository;  
	
	
	@PostMapping(value = "/teste",
				consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
				produces = MediaType.TEXT_HTML_VALUE)
	public String postNewsletter(NewsletterRequest newsletterRequest, Model model) {
		model.addAttribute("resultado", newsletterRequest);
		//model.addAttribute(newsletterRequest);
		return "newsletterResult";
	}
	
	 @GetMapping(value = "/sistemaEscolar")
	    public String homeInit(Model model) {
	        
		 Optional<Carro> resultado = repository.findById(1);
		 System.out.println(resultado.orElse(null));
		 return "sistemaEscolar";
	 }
	 
	 @GetMapping(value = "/inserirAluno")
	    public String cadastrarAluno(Model model) {
	     List<String> listaDeEstados = this.service.getEstados();   
		 model.addAttribute("listaDeEstados", listaDeEstados);
	     return "inserirAluno";
	 }
	 
	 
}
