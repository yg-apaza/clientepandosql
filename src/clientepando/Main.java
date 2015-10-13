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
        /*
        if(args.length == 2)
            c.ejecutar(args[0] + " " + args[1]);
        else
            System.out.println("Debe ingresar un solo un archivo y una opcion.");
        */
        while(true)
        {
            System.out.print("pandosql> ");
            linea = scan.nextLine();
            c.enviar(linea);
        }
    }
}
