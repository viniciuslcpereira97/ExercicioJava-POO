package com.exercicios.poo.vanderson;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Urna {

	static ArrayList<Candidatos> candidato = new ArrayList<Candidatos>();

	public static void main(String[] args) {
		String[] candidatos = {"Thiago","Marco","Pedro","João","Branco","Nulo"};
		for(int i= 0; i < candidatos.length; i++){
			candidato.add(new Candidatos(candidatos[i]));
		}
		
		for(int i = 0 ; i < 5 ; i++){
			votos(getVoto());
		}
		
		situacaoAtual();
	}

	public static void votos(int voto) {
		switch (voto) {
			case 1:
				candidato.get(0).numeroDeVotos +=1;
				JOptionPane.showMessageDialog(null,
						"você votou no candidato " + candidato.get(0).getNome());
				break;
			case 2:
				candidato.get(1).numeroDeVotos += 1;
				JOptionPane.showMessageDialog(null,
						"você votou no candidato " + candidato.get(1).getNome());
				break;
			case 3:
				candidato.get(2).numeroDeVotos += 1;
				JOptionPane.showMessageDialog(null,
						"você votou no candidato " + candidato.get(2).getNome());
				break;
			case 4:
				candidato.get(3).numeroDeVotos += 1;
				JOptionPane.showMessageDialog(null,
						"você votou no candidato " + candidato.get(3).getNome());
				break;
			case 5:
				candidato.get(4).numeroDeVotos += 1;
				JOptionPane.showMessageDialog(null, "Voto branco!");
				break;
			default:
				candidato.get(5).numeroDeVotos += 1;
				JOptionPane.showMessageDialog(null, "Voto nulo!");
				break;

			}
	}
	
	public static int getVoto(){
	int voto;
	voto = Integer.parseInt(JOptionPane
			.showInputDialog("Em qual candidato deseja votar?"));
	return voto;
	}

	public static void situacaoAtual(){
		String mensagem = "";
		percentual();
		for(Candidatos i : candidato){
			mensagem += "candidato " + i.getNome() + ": " + i.getNumeroDeVotos() + " percentual de votos: " + i.getPercentual() + "\n";
		}
		mensagem += "numero total de votos: "; 
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static void percentual(){
		int total =0;
		for(Candidatos i : candidato){
			total+= i.getNumeroDeVotos();
		}
		for(Candidatos i : candidato){
			System.out.println(i.getNumeroDeVotos());
			i.setPercentual((i.getNumeroDeVotos() * total) /100);
		}
		
	}
	
}
