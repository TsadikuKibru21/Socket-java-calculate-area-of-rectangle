/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import java.io.*;
import java.net.*;
class Client
{
            public static void main(String args[])throws IOException
            {
                        Socket s=new Socket(InetAddress.getLocalHost(),1064);
                        BufferedReader br;
                        PrintStream ps;
                        String str;
                        System.out.println("Enter Radius  :");
                        br=new BufferedReader(new InputStreamReader(System.in));
                        ps=new PrintStream(s.getOutputStream());
                        ps.println(br.readLine());
                        br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                        str=br.readLine();
                        System.out.println("Area of the circle is : "+str);
                        br.close();
                        ps.close();
                   
            }
}