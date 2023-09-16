/*
*Leia um vetor de 20 valores inteiros 
*e,em seguida,exiba-os na ordem inversa do que foram digitados.
*/

class atv2 {
    public static void main(String[] args) {
        
        int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] b = new int[20];
        
        for(int i = 0; i < x.length; i++){
            b[i] = i + 1;
        }
        
        System.out.println("Valores na ordem inversa:");
        
        for(int i = x.length - 1; i >= 0; i--){
            System.out.println(b[i]);
        }
        
    }
}
