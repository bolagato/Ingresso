package projetoingresso;

public class Normal extends Ingresso{
    @Override
    public void imprime_valor(){
        System.out.println("O valor do seu ingresso é de: R$ " + valor + "\nTipo do Ingresso: Normal");
    }
}
