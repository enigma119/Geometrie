/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometrie;



/**
 *
 * @author User
 */
public class Carre 

{
    public static int perimetre (int cote)
    {
        return cote *4;
    }
    
    public static int surface(int cote)
    {
        return cote * cote;
    }
         
   
   public static void dessine(int cote)
   {
      
       for(int c=0 ;c<=cote ;c++)
       {
           
           for(int k=0; k<cote; k++)
           {
               System.out.print(" * ");
           }
           System.out.println(" * ");
          
       }
       
   }
    
}
