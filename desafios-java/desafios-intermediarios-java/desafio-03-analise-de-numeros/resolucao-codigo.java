//  RESOLUÇÃO DESAFIO ANÁLISE DE NÚMEROS */
import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int qntPar = 0;
        int qntImpar = 0;
        int qntPositivo = 0;
        int qntNegativo = 0;

        for (leitor % 2 == 0) {
        	
        }
        System.out.println( qntPar + " par(es)");
        System.out.println( qntImpar + " impar(es)");
        System.out.println( qntPositivo + " positivo(s)");
        System.out.println( qntNegativo + " negativo(s)");
    }	
}
// RESOLUÇÃO DESAFIO ANÁLISE DE NÚMEROS END 


import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int qntPar = 0;
        int qntImpar = 0;
        int qntPositivo = 0;
        int qntNegativo = 0;
        
        while (leitor.hasNextInt()) {
            int entrada = leitor.nextInt();
            if (entrada % 2 == 0) qntPar++;
            if (entrada % 2 != 0) qntImpar++;
            if (entrada > 0) qntPositivo++;
            if (entrada < 0) qntNegativo++;
        }

        System.out.println( qntPar + " par(es)");
        System.out.println( qntImpar + " impar(es)");
        System.out.println( qntPositivo + " positivo(s)");
        System.out.println( qntNegativo + " negativo(s)");
    }	
}

