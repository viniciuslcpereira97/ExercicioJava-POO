package com.exercicios.poo.vanderson;

public class Candidatos {
	
	public String nome;
	public int numeroDeVotos;
	public double percentual;
	
	public double getPercentual() {
		return percentual;
	}



	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}



	public Candidatos(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getNumeroDeVotos() {
		return this.numeroDeVotos;
	}



	public void setNumeroDeVotos(int numeroDeVotos) {
		this.numeroDeVotos = numeroDeVotos;
	}

}
