/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docopy;
import java.io.*;
/**
 *
 * @author VAS_student
 */
public class DoCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b[]=new byte[100];
        int read=0;
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\vas_student\\Documents\\input.txt");
            FileOutputStream fos=new FileOutputStream("C:\\Users\\vas_student\\Documents\\output.txt");
            {
                while((read=fis.read(b))!=-1)
                {
                    if(read<b.length)
                        fos.write(b,0,read);
                    else
                        fos.write(b);
                    
                }
            }
        }
                catch(IOException ex)
                        {
                        System.out.println(ex);
                        }
            
        }
    }
    

