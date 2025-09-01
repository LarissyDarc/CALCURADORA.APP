package app;
import java.util.Scanner;

public class Despesas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalDespesas = 0.0;
        double valorDespesa;
        int contador = 0;

        // Melhoria 2: Solicitar orçamento
        System.out.print("Defina seu limite de orçamento mensal: ");
        double limiteOrcamento = scanner.nextDouble();

        System.out.println("\nDigite os valores das despesas (digite 0 para encerrar):");

        // Código-base com while
        System.out.print("Informe uma despesa: ");
        valorDespesa = scanner.nextDouble();

        while (valorDespesa != 0) {
            totalDespesas += valorDespesa;
            contador++;

            // Verificação do orçamento
            if (totalDespesas > limiteOrcamento) {
                System.out.println("⚠️ ATENÇÃO: Você ultrapassou seu orçamento!");
            }

            System.out.print("Informe uma despesa: ");
            valorDespesa = scanner.nextDouble();
        }

        // Exibição final
        System.out.println("\n===== RESULTADO =====");
        System.out.println("Total de despesas: R$ " + totalDespesas);

        // Melhoria 1: Cálculo da média
        if (contador > 0) {
            double media = totalDespesas / contador;
            System.out.println("Média de gastos por item: R$ " + media);
        } else {
            System.out.println("Nenhuma despesa registrada.");
        }

        scanner.close();
    }
}
