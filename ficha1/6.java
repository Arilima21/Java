/*
*Faça um programa que leia um vetor com quinze posições para números inteiros. 
*Crie, a seguir, um vetor resultante que contenha todos os números primos do vetor digitado. 
*Escreva o vetor resultante.
*/
import java.util.Scanner;

public class atv6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int x = 15;
        int[] vetorEntrada = new int[x];
        
        System.out.println("Digite 15 numeros inteiros:");

        for (int i = 0; i < x; i++) {
            vetorEntrada[i] = sc.nextInt();
        }

        int[] vetorResultante = new int[x];
        int contador = 0; 
        
        for (int i = 0; i < x; i++) {
            if (isPrimo(vetorEntrada[i])) {
                vetorResultante[contador] = vetorEntrada[i];
                contador++;
            }
        }
        
        System.out.println("Numeros primos encontrados:");

        for (int i = 0; i < contador; i++) {
            System.out.print(vetorResultante[i] + " ");
        }
        
        sc.close();
    }
    
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
