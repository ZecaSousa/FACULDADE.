public class desafio2 {
    public static void main(String[] args) throws Exception {

        int altura = 9;
        int largura = 7;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {

                if (i == 0 || j == 0 || i == altura - 1 || j == largura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                System.out.print(" ");
            }

            System.out.print("\n");

        }
    }
}
