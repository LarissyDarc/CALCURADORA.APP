import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número final: ");
        int fim = sc.nextInt();

        System.out.print("Digite o valor do passo: ");
        int passo = sc.nextInt();

        // Prevenção de erros
        if (passo <= 0) {
            System.out.println("O passo deve ser maior que 0!");
        } else {
            System.out.println("\nContagem:");
            
            // Se for crescente
            if (inicio < fim) {
                int contador = inicio;
                while (contador <= fim) {
                    System.out.println("O contador é " + contador);
                    contador += passo;
                }
            } 
            // Se for decrescente
            else {
                int contador = inicio;
                while (contador >= fim) {
                    System.out.println("O contador é " + contador);
                    contador -= passo;
                }
            }
        }

        System.out.println("Fim da contagem!");
        sc.close();
    }
}
