package projetoingresso;

public class Vip extends Ingresso{

   

    
       public double cara() {
       double taxa = valor + 600;
       return taxa;
    }
    @Override
   public void imprime_valor(){
        System.out.println("O valor do seu ingresso é de: " + this.cara());
    }
   }
