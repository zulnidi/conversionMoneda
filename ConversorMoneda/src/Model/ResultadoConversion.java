package Model;

import java.util.Map;

public record ResultadoConversion(String base_code, Map<String, Double> conversion_rates) {
}
