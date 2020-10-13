/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysnode;

import java.util.Scanner;

public class Mysnode {
    
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
               
        slist<String> list = new slist<>();
        
        String[] names;
        names = new String[100];
        String h = "";
        
        for(int i = 0;i <= 4; i++){
            
        names[i] = scan.next();
        list.addfirst(names[i]);
        
     }         
       list.display();
       list.dfl();
       
        names[5] = scan.next();
        list.addlast(names[5]);
        
        
        list.display();
       list.dfl();
       
       
       
      
   /*   int[] value;
      value = new int[34];
      
      int h = 0;
      
      for (int i = 0; i != 34 ; i++){
          
          value[i] = 1;
          
      }
      
      for (int i = 0; i != 34 ; i++){
          
          h = h + value[i];
          
      }
      
      System.out.print(h); */
      
      
         
    }
    
}
