package aula4logica;

public class Ex4 {

    public static void main(String[] args) {

        //ENTRADA
        System.err.println("SERIE DE LEIBNIZ");
        double soma = 0;
        double denomi = 1;
        double resul = 0;
        //PROCESSAMENTO

        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                soma = soma + (1 / denomi);
            } else {
                soma = soma - (1 / denomi);
            }
            denomi = denomi + 2;    
        }
        soma = soma * 4;
        System.out.println("Resultado: " + soma);

    }

}
