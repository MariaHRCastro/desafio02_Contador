package app;

import java.util.Scanner;

import excecoes.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = sc.nextInt();
		
		try {
			contagem(parametroUm, parametroDois);
			
		}catch(ParametrosInvalidosException e) {
			System.out.println("ERRO: "+ e.getMessage());
		}
		
		sc.close();
		
	}
	
	static void contagem(int n1, int n2){
	
			int diferenca = n2 - n1;
			
			if(diferenca<=0) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}
			else {
				for(int i=1;i<=diferenca;i++) {
					System.out.println("Imprimindo o número "+i);
				}
			}
	
		}


}
