public class AppServidor {
    Socket client_socket;
    ServerSocket server_socket;

    public AppServidor() {
        try {
            server_socket = new ServerSocket(9600);
            System.out.println("Servidor no ar...");
        } catch (Exception e) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Requsicao requisicao = new Requisicao();
        Resposta resposta = new Resposta();
        Conexao conexao;
        new AppServidro();
        if (connect()) {
            requisicao = (Requisicao)conexao.receive(client_socket);
            switch (requisicao.getOperacao()) {
                case '+':
                    resposta.setResultado(requisicao.getNum1() + requisicao.getNum2());
                    resposta.setStatus(0);
                    System.out.println("Vai fazer "+requisicao.getNum1()"+ "+getNum2());
                    System.out.println("E o resultado e: "+resposta.getResultado());
                    break;
            }
            Conexao.send(client_socket, resposta);

            try {
                server_socket.close();
                client_socket.close();
            } catch (Exception e) {
                ex.printStackTrace();
            }
        }
    }

    public boolean connect(){
        try {
            client_socket = server_socket.accept();
            return true;
        } catch (Exception e) {
            ex.printStackTrace;
            return false;
        }
    }
}
