package projetoingresso;

public class CamaroteSuperior extends Vip{

    public String local = "Camarote Superior - Parte A";
 
    
    public double bro() {
       double conta = this.cara() + 600;
       return conta;
    }
            @Override
        public void imprime_valor(){
        System.out.println("O valor do seu ingresso é de: " + this.bro()
                          + "\nLocalização: " + local
                          + "\nTipo do Ingresso: Vip 2");

}
}