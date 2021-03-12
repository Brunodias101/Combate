package Combate.UEC.Main;


import Combate.UEC.Classes.Luta;
import Combate.UEC.Classes.Lutador;

public class UECTest {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,
                11, 2, 1);
        l[1] = new Lutador("Putscript", "brasil", 29, 1.68f, 57.8f,
                14, 2, 3);
        l[2] = new Lutador("Snapshadown", "EUA", 35, 1.65f, 80.7f,
                12, 2, 1);
        l[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,
                13,0,2);
        l[4] = new Lutador("UFOCobol","Brasil",37,1.70f,119.3f,
                5,4,3);
        l[5] = new Lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);


        Luta UEC01= new Luta();
        UEC01.marcarluta(l[0],l[1]);
        UEC01.lutar();

    }
}
