package xadrez;

import mesajogo.Peca;
import mesajogo.Tabuleiro;

public class PecaXadrez extends Peca{

	private Cores cor;

	public PecaXadrez(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

}
