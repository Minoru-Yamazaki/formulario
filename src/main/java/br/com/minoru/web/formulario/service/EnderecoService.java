package br.com.minoru.web.formulario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service 
public class EnderecoService {

	
	public List<String> getEstados(){
		List<String> estados = new ArrayList<String>();
		estados.add("SP");
		estados.add("RJ");
		log.info("lista de estados {}", estados);
		return estados;
	}
}
