/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbase;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guagliumi.gianluca
 */
public class ClientBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Apertua connessione");
        try {
            Socket server = new Socket("10.1.33.29", 5500);

            PrintWriter out = new PrintWriter(server.getOutputStream(), true);
            Scanner tastiera = new Scanner(System.in);
            String s = "";
            
            while (!s.equals("exit")) {
                System.out.println("Inserire numero da inviare al server:");
                s = tastiera.nextLine();
                out.println(s);
            }

            server.close();
            System.out.println("chiusura connessione");
        } catch (IOException ex) {
            Logger.getLogger(ClientBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
