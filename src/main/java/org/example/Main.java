package org.example;

import org.listas.Lista;
import org.reproductor.Cancion;
import org.reproductor.ListaCancion;
import org.reproductor.ListaCancionOrdenada;

public class Main {
    public static void main(String[] args) {

        //lista ordenada
        ListaCancionOrdenada lco = new ListaCancionOrdenada();
        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","zzz.mp3"));
        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","aaa.mp3"));
        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","001.mp3"));
        lco.insertar(new Cancion("C:\\Users\\ruldin\\Desktop\\un ladrio mas en la pared.mp3","zaz.mp3"));
        lco.visualizar();

        System.out.println("fin");

    }
}