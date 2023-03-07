public class Operadores {
    public static void main(String[] args) {
        //ARITMETICO
      /*  String nomeCompleto = "LINGUAGEM " + "JAVA"; // o operador de soma, quando usado em strings apenas concatena, se não houver ordem de prescedencia.
        System.out.println(nomeCompleto); */

          //UNARIO
        int numero = 5;
      
        numero = - numero; // operador unario, quandp queremos mudar em definitivo.

        System.out.println(numero);

        numero = numero * -1; // mudando de negatvo para positivo

        System.out.println(numero);

        //System.out.println( - numero); operador unario em caso isolado.

        //INCREMENTO

        numero = 10;
        //numero = numero +1;

        System.out.println(++ numero);

        //DECREMENTO

        System.out.println(-- numero);

        //INVERTER

        boolean variavel = true;
        //System.out.println(!variavel);  Caso isolado de inversão

        variavel = !variavel;
        System.out.println(variavel);




    }
}
