import java.util.Scanner;

public class a_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Informe seu salario fixo: ");
        int sal = sc.nextInt();
        System.out.println("Informe quantas vendas foram feitas no mes em R$: ");
        int vendas = sc.nextInt();
        int porc = (vendas*15)/100;
        double saltotal = porc + sal;
        System.out.println("seu salario final será: "+ saltotal);







    }
}
