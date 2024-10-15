import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner escolha = new Scanner(System.in);


        int opçao;
        String conversor = "";
        String convertido = "";
        double valor ;
        
        do {
            System.out.println("**************************************");
            System.out.println("Bem-vindo/a ao Conversor de Moeda");
            System.out.println("");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dolár");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dolár");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("**************************************");

            opçao = escolha.nextInt();



            switch (opçao) {

                case 1:
                    conversor = "USD";
                    convertido = "ARS";
                    break;
                case 2:
                    conversor = "ARS";
                    convertido = "USD";
                    break;
                case 3:
                    conversor = "USD";
                    convertido = "BRL";
                    break;
                case 4:
                    conversor = "BRL";
                    convertido = "USD";
                    break;
                case 5:
                    conversor = "USD";
                    convertido = "COP";
                    break;
                case 6:
                    conversor = "COP";
                    convertido = "USD";
                    break;
                case 7:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opçao);
            }
            if(opçao != 7) {

                System.out.println("Digite o valor que deseja converter:");
                valor = escolha.nextDouble();
                // Setting URL
                String url_str = "https://v6.exchangerate-api.com/v6/1d3259f90ba62087bb98ec9f/pair/" + conversor + "/" + convertido + "/" + valor;
                // Making Request
                URL url = new URL(url_str);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.connect();
                // Convert to JSON
                JsonParser jp = new JsonParser();
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                JsonObject jsonobj = root.getAsJsonObject();
                // Accessing object
                String req_result = jsonobj.get("result").getAsString();

                System.out.println("Valor " + valor + "" + jsonobj.get("base_code") + " corresponde ao valor final de =>>> " + jsonobj.get("conversion_result") + "" + jsonobj.get("target_code"));
                System.out.println(req_result);
            }
        } while (opçao != 7);

        escolha.close();
    }
}