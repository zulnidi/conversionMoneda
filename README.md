
# Conversor de Monedas - Proyecto Alura + Oracle

Este proyecto es un conversor de monedas desarrollado en Java. Utiliza la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener los tipos de cambio en tiempo real y realiza conversiones entre distintas divisas.

## Tecnologías utilizadas

- *Java 17+*
- *Gson* para el manejo de JSON
- *HTTPURLConnection* para consumo de APIs (sin librerías externas)
- IDE: *IntelliJ IDEA*

## Estructura del Proyecto

ConversorMonedas/ │ ├── conversor/ │   ├── Main.java               # Clase principal con menú de usuario │   ├── ApiClient.java          # Clase para consumir la API │   ├── Conversor.java          # Lógica de conversión entre monedas │   ├── MonedaRecord.java       # Estructura de datos con record para respuesta JSON │   └── JsonUtil.java           # Serialización/Deserialización JSON con Gson │ ├── gson-2.10.1.jar             # Librería externa para manejar JSON └── README.md                   # Documentación del proyecto

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
