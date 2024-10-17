package main.java.org.singleton;

public class AppConfig {

    private static AppConfig instance;
    private String serverUrl;
    private int port;
    private Boolean serverState;

    private AppConfig() {

        serverState = false;
        port = 3306;
        serverUrl = "localhost";

    }

    public static synchronized AppConfig getInstance() {

        if(instance == null) {

            instance = new AppConfig();

        }

        return instance;

    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public void turnOnServer(int port, String serverUrl) {

        this.port = port;
        this.serverUrl = serverUrl;

        serverState = true;

        System.out.println("Servidor Prendido en el puerto: " + port + ", URL: "+ serverUrl);

    }

    public void turnOffServer() {

        this.port = 3306;
        this.serverUrl = "localhost";

        serverState = false;

        System.out.println("Servidor Apagado");

    }

    public void checkServerState() {

        if(serverState == true) {

            System.out.println("Servidor Prendido en el puerto: " + port + ", URL: "+ serverUrl);

        }

        System.out.println("Servidor Apagado");

    }

}
