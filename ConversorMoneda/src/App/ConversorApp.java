package App;
import Model.ResultadoConversion;
import Service.ApiService;
import java.util.Scanner;
public class ConversorApp {
    private static final Scanner entrada = new Scanner(System.in);

        public static void main(String[] args) {
            ApiService apiService = new ApiService();

            while (true) {
                System.out.println("*************");
                System.out.println("Sea bienvenido/a al Conversor de Moneda");
                System.out.println("*************");
                System.out.println("""
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Salir
                    """);
                System.out.print("Elija una opción válida: ");

                int opcion = entrada.nextInt();
                if (opcion == 7) {
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    break;
                }

                String base , destino ;
                switch (opcion) {
                    case 1 -> { base = "USD"; destino = "ARS"; }
                    case 2 -> { base = "ARS"; destino = "USD"; }
                    case 3 -> { base = "USD"; destino = "BRL"; }
                    case 4 -> { base = "BRL"; destino = "USD"; }
                    case 5 -> { base = "USD"; destino = "COP"; }
                    case 6 -> { base = "COP"; destino = "USD"; }
                    default -> {
                        System.out.println("Opción inválida.");
                        continue;
                    }
                }

                System.out.print("Ingrese el monto a convertir: ");
                double monto = entrada.nextDouble();

                try {
                    ResultadoConversion resultado = apiService.obtenerTasas(base);
                    double tasa = resultado.conversion_rates().get(destino);
                    double convertido = monto * tasa;
                    System.out.printf("Resultado: %.2f %s = %.2f %s%n", monto, base, convertido, destino);
                } catch (Exception e) {
                    System.out.println("Error al realizar la conversión: " + e.getMessage());
                }

                System.out.println();
            }
        }
    }

