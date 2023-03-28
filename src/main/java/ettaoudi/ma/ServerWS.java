package ettaoudi.ma;

import ettaoudi.ma.ws.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args){
        Endpoint.publish("https://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web Service déployé sur l'adresse https://0.0.0.0:9191/");
    }
}
