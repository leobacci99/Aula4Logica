package aula4logica;

import java.util.Scanner;
import sun.security.util.Length;

public class Aula4Logica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //ENTRADA
        System.out.print("Numero: ");
        String n = leitor.nextLine();
        
        //PROCESSAMENTO
        int soma = 0;
        for (int i = 0; i < n.length(); i++) {
            String d = n.substring(i,i+1);
            int di = Integer.parseInt( d );
            soma = soma + di;
        }
        //SAIDA
        System.out.println("Soma: " + soma);
        
    }
    
}
