package modal.board;

import java.util.Arrays;
import java.util.Scanner;




public class Tabuleiro {

	
	private int[][] tabuleiro = new int[3][3];

	
	
	public Tabuleiro() {
		for(int i=0;i< 3;i++) {
			for(int j =0;j<3;j++) {
				tabuleiro[i][j] = 0;
			}
		}
	}
	
	public void mostraJogo() {
		for(int i=0; i<3;i++) {
			for(int j =0;j<3;j++ ) {
				System.out.println(tabuleiro[i][j] + "");
			}
			System.out.println();
		}
	}
	
	
	
	public int verificaVenc() {
		for(int i=0; i<3;i++) {
			if(tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2])
				if(tabuleiro[i][0] != 0) {
					return tabuleiro[i][0];
				}
		}for(int j=0;j<3;j++) {
			if(tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[0][j] == tabuleiro[2][j] ) {
				if(tabuleiro[0][j] != 0) {
					return tabuleiro[0][j];
				}
			}
			
		}if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2] && (tabuleiro[0][0] != 0)) {
			{
				return tabuleiro[0][0];
			}
		}if(tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[0][2] == tabuleiro[2][2] && (tabuleiro[0][2] != 0)) {
			 {
				return tabuleiro[0][2];
			}
		}
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if(tabuleiro[i][j] == 0) return 0;
			}
			
		}
		return 3;
	}
	
	public boolean efetutuaJogada(int jogador,int linha, int coluna) {
		if((linha < 0) || (linha > 2)) return false;
		if((coluna <0) || (coluna > 2)) return false;
		if(tabuleiro[linha][coluna] != 0) return false;
		tabuleiro[linha][coluna] = jogador; return  true;
	}
	

	
	
	
	
	
}
