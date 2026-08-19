import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um digito");
        String clima = sc.nextLine();

        if (clima.equalsIgnoreCase("1")){
            System.out.println(mostrarclima1(clima));
        }
        else if (clima.equalsIgnoreCase("2")){
            System.out.println(mostrarclima2(clima));
        }
        else if (clima.equalsIgnoreCase("3")){
            System.out.println(mostrarclima3(clima));
        }
        else if (clima.equalsIgnoreCase("4")){
            System.out.println(mostrarclima4(clima));
        }
        else {
            System.out.println("nenhuma pessoa foi encontrada ");
        }

    }
    public static String mostrarclima1 (String v1){
        return "É  verão\nE está quente";

    }
    public static String mostrarclima2 (String v2){
        return "É  outono\nE as flores caem";
    }
    public static String mostrarclima3  (String v3){
        return "É  inverno\nE está frio";
    }
    public static String mostrarclima4 (String v4){
        return "É  primavera\nE as flores estão folrecendo";
    }

}
