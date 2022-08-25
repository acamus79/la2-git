/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACAMUS79
 */
public class SocketServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // TODO code application logic here
            ServerSocket mySocket = new ServerSocket(80);

            System.out.println("Socket iniciado");
            while (true) {
                
                Socket socket = mySocket.accept();
                
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // DataInputStream in= new DataInputStream(socket.getInputStream());
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                
                System.out.println("IP:  " + socket.getInetAddress());
                System.out.println("Puerto:  " + socket.getPort());
                System.out.println("Mensaje:  " + in.readLine());
                
                //headers
                /*    out.println("HTTP/1.0 200 IP");
           out.println("Content-Type: text/html;  charset=utf-8");
           out.println("Server:  Mini Server program yourself");
           out.println(" ");*/
                //codigo html
                out.println("Este es un mensaje de vuelta");
                out.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketServidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
