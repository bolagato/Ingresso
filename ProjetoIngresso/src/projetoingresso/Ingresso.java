package projetoingresso;

public class Ingresso {
    public double valor = 2000.00;
    public void imprime_valor(){
        System.out.println("O valor do seu ingresso é de: " + valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
