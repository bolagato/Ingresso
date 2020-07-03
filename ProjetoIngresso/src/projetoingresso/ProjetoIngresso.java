package projetoingresso;

import java.util.Scanner;



public class ProjetoIngresso {

    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite 1 para ingresso normal, e digite 2 para ingresso VIP");
      int a = leia.nextInt();
        
        switch(a){
            case 1:
                Normal ing = new Normal();
                ing.imprime_valor();
            break;
            case 2:
                System.out.println("Digite 1 para camarote superior, e digite 2 para camarote inferior");
                int b = leia.nextInt();
                
                switch(b){
                    case 1:
                        CamaroteSuperior sup = new CamaroteSuperior();
                        
                        sup.imprime_valor();
                    break;
                    
                    case 2:
                        CamaroteInferior inf = new CamaroteInferior();
                        inf.imprime_valor();
                    break;
                    }
            break;
          
        }
    }
    
}
