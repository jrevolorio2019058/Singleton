package main.java.org.singleton;

public class Main {
    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();

        config.setServerUrl("http://miapi.com");

        System.out.println("URL del Servidor: " + config.getServerUrl());

        config.turnOnServer(3105, "http://miapi.com");

        config.checkServerState();

        config.turnOffServer();

        config.checkServerState();

    }
}