import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de sua renda: ");
        double salario = scan.nextDouble();
        System.out.println("Seu salario e: " + salario);
        scan.close();
    }
}