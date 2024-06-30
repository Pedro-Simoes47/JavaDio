package edu.pedro.exeSmartTv;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTvSala = new SmartTV(); // aqui se criou um obj do tipo SmartTv com o nome de smartTvSala

        System.out.println("Tv esta ligada? " + smartTvSala.tvLigada);
        System.out.println("Canal atual: " + smartTvSala.canalTv);
        System.out.println("Volume atual: " + smartTvSala.volumeTv);

        smartTvSala.ligarTv();
        System.out.println("Tv esta ligada? " + smartTvSala.tvLigada);

        smartTvSala.aumentarVolume();
        smartTvSala.aumentarVolume();
        smartTvSala.diminuirVolume();
        System.out.println("Volume atual: " + smartTvSala.volumeTv);
        
        smartTvSala.mudarCanal(14);
        System.out.println("Canal atual: " + smartTvSala.canalTv);

        smartTvSala.desligarTv();
        System.out.println("Tv esta ligada? " + smartTvSala.tvLigada);




    }
}
