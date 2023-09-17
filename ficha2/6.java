/*
*Leia  dois vetores de  números inteiros já  ordenados  de forma  crescente.
*Crie  um outro vetor para armazenar os dois conjuntos unidos, sendo que os números no outro vetor devem permanecer ordenados.
*Finalmente, exiba este vetor resultante.
*OBS:os vetores iniciais podem ter o tamanho diferente.
*/
class ficha{
    public static void main(String [] args){
        int[] x = {1,3,5,7,9,11,13,15,17,19};
        int[] y = {2,4,6,8,10,12,14,16,18,20};
        
        int tamanhoA = x.length;
        int tamanhoB = y.length;
        int resultado = tamanhoA + tamanhoB;
        
        int[] vetorFinal = new int[resultado];
        
        int a = 0, b = 0, c = 0;
        
        while (a < tamanhoA && b < tamanhoB){
            if(x[a] < y[b]){
                vetorFinal[c++] = x[a++];
            } else{
                vetorFinal[c++] = y[b++];
            }
        }
        while (a < tamanhoA){
            vetorFinal[c++] = x[a++];
        }
        while (b < tamanhoB){
            vetorFinal[c++] = y[b++];
        }
        System.out.print("Vetor final:");
        for(int elemento : vetorFinal){
            System.out.print(elemento + " ");
        }
    }
}
