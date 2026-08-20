import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor");
        int num = sc.nextInt();
        System.out.println(acharPar(num));
    }
    public static Boolean acharPar (int num){
        if (num %2 ==0){
            Boolean Par = true;
            return Par;
        }else {
            boolean Impar = false;
            return Impar;
        }

    }
}
