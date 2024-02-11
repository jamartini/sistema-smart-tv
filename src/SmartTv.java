public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void subirCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void definirCanal(int canalAlvo){
        canal = canalAlvo;
        System.out.println("Canal atual: " + canal);
    }
}
