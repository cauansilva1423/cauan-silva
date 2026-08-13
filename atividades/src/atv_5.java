import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o 1º numero: ");
        int base = sc.nextInt();
        System.out.println("Informe o 2° numero: ");
        int num2 = sc.nextInt();
        System.out.println("Informe o 3º numero: ");
        int num3 = sc.nextInt();
        encontrarProximo(base, num2, num3);
    }
    public static void encontrarProximo (int base,int num2,int num3){
        if (Math.abs(base - num2) < Math.abs(base-num3)){
            System.out.println(num2 + "é mais proximo ");
        } else {
            System.out.println(num3 + " é mais proximo ");
        }

    }

}
