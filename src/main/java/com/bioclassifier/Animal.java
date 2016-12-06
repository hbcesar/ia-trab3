package com.bioclassifier;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private List<String> habitat = new ArrayList<String>();
	private List<String> revestimento = new ArrayList<String>();
	private List<String> locomocao = new ArrayList<String>();
	private List<String> reproducao = new ArrayList<String>();
	private List<String> alimentacao = new ArrayList<String>();
	private List<String> respiracao = new ArrayList<String>();
	private String grupo;
	
	//Cria animal adicionando primeiros itens
	public Animal(String habitat, String revestimento, String locomocao, String reproducao, String alimentacao,
			String respiracao) {
		super();
		this.habitat.add(habitat);
		this.revestimento.add(revestimento);
		this.locomocao.add(locomocao);
		this.reproducao.add(reproducao);
		this.alimentacao.add(alimentacao);
		this.respiracao.add(respiracao);
	}
	
	public Animal(){
		super();
	}
	
	//Todos os metodos abaixo checam se string existe na lista ou adicionam nova string a lista
	public boolean checkHabitat(String habitat) {
		return this.habitat.contains(habitat);
	}
	public void addHabitat(String habitat) {
		this.habitat.add(habitat);
	}
	
	public boolean checkRevestimento(String revestimento) {
		return this.revestimento.contains(revestimento);
	}
	public void addRevestimento(String revestimento) {
		this.revestimento.add(revestimento);
	}
	
	public boolean checkLocomocao(String locomocao) {
		return this.locomocao.contains(locomocao);
	}
	public void addLocomocao(String locomocao) {
		this.locomocao.add(locomocao);
	}
	
	public boolean checkReproducao(String reproducao) {
		return this.reproducao.contains(reproducao);
	}
	public void addReproducao(String reproducao) {
		this.reproducao.add(reproducao);
	}
	
	public boolean checkAlimentacao(String alimentacao) {
		return this.alimentacao.contains(alimentacao);
	}
	public void addAlimentacao(String alimentacao) {
		this.alimentacao.add(alimentacao);
	}
	
	public boolean checkRespiracao(String respiracao) {
		return this.respiracao.contains(respiracao);
	}
	public void addRespiracao(String respiracao) {
		this.respiracao.add(respiracao);
	}

	//Setters e getters de grupo
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
}
