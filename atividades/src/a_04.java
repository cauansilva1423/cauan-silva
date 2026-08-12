import java.util.Scanner;

public class a_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inscricao;
        int qtd = 0;

        int maiorInscricao = 0;
        int menorInscricao = 0;

        double altura;
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturas = 0;

        while (true) {
            System.out.print("Número de inscrição: ");
            inscricao = sc.nextInt();

            if (inscricao == 0) {
                break;
            }

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            qtd++;
            somaAlturas += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                maiorInscricao = inscricao;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                menorInscricao = inscricao;
            }
        }

        if (qtd > 0) {
            double media = somaAlturas / qtd;

            System.out.println("\nAtleta mais alto:");
            System.out.println("Inscrição: " + maiorInscricao);
            System.out.println("Altura: " + maiorAltura);

            System.out.println("\nAtleta mais baixo:");
            System.out.println("Inscrição: " + menorInscricao);
            System.out.println("Altura: " + menorAltura);

            System.out.println("\nAltura média: " + media);
            System.out.println("Quantidade de atletas: " + qtd);
        } else {
            System.out.println("Nenhum atleta cadastrado.");
        }

        sc.close();
    }
}