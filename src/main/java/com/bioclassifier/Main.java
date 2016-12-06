package com.bioclassifier;

public class Main {

	public static void main(String[] args) {
		try {
            Leitura.obterDoTeclado(); //realiza leitura do teclado
//        	Teste.testarElementosTabela(); //testa automaticamente todos os exemplos de sala
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
}
