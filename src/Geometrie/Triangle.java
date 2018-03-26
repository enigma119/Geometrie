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
public class Triangle {
     
       
   
    public static void dessineTriangleHaut(int hauteur)
    {
        for (int i=0; i<hauteur;i++)
        {
            for (int j=0;j<i ;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
        
    }
    
    
    public static void dessineTriangleBas(int hauteur)
    {
        for (int i=0; i<=hauteur;i++)
        {
            for (int j=hauteur;i<j ;j--)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
        
    }
    
    
      public static void dessineTriangleIsocele(int hauteur)
    {
        for (int i=0; i<hauteur;i++)
        {
            for (int j=hauteur-i; j>0 ; j--)
            {
                System.out.print(" ");
            }
           for(int j=0; j<i ; j++)
           { 
               System.out.print(" *");
           }
           System.out.println("");
        }
        
    }
      
      public static double surfaceTriangleIsocele(int hauteur) 
      {
          int base=2*hauteur ;
          return base *(hauteur/2);
      }
      public static double perimetreTriangleIsocele(int hauteur)
      {
        int a=hauteur*4;
        return a;
      }
      
      public static double surfaceTriangleRectangle(int hauteur) 
      {
          int a=hauteur;
          return hauteur*(a/2);
      }
      
      public static double perimetreTriangleRectangle(int hauteur) 
      {
          return hauteur*3;
      }
      
 
      
      
      
}
    
