/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Review1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String nama,kelas,hobi,hob;
    Scanner input=new Scanner (System.in);
  
    for (int i=1;i<3;i++)
      
    {
        System.out.println ("Data peserta ke-"+i);
    
           
   System.out.print("Nama : ");
        nama=input.nextLine();
        
        System.out.print("Kelas: ");
        kelas=input.nextLine();
        
        System.out.print("Hobi (bas/ban/mad) : ");
        hobi=input.nextLine();  
        
        
        switch(hobi){
            case "bas":
            hob=" basket" ;
                break;
            case "ban": 
            hob=" band";
                break;
            case "mad": 
            hob=" mading";
                break;
            default:
            hob=" hobi tidak tersedia";
                break;  
    }
    
        System.out.println("terimakasih telah menginput "+nama+" kelas "+kelas+" dan hobi"+hob);  
        System.out.println ("");
}}}
