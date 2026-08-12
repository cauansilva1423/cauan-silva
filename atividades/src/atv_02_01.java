import javax.swing.*;
import java.util.Scanner;

public class atv_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma pessoa: ");
        String pessoa = sc.nextLine();

        if (pessoa.equals("Wendel"));{
            encontrarWendel();
        }
        else if (pessoa.equals("Otavio"));{
            encontrarOtavio();
        }
        else if (pessoa.equals("Bruno"));{
            encontrarBruno();
        }
        else if (pessoa.equals("Edi"));{
            encontrarEdi();
        }
        else {
            System.out.println("nenhuma pessoa foi encontrada ");
        }

    }
    public static void encontrarWendel (){
        System.out.println("O nome dele é Wendel");
        System.out.println("A idade dele é 21");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }
    public static void encontrarOtavio(){
        System.out.println("O nome dele é Otavio");
        System.out.println("A idade dele é 16");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }
    public static void encontrarBruno(){
        System.out.println("O nome dele é Bruno");
        System.out.println("A idade dele é 21");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }
    public static void encontrarEdi(){
        System.out.println("O nome dele é Edi");
        System.out.println("A idade dele é 20");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }

}
