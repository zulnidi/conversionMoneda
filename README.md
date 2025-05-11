
# Conversor de Monedas - Proyecto Alura + Oracle

Este proyecto es un conversor de monedas desarrollado en Java. Utiliza la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener los tipos de cambio en tiempo real y realiza conversiones entre distintas divisas.

## Tecnologías utilizadas

- *Java 17+*
- *Gson* para el manejo de JSON
- *HTTPURLConnection* para consumo de APIs (sin librerías externas)
- IDE: *IntelliJ IDEA*

## Estructura del Proyecto

ConversorMoneda/
├── .idea/               # Configuración de IntelliJ IDEA
├── out/                 # Archivos compilados (generado automáticamente)
├── src/                 # Código fuente principal
│   ├── App/             # Clase principal de la aplicación
│   ├── ConversorApp/    # Lógica de la aplicación conversora
│   ├── Model/           # Modelos de datos
│   │   ├── Moneda/      # Definición de monedas
│   │   └── ResultadoConversion/  # Modelo para resultados de conversión
│   └── Service/        # Servicios externos
│       └── ApiService/  # Conexión con API de tasas de cambio
├── .gitignore          # Archivos excluidos de Git
└── ConversorMoneda.iml # Archivo de configuración del módulo (IntelliJ)

## Requisitos

- Tener instalado Java (versión 17 o superior).
- Descargar y añadir la librería gson-2.10.1.jar al proyecto.
  - Puedes obtenerla desde: https://mvnrepository.com/artifact/com.google.code.gson/gson

## Cómo usar

1. Ejecuta la clase Main.
2. Se mostrará un menú para ingresar el monto, la moneda de origen y la moneda de destino.
3. El programa llamará a la API y mostrará el valor convertido.

## Ejemplo de uso

Ingrese la cantidad: 100 Moneda de origen (USD): USD Moneda destino (EUR): EUR Resultado: 100 USD equivalen a 91.23 EUR

## Créditos

Este proyecto forma parte del programa ONE (Oracle Next Education) en colaboración con Alura Latam.
