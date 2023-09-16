/*
 *Ler oito elementos numéricos inteiros em um vetor A.
 *Construir um vetor B de mesma dimensão 
 *com os elementos do vetor A multiplicados por 3. 
 *Apresentar os elementos do vetor B.
*/

import java.util.Scanner;

class prova {
public static void main(String[] args){
    
    int[] vetorA = {1,2,3,4,5,6,7,8};
    int[] vetorB = new int[8];
    
    for(int i = 0; i < 8; i++) {
       vetorB[i] = vetorA[i] * 3;
}
    for(int i = 0; i < vetorB.length; i++) {
       System.out.print(vetorB[i] + "");
}
}
}
