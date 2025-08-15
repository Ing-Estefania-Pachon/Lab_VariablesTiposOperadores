import java.util.Scanner;

public class PromedioNotas {
    public static void calculoPromedioNotas (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();

        double promedioNotas = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio de sus notas es: " + promedioNotas );


    }

}
