import java.text.DecimalFormat;
import java.util.Scanner;

public class a_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite seu numero de matricula: ");
        String matricula = sc.next();
        System.out.println("digite seu nome: ");
        String nome = sc.next();
        System.out.println("quantas horas você trabalhou na semana?: ");
        int horas = sc.nextInt();
        System.out.println("Quanto que você recebe por hora?: ");
        int valor = sc.nextInt();
        int sal = (horas * valor)*4;
        System.out.println("seu salario desse mes será: R$" + df.format(sal) );

    }
}

