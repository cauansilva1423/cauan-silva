import java.util.Scanner;

public class atv_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = {53,9,15,62,3};


    }
    public static void MaiorElemento(int vetor[]){
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
    }
    public static void MenorValor(int vetor[]){
        int menor = vetor[0];
        for (int i= 0; i < vetor.length; i++){
            if (vetor[i]< menor){
                menor = vetor[i];
            }
        }
    }
    public static void MediaValor(int vetor[]){

    }
}

