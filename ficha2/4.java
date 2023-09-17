/*
*Leia dois vetores de números inteiros com a mesma quantidade. 
*Exiba a intersecção dos vetores, ou seja, os números que são repetidos nos dois vetores.
*/
class 4{
  public static void main(String[] args){
  int [] x = {1,8,9,3,4};
  int [] y = {4,9,2,8,1};

  StringBuilder intersecao = new StringBuilder("Exibindo a interseção dos vetores x e y:");

    for(int i =0; i < x.length; i++){
      for(int j = 0; j< y.length; i++){
        if(x[i] == y[j]){
          intersecao.append(x[i]).append(", ");
          break;
        }
      }
  }
    System.out.println(intersecao.toString);
}
}
