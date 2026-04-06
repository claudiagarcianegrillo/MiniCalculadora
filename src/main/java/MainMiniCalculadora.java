import java.util.Scanner;

public class MainMiniCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniCalculadora calc = new MiniCalculadora();

        int opcion;
        double numero;

        do {
            System.out.println("\n=== MINI CALCULADORA ===");
            System.out.println("1. Valor absoluto");
            System.out.println("2. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Introduce un número: ");
                numero = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("El valor absoluto es: " + calc.valorAbsoluto(numero));
                        break;
                    case 2:
                        if (numero < 0) {
                            System.out.println("No se puede calcular la raíz cuadrada de un número negativo");
                        } else {
                            System.out.println("La raíz cuadrada es: " + calc.raizCuadrada(numero));
                        }
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        System.out.println("Programa terminado");
        sc.close();
    }
}
