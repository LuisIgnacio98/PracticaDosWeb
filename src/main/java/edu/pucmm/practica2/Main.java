package edu.pucmm.practica2;

import edu.pucmm.practica2.Controladora.CrudControladora;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/publico");
            config.enableCorsForAllOrigins();
        });

        app.start(8080);

        new CrudControladora(app).aplicarRutas();
    }
}
