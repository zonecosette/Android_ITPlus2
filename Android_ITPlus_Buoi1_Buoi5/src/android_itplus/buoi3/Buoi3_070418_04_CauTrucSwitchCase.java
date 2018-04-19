/*Bai tap:
Nhap so tu 1 den 10 sau do in ten theo so tieng anh
*/
package android_itplus.buoi3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi3_070418_04_CauTrucSwitchCase 
{
    public static void main (String[] args)
    {
        //buoc 1: Khai bao bien so
        int so;
        
        //buoc 2: Nhap so tu ban phim
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so vao (tu 1-10):");
        so = scan.nextInt();
        
        //buoc 3: xu ly va in ra ket qua
        switch(so)
        {
            case 1:
                System.out.println("Hi one.");
            //break; 
            
            case 2:
                System.out.println("Hi two.");                           
            //break;
            
            case 3:
                System.out.println("Hi three.");                          
            //break;
            
            case 4:
                System.out.println("Hi four.");             
            break;
            
            case 5:
                System.out.println("Hi five.");                 
                
            break; 
            
            case 6:
                System.out.println("Hi six.");                 
                
            break; 
            
            case 7:
                System.out.println("Hi seven.");                 
                
            break; 
            
            case 8:
                System.out.println("Hi eight.");                 
                
            break;   
            
            case 9:
                System.out.println("Hi nine.");                 
                
            break;  
            
            case 10:
                System.out.println("Hi ten.");                 
                
            break;   
            
            case 11:
                System.out.println("Hi eleven.");                 
                
            break;   
            
            case 12:
                System.out.println("Hi twelve.");                 
                
            break;   
            
        }
    }
}
