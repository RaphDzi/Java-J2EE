package com.example.exercice5;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

// Chemin de base de mon APP http://localhost:8080/demo_api_rest_war_exploded/api
// Indire l'url de base ou se trouve les ressources JAX-RS
@ApplicationPath("/api")
//@ApplicationPath("") // http://localhost:8080/demo_api_rest_war_exploded/ l'api disponible a la racine
public class HelloApplication extends Application {

}