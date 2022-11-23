/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;
import java.io.*;
import java.net.*;
class Server
{
            public static void main(String args[])
            {
                        try
                        {
                                    ServerSocket ss=new ServerSocket(1064);
                                    System.out.println("Waiting for Client Request");
                                    Socket s=ss.accept();
                                    BufferedReader br;
                                    PrintStream ps;
                                    String str;
                                    br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                                    str=br.readLine();
                                    System.out.println("Received radius");
                                    double r=Double.parseDouble(str);
                                    double area=3.14*r*r;
                                    ps=new PrintStream(s.getOutputStream());
                                    ps.println(String.valueOf(area));                              
                                    br.close();
                                    ps.close();
                                    s.close();
                                    ss.close();
                        }
                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
            }
}
