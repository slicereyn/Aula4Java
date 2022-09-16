public class Conexao {
    public static void send(Socket socket, Object obj) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(obj);
        } catch (Exception e) {
            System.err.println("Excecao no OutputStream");
        }
    }

    public static Object receive(Socket socket) {
        Object obj = null;
        try {
            ObjectInputStream in = new ObjectOutputStream(socket.getInputStream());
            obj = in.readObject();
        } catch (Exception e) {
            System.err.println("Excecao no InputStream: " +e);
        }
        return obj;
    }
}
