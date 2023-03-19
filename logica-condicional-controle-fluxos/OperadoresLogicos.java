import java.util.function.IntFunction;

public class OperadoresLogicos{
    public static void main(String[] args) {
        boolean b1 =true;
        boolean b2 =false;
        boolean b3 =true;
        boolean b4 =false;

        //Conjuncao
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        
        //Disjuncao
        System.out.println("b2 || b3 " + (b2 || b4));
        System.out.println("b2 || b4 " + (b2 || b4));

        //Disjuncao exclusiva
        System.out.println("b1 ^ b3 " +(b1 ^ b3));
        System.out.println("b4 ^ b1 " +(b4 ^ b1));

        //Negacao
        System.out.println("!b1 " + !b1);
        System.out.println("!b2 " + !b2);

        // Aplicando em mais casos:
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true ));  
        System.out.println("((i1 > i2) || (f2 < f1)) " + ((i1 > i2) || (f2 < f1)));  
        
        //Verificador de direito de auxilio
        double salarioMensal = 1893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        // melhorando a linha de código acima

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDepedentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo)&& (muitosDepedentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDepedentes);
       // System.out.println("recebeAuxilio " + recebeAuxilio);

        if (recebeAuxilio == false){
           System.out.println("auxilio negado"); 
        }else{
            System.out.println("Auxixlio liberado");
        }

    }   


}