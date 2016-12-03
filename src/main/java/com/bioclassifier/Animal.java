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
	
	private boolean verify(String s, List<String> l){
		for(String r : l){
			if(r.equals(s)){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean getHabitat(String habitat) {
		return verify(habitat, this.habitat);
	}
	public void setHabitat(String habitat) {
		this.habitat.add(habitat);
	}
	
	public boolean getRevestimento(String revestimento) {
		return verify(revestimento, this.revestimento);
	}
	public void setRevestimento(String revestimento) {
		this.revestimento.add(revestimento);
	}
	
	public boolean getLocomocao(String locomocao) {
		return verify(locomocao, this.locomocao);
	}
	public void setLocomocao(String locomocao) {
		this.locomocao.add(locomocao);
	}
	
	public boolean getReproducao(String reproducao) {
		return verify(reproducao, this.reproducao);
	}
	public void setReproducao(String reproducao) {
		this.reproducao.add(reproducao);
	}
	
	public boolean getAlimentacao(String alimentacao) {
		return verify(alimentacao, this.alimentacao);
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao.add(alimentacao);
	}
	
	public boolean getRespiracao(String respiracao) {
		return verify(respiracao, this.respiracao);
	}
	public void setRespiracao(String respiracao) {
		this.respiracao.add(respiracao);
	}

	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
}
