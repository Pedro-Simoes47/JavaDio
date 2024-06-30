package edu.pedro.exeSmartTv;

public class SmartTV {

        boolean tvLigada = false;
        int canalTv = 1;
        int volumeTv = 10;

        public void ligarTv(){
            tvLigada = true;
        }
        public void desligarTv(){
            tvLigada = false;
        }
        public void aumentarVolume(){
            volumeTv++;
        }
        public void diminuirVolume(){
            volumeTv--;
        }
        public void aumentarCanal(){
            canalTv++;
        }
        public void diminuirCanal(){
            canalTv--;
        }
        public void mudarCanal(int novoCanal){
            canalTv = novoCanal;
        }
}
