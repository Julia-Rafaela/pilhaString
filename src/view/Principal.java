package view;

import java.util.Random;

import br.com.juliarafaela.pilhaint.Pilha;
public class Principal {
	
public static void main(String args[]) {
		Pilha p = new Pilha();
		boolean vazia = p.isEmpty();
		System.out.println(vazia);
		
		int totalNos = (int)((Math.random()* 10) + 1);
		for(int i = 0; i < totalNos; i++) {  //empilha 
			String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			Random r = new Random();
			String e = String.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
			p.push(e);
			
		}
		
		int tamanho = p.size();
		System.out.println("tamanho da pilha = " +tamanho);
		
		
		String top;
		try {
			top = p.top();
			System.out.println("top = " +top);
		}catch(Exception e ){
			e.printStackTrace();
			
		}
		
		
		
		for(int i = 0; i < totalNos; i++) {  //desempilha
			try {
				String valor =  p.pop();
				System.out.println("pop = " +valor);
			}catch (Exception e) {
				e.printStackTrace();
			}
			vazia = p.isEmpty();
			System.out.println("vazia = " +vazia);
		}
		
		try {
		p.pop();  //desempilhar em uma pilha vazia
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//p.push(1);
		//p.push(2);
		//p.push(3);
		
	}

}

