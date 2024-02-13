public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("TV ligada? Sim");
    }

    public void desligar(){
        ligada = false;
        System.out.println("TV ligada? Não");
    }

    public void aumentarVolume(){
        if (ligada) {
            volume++;
            System.out.println("Volume atual: " + volume);
        }
    }

    public void diminuirVolume(){
        if (ligada) {
            volume--;
            System.out.println("Volume atual: " + volume);
        }
    }

    public void subirCanal(){
        if (ligada) {
            canal++;
            System.out.println("Canal atual: " + canal);
        }
    }

    public void descerCanal(){
        if (ligada) {
            canal--;
            System.out.println("Canal atual: " + canal);
        }
    }

    public void definirCanal(int canalAlvo){
        if (ligada) {
            canal = canalAlvo;
            System.out.println("Canal atual: " + canal);
        }
    }
}
