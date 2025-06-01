public class ConversorDeMoedas {

    // Método principal
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=== Conversor de Moedas ===");

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Euro para Real");
        System.out.println("3 - Real para Dólar");
        System.out.println("4 - Real para Euro");

        System.out.print("Digite a opção desejada (1 a 4): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor para conversão: ");
        double valor = scanner.nextDouble();

        double resultado = 0;
        double taxaDolar = 5.20; // Exemplo de cotação
        double taxaEuro = 5.60;  // Exemplo de cotação

        switch (opcao) {
            case 1:
                resultado = dolarParaReal(valor, taxaDolar);
                System.out.printf("%.2f dólares = %.2f reais%n", valor, resultado);
                break;
            case 2:
                resultado = euroParaReal(valor, taxaEuro);
                System.out.printf("%.2f euros = %.2f reais%n", valor, resultado);
                break;
            case 3:
                resultado = realParaDolar(valor, taxaDolar);
                System.out.printf("%.2f reais = %.2f dólares%n", valor, resultado);
                break;
            case 4:
                resultado = realParaEuro(valor, taxaEuro);
                System.out.printf("%.2f reais = %.2f euros%n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    // Métodos de conversão
    public static double dolarParaReal(double valor, double taxaDolar) {
        return valor * taxaDolar;
    }

    public static double euroParaReal(double valor, double taxaEuro) {
        return valor * taxaEuro;
    }

    public static double realParaDolar(double valor, double taxaDolar) {
        return valor / taxaDolar;
    }

    public static double realParaEuro(double valor, double taxaEuro) {
        return valor / taxaEuro;
    }
}
