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
public class Rectangle 
{
    public static int perimetre(int longeur,int largeur)
    {
        return 2*(longeur+largeur);
        
    }
    public static int surface(int longeur,int largeur)
    {
        return longeur*largeur;
    }
    
    public static void  asterisque(int nombre)
    {
        for(int i=0;i<nombre;i++)
        {
            System.out.print(" * ");
        }
        //methode dessin
       
    }
     public static void dessin(int longeur,int largeur)
        {
            for(int i=0;i<=largeur; i++)
            {
                asterisque(longeur);
                System.out.println(" * ");
            }
        }
}
