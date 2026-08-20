import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Me informe um numero: ");
        int num2 = sc.nextInt();
        System.out.println("Me informe um numero: ");
        int num3 = sc.nextInt();

        System.out.println("Sua media é: "+ medirmedia(num1, num2, num3));
    }
    public static int medirmedia(int num1,int num2,int num3){
        return (num1 + num2 + num3)/3;
    }
}
