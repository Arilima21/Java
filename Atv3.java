/*
*Ler dois vetores A com cinco elementos e B com dez elementos (valores numéricos inteiros). 
*Construir um vetor C, que é a junção dos dois outros vetores. 
*Dessa forma, C deve ter a capacidade de  armazenar  15 elementos. 
*Apresentar os  elementos do vetor C.
*/

class atv3{
    public static void main(String[] args){
        
        int[] vetorA = {1,2,3,4,5};
        int[] vetorB = {6,7,8,9,10,11,12,13,14,15};
        int[] vetorC = new int[15];
        
        for(int i = 0; i < vetorA.length; i++){
           vetorC[i] = vetorA[i];
        }
        
        for(int i = 0; i < vetorB.length; i++){
            vetorC[vetorA.length + i] = vetorB[i];
        }
        
        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        
    }
}
