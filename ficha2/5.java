import java.util.Arrays;

 class 5 {
    public static void main(String[] args) {
        
        int[] y = {10, 5, 8, 2, 7, 3, 9, 1, 4, 6};

        Arrays.sort(y);
        int x = y.length;

        for (int i = x - 1; i >= 0; i--) {
            System.out.print(y[i] + " ");
        }
        System.out.println();

        String[] nomes = {"Bruna", "Juliana", "Estella", "Hytalo", "Daniel", "Carlos", "Ingrid", "Gabriela", "Ariane", "Fabiano"};

        Arrays.sort(nomes);
        x = nomes.length;

        for (int i = x - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}
