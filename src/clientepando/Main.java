package clientepando;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Cliente c = new Cliente();
        Scanner scan = new Scanner(System.in);
        String linea = "";

        while(true)
        {
            System.out.print("pandosql> ");
            linea = scan.nextLine();
            if(linea.equals("exit"))
                break;
            c.enviar(linea);
        }
        c.desconectar();
    }
}
