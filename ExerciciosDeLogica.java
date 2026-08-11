
import java.util.Scanner; 
public class ExerciciosDeLogica { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Digite o primeiro número: "); 
int num1_10 = scanner.nextInt(); 
System.out.print("Digite o segundo número: "); 
int num2_10 = scanner.nextInt(); 
System.out.print("Digite o terceiro número: "); 
int num3_10 = scanner.nextInt(); 
int maior10 = num1_10; 
if (num2_10 > maior10) { 
maior10 = num2_10; 
} 
if (num3_10 > maior10) { 
maior10 = num3_10; 
} 
System.out.println("O maior número é: " + maior10);
scanner.close(); 
} 
} 