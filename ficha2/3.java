/*
*Leia  um vetor de 10 números inteiros. 
*Exiba  este vetor acompanhado  do  seu elemento simétrico em relação a sua posição no conjunto. 
*Veja o exemplo:Entrada: [5,7,9,2]Saída:[5–2,7 –9,9 –7,2 –5]
*/
class 3 {
  public static void main(String[] args){
      int [] vetor = 10;
      int [] x = new int[vetor];
      int [] elementoSimetrico = new int[vetor];

    for(int i = 0; i < vetor; i++){
        x[i] = i+1;
  }
    for(int i = 0; i < vetor.length; i++){
      elementoSimetrico[i] = x[i] - x[vetor - i - 1];
  }
    System.out.print("Entrada [");
    for(int i = 0; i < vetor; i++){
      System.out.print(x[i]);
      if(i < vetor){
        System.out.print(",");
      }
  }
    System.out.print("\nSaida [");
    for(int i= 0; i < vetor; i++){
        System.out.print(x[i] + "-" + elementoSimetrico[i]);
      if(i < vetor){
        System.out.print(",");
      }
  }
    System.out.print("]");
  }
}
