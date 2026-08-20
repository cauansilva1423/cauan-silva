import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = {5, 45, 61, 23, -4};
        System.out.println("O maior valor é: "+ obterMaiorValor(vetor));
        System.out.println("O menor valor é: "+ obterMenorValor(vetor));
        System.out.println("A Media é: " + obterMediaDosValores(vetor));
    }
    public static int obterMaiorValor(int vetor[]) {

        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maiorValor) {

                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }
    public static int obterMenorValor(int vetor[]) {

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < menorValor) {

                menorValor = vetor[i];
            }
        }
        return menorValor;
    }
    public static double obterMediaDosValores(int vetor[]) {

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];
        }
        double media = soma / vetor.length;
        return media;
    }

}