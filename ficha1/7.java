/*
*Faça um programa que preencha um vetor com dez números reais, 
*calcule e mostre a quantidade de números negativos e a soma dos números positivos desse vetor.
*/
import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);
        int x = 10;
        double[] y = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Digite o numero " + (i + 1) + " ");
            y[i] = dados.nextDouble();
        }

        int quantidadeNegativos = contarNegativos(y);
        double somaPositivos = somarPositivos(y);

        System.out.println("Quantidade de numeros negativos: " + quantidadeNegativos);
        System.out.println("Soma dos numeros positivos: " + somaPositivos);

        dados.close();
    }

    public static int contarNegativos(double[] y) {
        int quantidadeNegativos = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] < 0) {
                quantidadeNegativos++;
            }
        }
        return quantidadeNegativos;
    }

    public static double somarPositivos(double[] y) {
        double somaPositivos = 0.0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] >= 0) {
                somaPositivos += y[i];
            }
        }
        return somaPositivos;
    }
}
