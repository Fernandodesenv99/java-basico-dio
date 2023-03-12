public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("Canal:" + smartTv.canal);
        System.out.println("Volume:" + smartTv.volume);

        //chamando um metodo
        //ligar desligar
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV desligada?" + smartTv.ligada);

        // diminuir e aumentar volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume:" + smartTv.volume);

        //mudar canais
        smartTv.mudarCanal(5);
        System.out.println("Canal:" + smartTv.canal);



    }
}
