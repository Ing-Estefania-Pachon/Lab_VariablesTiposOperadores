import java.util.Scanner;

public class AnioCumpleanios {
    public static void informacionUsuario() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingrese su ocupación: ");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese su salario mensual en USD: ");
        double salarioMensual = scanner.nextDouble();

        System.out.println("Ingrese el año actual: ");
        int anio = scanner.nextInt();

        int AnioNacimiento = anio - edad;

        System.out.println("==========================================\n" +
                "            INFORMACIÓN COMPLETA\n" +
                "==========================================\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Año de nacimiento: " + AnioNacimiento + "\n" +
                "Nacionalidad: " + nacionalidad + "\n" +
                "Ocupación: " + ocupacion + "\n" +
                "Salario mensual (USD): $" + salarioMensual + "\n" +
                "Año actual: " + anio + "\n" +
                "==========================================");
    }

}
