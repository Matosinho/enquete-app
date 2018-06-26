package br.com.ufba.model;

import java.sql.Date;
import java.util.Set;

public class Enquete {

	private Set<Pergunta> perguntas;
	private int id;
	private String assunto;
	private Date dataInicio;
	private Date dataFim;
	private String titulo;
	
	public Set<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(Set<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
