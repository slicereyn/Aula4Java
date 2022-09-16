import java.io.Serializable;

public class Requisicao implements Serializable{
    private char operacao;
    private float num1;
    private float num2;

    public Requisicao() {
        
    }

    public Requisicao(char operacao, float num1, float num2) {
        this.operacao = operacao;
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getOperacao() {
        return operacao;
    }
}
