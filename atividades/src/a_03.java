import java.util.Scanner;

public class a_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        int massa = sc.nextInt();
        System.out.println("informe sua altura: ");
        double altura = sc.nextDouble();
        double imc = massa/ (altura* altura);
        if (imc < 18.5){
            System.out.println("Magreza");
        } else if (imc < 24.9) {
            System.out.println("saudavel");
        } else if (imc < 29.9) {
            System.out.println("sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc < 39.9) {
            System.out.println("Obesidade Grau 2 (severa)");
        } else if (imc > 40) {
            System.out.println("Obesidade Grau 3 (morbida)");
        }
        System.out.println(imc);


    }
}

