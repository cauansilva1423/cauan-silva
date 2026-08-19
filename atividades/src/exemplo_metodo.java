public class exemplo_metodo {

    public static void main(String[] args) {

       double soma = somarNumero(15,45);
        System.out.println(soma);
        System.out.println(somarNumero(7, 7));

    }
    public static double somarNumero(int num1, int num2){
        double soma = num1 + num2;
        return soma;
    }

}
