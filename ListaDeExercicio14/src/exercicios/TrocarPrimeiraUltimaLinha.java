package exercicios;

import java.util.Scanner;

public class TrocarPrimeiraUltimaLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

      
        for (int j = 0; j < 3; j++) {
            int temp = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temp;
        }

     
        System.out.println("Matriz após trocar primeira linha com a última:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
            scanner.close();
        }
    }
}