package Service;
import com.google.gson.Gson;
import Model.ResultadoConversion;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ApiService {
    private static final String API_KEY = "121f442b029039f58e19d5e8";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public ResultadoConversion obtenerTasas(String base) throws Exception {
        String urlString = BASE_URL + API_KEY + "/latest/" + base;
        URL url = new URL(urlString);

        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        int respuesta = conexion.getResponseCode();
        if (respuesta != 200) {
            throw new RuntimeException("Error al obtener datos: " + respuesta);
        }

        try (InputStreamReader reader = new InputStreamReader(conexion.getInputStream(), StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, ResultadoConversion.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al parsear JSON: " + e.getMessage());
        }
    }
}

