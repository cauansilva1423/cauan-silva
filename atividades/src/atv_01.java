import java.util.Scanner;

public class atv_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int escolha = sc.nextInt();

        if (escolha == 1){
            apresentar1();
        } else if (escolha == 2) {
            apresentar2();
        } else if (escolha == 3) {
            apresentar3();
        } else if (escolha == 4) {
            apresentar4();
        }else {
            System.out.println("valor invalido");
        }
    }
    public static void apresentar1(){
        System.out.println("É Verão");
        System.out.println("Está quente");
    }
    public static void apresentar2(){
        System.out.println("É Inverno");
        System.out.println("Está Frio");
    }
    public static void apresentar3() {
        System.out.println("É Primavera");
        System.out.println("As flores florecem");
    }
    public static void apresentar4(){
        System.out.println("É Outono");
        System.out.println("As folhas caem");
    }

    public static void main1(String[] args) {


    }


}
