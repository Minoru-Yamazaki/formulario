package br.com.minoru.web.formulario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "carros")//tabela
public class Carro {
	@Id //chave primária
	private int id;
	private String nome;
	private String modelo;
	private String motor;
	private String fabricante;
	private String cor;
	@Column(name = "anoFabricacao")
	private int anoFabricacao;
	private int anoModelo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	@Override
	public String toString() {
		return "Carro [id=" + id + ", nome=" + nome + ", modelo=" + modelo + ", motor=" + motor + ", fabricante="
				+ fabricante + ", cor=" + cor + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + "]";
	}

	
}


