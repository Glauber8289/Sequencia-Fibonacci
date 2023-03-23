package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner leitor = new Scanner(System.in);
	       System.out.println("Digite um numero para iniciarmos a sequencia Fibonacci");
	        int N = leitor.nextInt();
	        int proximo, anterior = 0, atual = 1;
	        for (int i = 1; i <= N; i++) {
	          if (i == N) System.out.println(anterior);
	       
	     //TODO: Implemente a condição ideal para que possamos obter os valores solicitados:
	        	else System.out.print(anterior + " ");
	        	proximo = anterior + atual;
	        	anterior =atual ; 
	        	atual = proximo ; 
	        }
	    }

	}


