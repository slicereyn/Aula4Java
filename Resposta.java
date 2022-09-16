public class Resposta {
    private float resultado;
    private int status;

    public Resposta() {
        
    }

    public Resposta(float resultado, int status){
        this.resultado = resultado;
        this.status = status;
    }

    public float getResultado(){
        return resultado;
    }

    public void getResultado(float resultado) {
        this.resultado = resultado;
    }
}
