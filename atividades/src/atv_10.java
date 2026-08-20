import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor para ser o Limite Maximo: ");
        int Max = sc.nextInt();
        System.out.println("Informe um valor para ser o Limite Minimo: ");
        int Min = sc.nextInt();
        System.out.println("Informe um valor para ver se ele está dentro do limite: ");
        int num3 = sc.nextInt();
        System.out.println(averiguarLimite(Max, Min, num3 ));
    }
    public static String averiguarLimite(int num1, int num2, int num3){
        if (num3 > num1){
            return "O valor está fora do limite";
        } else if (num3 <num2) {
            return "O valor está fora do limite";
        }else{
            return num3 + " está dentro do limite";
        }
    }

}
