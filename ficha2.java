/*
*Leia  um veto rde  notas, em  que  a quantidade é especificada pelo  usuário.
*Em seguida, calcule a média das notas digitadas. 
*Finalmente, exiba o conjunto das notas maiores do que a média calculada, 
bem como e conjunto de notas menores do que a média.
*OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
*/
  
  import java.util.Scanner;

public class ficha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        
        if (quantidadeNotas <= 0) {
            System.out.println("A quantidade de notas deve ser maior que zero.");
            return;
        }
        
        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
                return;
            }

            notas[i] = nota;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / quantidadeNotas;

        System.out.println("\nNotas maiores que a média (" + media + "):");
        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }

        System.out.println("\nNotas menores que a média (" + media + "):");
        for (double nota : notas) {
            if (nota < media) {
                System.out.println(nota);
            }
        }
    }
}
