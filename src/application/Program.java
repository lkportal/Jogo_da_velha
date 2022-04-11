package application;

import java.util.Scanner;

import modal.board.Tabuleiro;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Tabuleiro tabuleiro = new Tabuleiro();
	
	
	int jogador = 1;
	int vencedor = tabuleiro.verificaVenc();
	tabuleiro.mostraJogo();
	
	while(vencedor == 0) {
		System.out.println("Jogador" + jogador);
		System.out.println("Lnha");
		int linha= sc.nextInt();
		System.out.println("coluna");
		int coluna = sc.nextInt();
		if(!tabuleiro.efetutuaJogada(jogador, linha-1, coluna-1))  System.out.println("jogada inválida ");
		else jogador = (jogador == 1)? 2 : 1;
		
		tabuleiro.mostraJogo();
		vencedor = tabuleiro.verificaVenc();
		
		switch(vencedor) {
		case 1 : System.out.println("Jogador 1 venceu ");
		break;
		case 2 : System.out.println("Jogador 2 venceu");
		break;
		case 3 : System.out.println("Empate");
		break;
		}
	}
	
	
	
	
		

	}

}
