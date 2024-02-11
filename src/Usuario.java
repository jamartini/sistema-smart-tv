public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        if (smartTv.ligada) {
            System.out.println("TV ligada? Sim");
        }
        else {
            System.out.println("TV ligada? Não");
        }    
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        if (smartTv.ligada) {
            System.out.println("TV ligada? Sim");
        }
        else {
            System.out.println("TV ligada? Não");
        }

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        smartTv.definirCanal(47);
    }
}
