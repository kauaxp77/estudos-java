
public class Aula03 {

    public static void main(String[] args) {
        int idade = 21;
        double salario = 35000.75;
        char inicial = 'm';
        boolean ativo = true;
        String nome = "joão";

        idade += 1;
        salario *= 1.1;

        boolean maiorDeIdade = idade >= 18;
        boolean podeDirigir = maiorDeIdade && ativo;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: %.2f\n", salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ativo: " + ativo);
        System.out.println("Maior de idade: " + maiorDeIdade);
        System.out.println("Pode dirigir: " + podeDirigir);

        int x = 10, y = 5, z = 2, c = 10, b = 10, a = 16, r = 10, s = 10, q = 18, p = 19;

        boolean exp1 = x + y * z > 20 || y - z < 3; 
        System.out.println("valor exp1:" + exp1);

        boolean r1 = x + y * z > 20 || (y / x) <= 2;
        System.out.println("valor r1:" + r1);

        boolean r2 = !(y % x == 3) && (z - y > x);
        System.out.println("valor r2: " + r2);

        boolean r3 = x + y * z > 100 && x % y < x;
        System.out.println("valor r3: " + r3);

        boolean e1 = (a + b * 2) >= c || (c / b + a) < 7;
        System.out.println("valor e1: " + e1);

        boolean e2 = !(a * 3 < b && c % a == 0) || (c - b <= a * 2);
        System.out.println("valor e2: " + e2);

        boolean e3 = (b / a + c % b) > 10 && (a + b + c) % 2 == 1;
        System.out.println("valor e3: " + e3);

        boolean d1 = ((p * 2 + q / r) > s || !(q - s < p)) && (r * r <= p);
        System.out.println("valor d1: " + d1);

        boolean d2 = (p + q) % r == 3 || (s / p + q % r) >= 10 && !(p > q);
        System.out.println("valor d2: " + d2);

        boolean d3 = !((p + q > s) && (r * 2 <= p)) || ((s - q) % p == 4);
        System.out.println("valor d3: " + d3);

    }
}
