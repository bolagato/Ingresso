package projetoingresso;

public class CamaroteInferior extends Vip{
    public String localizacao = "Camarote Inferior - Parte B";
        @Override
        public void imprime_valor(){
        System.out.println("O valor do seu ingresso é de: " + this.cara()
                          + "\nLocalização: " + localizacao
                          + "\nTipo do Ingresso: Vip 1");
    }
}
