package exercicios;

import java.util.Scanner;

public class ContarParesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int contadorPares = 0;

       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

               
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
            }
        }

       
        System.out.println("Quantidade de números pares na matriz: " + contadorPares);
        scanner.close();
    }
}