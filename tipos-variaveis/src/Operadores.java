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

        //TERNARIO

        int a,b;
        a = 6;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "falso";

        System.out.println(resultado);

        //RELACIONAIS

        int numero1 =1;
        int numero2 =2;

        boolean simNao  = numero1 == numero2;
        System.out.println("O primeiro numero é igual ao segundo? " + simNao);
        
        simNao  = numero1 != numero2;
        System.out.println("O primeiro numero é diferente do segundo? " + simNao);

        simNao  = numero1 > numero2;
        System.out.println("O primeiro numero é maior que o segundo? " + simNao);

        simNao  = numero1 < numero2;
        System.out.println("O primeiro numero é menor que o segundo? " + simNao);

        if(numero1 < numero2){
            System.out.println(" A condição é falsa");

            //também e possivel comparar outros valores
            // quando forem objetos é necessário usar o EQUALS

            String nomeUm = "Fernando";
            String nomeDois = new String("Fernando");

            System.out.println(nomeUm.equals(nomeDois));
        }

    }
}
