package br.com.cwi.reset.samantamarry;

public class GeradorId {

    private static int Id;

    public static int getProximoId(){

        return Id++;
    }

}
