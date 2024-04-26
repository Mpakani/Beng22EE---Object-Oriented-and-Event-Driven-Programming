/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classification;

/**
 *
 *@author Irene Charles Mpakani
 */
import java.util.*;
public class Classification {
    
        
    
public class
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Male mo = new Male();
        Female fo = new Female();
        System.out.print("choose between male and female :\n "
        + "1 : Male\n"
        + " 2 : Female\n");
        int num;
        num= sc.nextInt();
        
        switch(num){
            case 1:
                mo.display();
                break;
            case 2:
                fo.display();
                break;
        }
            
        // TODO code application logic here
    }
    
}
