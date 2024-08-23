import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de seu salario: ");
        double salario = scan.nextDouble();
        System.out.println("Seu salario: " + salario);
        scan.close();
    }
}