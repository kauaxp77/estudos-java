import java.util.Scanner;
import java.util.Random;

public class Exercicio {

    public static void main(String[] args) {
        // Você pode chamar os métodos aqui para testar
        // exercicio1();
        // exercicio2();
        // exercicio3();
        // exercicio4();
        // exercicio5();
        // exercicio6();
        // exercicio7();
        // exercicio8();
        // exercicio9();
        // exercicio10();
    }

    // Exercício 1 – Contagem simples (while)
    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int contador = 1;
        while (contador <= n) {
            System.out.println(contador);
            contador++;
        }
    }

    // Exercício 2 – Soma até zero (while)
    public static void exercicio2() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        System.out.print("Digite um número (0 para sair): ");
        numero = scanner.nextInt();
        while (numero != 0) {
            soma += numero;
            System.out.print("Digite outro número (0 para sair): ");
            numero = scanner.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + soma);
    }

    // Exercício 3 – Tabuada (do while)
    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in);
        char resposta;
        do {
            System.out.print("Digite um número para a tabuada: ");
            int numero = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.print("Deseja calcular outra tabuada? (S/N) ");
            resposta = scanner.next().toUpperCase().charAt(0);
        } while (resposta == 'S');
    }

    // Exercício 4 – Adivinhação (do while)
    public static void exercicio4() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1;
        int chute;
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        do {
            System.out.print("Qual é o seu chute? ");
            chute = scanner.nextInt();
            if (chute > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else if (chute < numeroSecreto) {
                System.out.println("Tente um número maior.");
            }
        } while (chute != numeroSecreto);
        System.out.println("Parabéns! Você acertou. O número era " + numeroSecreto + ".");
    }

    // Exercício 5 – Fatorial (while)
    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = scanner.nextInt();
        long fatorial = 1; // Usar long para evitar overflow com números grandes
        int contador = 1;
        while (contador <= n) {
            fatorial *= contador;
            contador++;
        }
        System.out.println("O fatorial de " + n + " é " + fatorial);
    }

    // Exercício 6 – Contagem regressiva (for)
    public static void exercicio6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para iniciar a contagem regressiva: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Fogo!");
    }

    // Exercício 7 – Números pares (for)
    public static void exercicio7() {
        System.out.println("Números pares de 1 a 50:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }

    // Exercício 8 – Soma de múltiplos de 3 (for)
    public static void exercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma de todos os múltiplos de 3 entre 1 e " + n + " é " + soma + ".");
    }

    // Exercício 9 – Média de notas (for)
    public static void exercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();
        double somaNotas = 0;
        if (quantidadeAlunos > 0) {
            for (int i = 1; i <= quantidadeAlunos; i++) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double media = somaNotas / quantidadeAlunos;
            System.out.printf("A média da turma é: %.2f\n", media);
        } else {
            System.out.println("Nenhum aluno na turma.");
        }
    }

    // Exercício 10 – Números primos (for)
    public static void exercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println(n + " não é um número primo.");
        } else {
            boolean ePrimo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ePrimo = false;
                    break;
                }
            }
            if (ePrimo) {
                System.out.println(n + " é um número primo.");
            } else {
                System.out.println(n + " não é um número primo.");
            }
        }
    }
}