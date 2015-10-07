package clientepando;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente
{
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    
    public Cliente()
    {
        try
        {
            socket = new Socket(InetAddress.getLocalHost(), 6789);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
        }
        catch (IOException ex)
        {
            System.out.println("Servidor PandoSQL no disponible.");
            ex.printStackTrace();
        }
    }
    
    public void ejecutar(String lineas) throws IOException
    {
        try
        {
            out.writeUTF(lineas);
            out.flush();
            String respuesta = in.readUTF();
            if(!respuesta.isEmpty())
                System.out.println(respuesta);            
        }
        catch (IOException ex)
        {
            System.out.println("Error.");
            ex.printStackTrace();
        }
        //socket.close();
    }
}
