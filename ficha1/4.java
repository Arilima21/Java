/*
*Ler 15 elementos numéricos inteiros de um vetor A. 
*Construir um vetor B de mesmo tipo, observando a seguinte lei de formação: 
*todo elemento do vetor B deve ser o quadrado  do  elemento  correspondente  do  vetor  A.  
*Apresentar  os  elementos  dos vetores A e B dispostos lado a lado.
*/

class atv4{
    public static void main(String[] args){
        
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] vetorB = new int[15];
        
        for(int i = 0; i < vetorA.length; i++){
           vetorB[i] = vetorA[i] * vetorA[i];
        }
        
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorA[i] + "");
            System.out.print(vetorB[i] + "");
        }
    }
}
