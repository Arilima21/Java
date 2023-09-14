/*
*Ler  20  elementos  numéricos  inteiros  para  um  vetor  A 
*e  construir  um  vetor  B  de mesma dimensão com os mesmos elementos de A. 
*Eles devem estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo de B, e assim por diante. 
*Apresentar os elementos dos dois vetores.
*/
class atv5{
    public static void main(String[] args){
        
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] vetorB = new int[20];
        
        for(int i = 0; i < vetorA.length; i++){
           vetorB[i]= vetorA[vetorA.length - 1 - i];
        }
        
        for(int i = 0; i < vetorB.length; i++){
           System.out.print(vetorA[i] + "");
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + "");
        }
    }
}
