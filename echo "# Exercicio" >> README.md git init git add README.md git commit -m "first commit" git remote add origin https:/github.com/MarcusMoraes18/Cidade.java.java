package vai;

import java.util.Scanner;

public class Exercicio_nome {

	public static void main(String[] args) {
	
		
	Scanner Teclado = new Scanner(System.in);	
	Scanner local = new Scanner(System.in);
	String nome;
	int idade;
	String Cidade;
	
	System.out.println("Digite seu nome");
	nome = Teclado.nextLine();
	System.out.println("Bem Vindo: "+nome);
	System.out.println("Digite sua idade: ");
	idade = Teclado.nextInt();
	System.out.println("Digite sua cidade");	
	Cidade = local.nextLine();	
	
	System.out.println("Seu nome é: "+nome);	
	System.out.println("Sua idade é: "+idade);	
	System.out.println("Você mora em: "+Cidade);	

	
	
	
	}

}
