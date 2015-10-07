package clientepando;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Cliente c = new Cliente();
        if(args.length == 0)
            System.out.println("Debe ingresar un archivo");
        else
            c.ejecutar(args[0] + " " + args[1]);
    }
}
