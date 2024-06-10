package application;

import mesajogo.Tabuleiro;
import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;

public class Jogo {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.printTabuleiro(partidaXadrez.getPecas());
		

	}

}
