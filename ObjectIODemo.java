/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectiodemo;
import java.io.*;
import java.util.*;
class Person implements Serializable 
{
    String fname;
    String lname;
    int age;

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }
    
    public String toString()
    {
        StringBuffer sb= new StringBuffer();
        sb.append(fname);
        sb.append("\n");
        sb.append(lname);
        sb.append("\n");
        sb.append(age);
        return sb.toString();
    }
}
public class ObjectIODemo {

public void WriteObject()
{
       ObjectOutputStream out= null;
       Scanner src=new Scanner(System.in);
       System.out.println("Enter Firstname");
       String myname = src.nextLine();
       System.out.println("Enter Lastname");
       String lastname = src.nextLine();
       System.out.println("Enter Age");
       int a=src.nextInt();
       Person p= new Person();
       p.setFname(myname);
       p.setLname(lastname);
       p.setAge(a);
       try{
       out= new ObjectOutputStream(new FileOutputStream("C:\\Users\\vas_student\\Documents\\fname")); 
       out.writeObject(p);
          }   
       catch(IOException ex)
       {
           System.out.println(ex);
       }
}
public static void main(String[] args) {
       ObjectIODemo o= new ObjectIODemo();
       o.WriteObject();
    }
    
}
