/*
*Ler dois vetores A e B com 20 elementos numéricos inteiros. 
*Construir um vetor C, sendo  cada  elemento  de  C  a  subtração  do
elemento  correspondente  de  A  com  B. 
*Apresentar os elementos do vetor C.
*/

class atv2{
    public static void main(String[] args){
        
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] vetorB = {21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        int[] vetorC = new int[20];
        
        for(int i = 0; i < vetorA.lenght; i++){
           vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        for(int i = 0; i < vetorC.lenght; i++){
            System.out.print(vetorC[i] + "");
        }
    }
}
