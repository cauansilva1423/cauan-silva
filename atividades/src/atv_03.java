import java.util.Scanner;

public class atv_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = sc.nextInt();
        apresentarNum(num);
    }

    public static void apresentarNum (int num){

        for (int i= 0;i<=20; i++ ){
            System.out.println(i + num);

        }
    }
}
