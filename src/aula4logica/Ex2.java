package aula4logica;
public class Ex2 {
    public static void main(String[] args) {
        //ENTRADA
        System.err.println("SOMA DOS 10000 TERMOS");
        int soma = 0;
        //PROCESSAMENTO
        
        for (int i = 1; i < 20000; i = i + 2){
            System.out.print(i +" + ");
            soma = soma + i;
           
        }
        System.out.println("");
        System.out.println("Soma: " + soma);
    } 
}
