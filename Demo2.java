

package demo2;

import java.util.*;
public class Demo2 {


    public static void main(String[] args) {
        HashMap<Integer,String> hobj= new HashMap<Integer,String>();
        Scanner src=new Scanner(System.in);
        int i=0;
        System.out.println("Enter no. of elements");
        int count=src.nextInt();
        do{
           
            System.out.println("Enter Key & Value");
            int key=src.nextInt();
            String value=src.nextLine();
            hobj.put(key,value);
            i++;
        }while(i<count);
        
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hobj);
        System.out.println("Key value sorted:"+tMap);
        System.out.println("Enter value to be searched");
        String search=src.nextLine();
        if(tMap.containsValue(search))
        
            System.out.println("Object exists");
        
        else
            System.out.println("value doesnt exist");
        
    }
    
}
