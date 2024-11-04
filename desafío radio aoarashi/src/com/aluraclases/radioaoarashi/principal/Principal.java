package com.aluraclases.radioaoarashi.principal;

import com.aluraclases.radioaoarashi.modelos.Cancion;
import com.aluraclases.radioaoarashi.modelos.MisFavoritos;
import com.aluraclases.radioaoarashi.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion ();
        miCancion.setTitulo("Samidare");
        miCancion.setCantante("AndTeam");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Fidelio");
        miPodcast.setTitulo("Cineclub CL");

        //canción

        for (int i = 0; i < 100; i++){
            miCancion.Likes();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        System.out.println("Total de reproducciones: "  + miCancion.getTotalDeReproducciones());
        System.out.println("Total de likes: "  + miCancion.getTotalDeLikes());

        //podcast

        for (int i = 0; i < 300; i++) {
            miPodcast.Likes();
        }
        for (int i = 0; i < 1000; i++) {
            miPodcast.reproduce();
        }
        System.out.println("Total de reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de likes: " + miPodcast.getTotalDeLikes());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
