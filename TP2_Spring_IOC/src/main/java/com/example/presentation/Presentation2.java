package com.example.presentation;

import com.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Classe principale qui démarre l’application Spring.
 */
@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.metier"})
public class Presentation2 {

    public static void main(String[] args) {

        // 1️ Créer le contexte Spring basé sur les annotations
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Presentation2.class);

        // 2️ Récupérer le bean métier depuis le conteneur Spring
        IMetier metier = context.getBean(IMetier.class);

        // 3️ Exécuter la méthode calcul() et afficher le résultat
        System.out.println("Résultat = " + metier.calcul());
    }
}
