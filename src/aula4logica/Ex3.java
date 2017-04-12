package aula4logica;
public class Ex3 {
    public static void main(String[] args) {

        //ENTRADA
        System.err.println("SOMA DOS 10000 TERMOS. PART 2");
        int soma = 0;
      
        //PROCESSAMENTO
        for (int i = 1; i < 20000; i = i + 2) {
            System.out.print("1/" + i + " + ");
            soma = soma  + i;
          
        }
        System.out.println("");
        System.out.println("Soma: 1/" + soma);


    }
    
}
