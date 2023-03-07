public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;  // fazendo um casting
        System.out.println(numeroCurto2);
        
        int numero = 5;
        
        numero = 10;

        System.out.println(numero);
        // declarando que uma variável não vai ser mudada nunca = Constante.
        final double VALOR_DE_PI = 3.14;
    }
}
