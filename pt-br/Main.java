import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idFuncionario = sc.nextInt(); //Lê o número do funcionário
        int horasTrabalhadas = sc.nextInt(); //Lê a quantidade de horas
        double valorHora = sc.nextDouble(); //Lê o valor recebido por hora
        
        double salario = horasTrabalhadas * valorHora; //Cálculo do salário total

        System.out.printf("""    
                NUMBER = %d
                SALARY = U$ %.2f
                """, idFuncionario, salario); //%d é usado para números inteiros e %.2f para decimais com 2 casas

        sc.close();
    }
}