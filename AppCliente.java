public class AppCliente {
    static Socket socket;

    public AppCliente() {
     try {
        socket = new Socket("localhost", 9600);
     } catch (Exception e) {
        ex.printStackTrace();
     }
    }

    public static void main(String args[]) {
        Requisicao requisicao = new Requisicao('+', 303, 4987);
        Resposta resposta = new Resposta();
        new AppCliente();

        Conexao.send(socket, requisicao);
        resposta = (Resposta)Conexao.receive(socket);

        System.out.println("O resultado e: "+resposta.getResultado());
    }
}
