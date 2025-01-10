import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    private String API_KEY = "432b8e486985618643be3141";
    private String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private URI direccion = URI.create(BASE_URL+API_KEY+"/latest/USD");
    HttpClient cliente = HttpClient.newHttpClient();
    HttpRequest peticion = HttpRequest.newBuilder()
            .uri(direccion).build();

    public RespuestaConversion consultaHTTP(){
            try {
                HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(respuesta.body(), RespuestaConversion.class);
            }catch (Exception e){
                System.out.println("ocurrio un problema");
                throw new RuntimeException(e.getMessage());
            }
        }


}
