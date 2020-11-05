package br.com.minoru.web.formulario.dto;

import lombok.Data;

@Data
public class NewsletterRequest {

	private String senha = "";
	private String email = "";
}
