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
        int indice;
        
        while(true)
        {
            System.out.print("pandosql> ");
            linea = scan.nextLine();
            
            if(linea.equals("exit"))
                break;
            
            if(linea.contains(";") && (indice = linea.indexOf(";")) != linea.length()){
                do {
                    indice++;
                    c.enviar(linea.substring(0, indice));
                    linea = linea.substring(indice);
                    indice = linea.indexOf(";");
                } while(indice != -1 && indice+1 != linea.length());
            }
            
            //c.enviar(linea);
        }
        c.desconectar();
    }
}
