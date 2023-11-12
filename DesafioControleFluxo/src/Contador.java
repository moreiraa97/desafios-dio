import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner terminal = new Scanner(System.in);
        System.out.print("\nDigite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois); 

        }catch(ParametrosInvalidosException e){
            
            System.out.print("\nO segundo parâmetro deve ser maior que o primeiro.");

        }

    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){ 

            throw new ParametrosInvalidosException(); 
        }

        int contagem = parametroDois - parametroUm; 

        for(int x = 0; x < contagem; x++){
            System.out.print("\nImprimindo o numero 1: " + parametroUm);
            System.out.print("\nImprimindo o numero 2: " + parametroDois);  
            System.out.print("\n"); 
        }

    }


}
