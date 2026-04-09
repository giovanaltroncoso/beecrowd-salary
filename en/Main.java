import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();
        int workedHours = sc.nextInt();
        double hourlyRate = sc.nextDouble();
        
        double salary = workedHours * hourlyRate;

        System.out.printf("""
                NUMBER = %d
                SALARY = U$ %.2f
                """, employeeId, salary);

        sc.close();
    }
}
