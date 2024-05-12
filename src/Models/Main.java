package Models;

import Enums.Genres;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs= new ArrayList<>();
        Artist artista1=new Artist("Dillom",25,"ARG");
        Album album1=new Album("2023",artista1,"POST MORTEM");
        Song s1= new Song("220",2.56, Genres.TRAP,album1,null);
        System.out.println(artista1.toString());

    }
}
/*) Crear un menú para interactuar con nuestra lista de reproducción permitiéndonos
utilizar la funcionalidad de la interfaz (reproducir, añadir, eliminar, listar). Estando
en reproducción, debería apretar la letra “p” para pausar la canción y regresar al
menú principal.*/