/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometrie;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TesteFigGeo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
            
    {
        System.out.println("*********** Programme Géométrique ***********");
        System.out.println("\n");
        System.out.println("**********************************************|");
        System.out.println("|                   MENU                      |");
        System.out.println("**********************************************|");
        System.out.println("|                                             |");
        System.out.println("|     1. Pour traiter un Carre                |");
        System.out.println("|     2. Pour traiter un Rectangle            |");
        System.out.println("|     3. Pour traiter un Triangle             |");
        System.out.println("|     4. pour Sortir du programme             |");
        System.out.println("|                                             |");
        System.out.println("**********************************************|");
        System.out.println("\nVeuillez faire un choix dans le Menu SVP :");
        Scanner menu=new Scanner(System.in);
        String rep; 
        int choix=menu.nextInt();
        while(choix<1 ||choix>4)
        {
            System.out.println("Votre choix ne figure pas dans le Menu. Veilez Reessayer SVP ");
         System.exit(0);
        }   
       
       
        switch (choix) {
            case 1:
                do{
                    System.out.println("\n****** Traitement du Carre ******");
                    System.out.println("Veillez entrez le cote: ");
                    Scanner lire=new Scanner(System.in);
                    int cote=lire.nextInt();
                    //dessin du carre
                    Carre.dessine(cote);
                    // Perimetre du carre
                    int perimetre=Carre.perimetre(cote);
                    System.out.println("\nLe perimetre= "+perimetre);
                    
                    // Surface du carre
                    int surface=Carre.surface(cote);
                    System.out.println("\nLa surface est = "+surface);
                    lire.nextLine();
                    System.out.println("Voulez- vous continuer: ? Oui / Non");
                    rep=lire.nextLine(); 
                    while(!(rep.equalsIgnoreCase("non")) && !(rep.equalsIgnoreCase("oui")))
                          {
                              System.out.println("Entrer la bonne reponse :");
                               rep=lire.nextLine();
                          }
                           
                    }while((rep.equalsIgnoreCase("oui")));

                   break;
                    
            case 2:
                do{
                    System.out.println("\n****** Traitement d'un Rectangle *******");
                    Scanner lire=new Scanner(System.in);
                    ///lectuer de la longeur et de la largeur
                    System.out.println("Entrer la longueur: ");
                    int longeur=lire.nextInt();
                    System.out.println("Entrer la largeur: ");
                    int largeur=lire.nextInt();
                    ///dessin de la figure
                    Rectangle.dessin(longeur,largeur);
                    ///Calcul et affichage du Perimetre
                    int perimetre=Rectangle.perimetre(longeur, largeur);
                    System.out.println("\nperimetre="+perimetre);
                    ///calcul et affichage de la surface
                    int surface=Rectangle.surface(longeur, largeur);
                    System.out.println("Surface="+surface);
                    lire.nextLine();
                    System.out.println("Voulez- vous continuer: ? Oui / Non");
                    rep=lire.nextLine();
                   while(!(rep.equalsIgnoreCase("non")) && !(rep.equalsIgnoreCase("oui")))
                          {
                              System.out.println("Entrer la bonne reponse :");
                               rep=lire.nextLine();
                          }
                           
                    }while((rep.equalsIgnoreCase("oui")));

                   break;
                
            case 3:
                System.out.println("\n****** Traitement d'un Triangle *******\n");
                System.out.println("Veillez choisir un type de Triangle a traiter\n");
                System.out.println("1. Triangle Haut ");
                System.out.println("2. Triangle Bas ");
                System.out.println("3. Triangle Isocele ");
                Scanner men=new Scanner(System.in);
                int choice=men.nextInt();
                if(choice==1)
                {
                    do{
                        System.out.println( "Vous avez choisi le traitement d'un Triangle Haut ");
                        System.out.println("Entrer la Hauteur: ");
                        Scanner lire=new Scanner(System.in);
                        int hauteur=lire.nextInt();
                        Triangle.dessineTriangleHaut(hauteur);
                        double aire=Triangle.surfaceTriangleRectangle(hauteur);
                        System.out.println("L'aire vaut: "+aire);
                        double peri=Triangle.perimetreTriangleRectangle(hauteur);
                        lire.nextLine();
                        System.out.println("Voulez- vous continuer: ? Oui / Non");
                        rep=lire.nextLine();
                        while(!(rep.equalsIgnoreCase("non")) && !(rep.equalsIgnoreCase("oui")))
                          {
                              System.out.println("Entrer la bonne reponse :");
                               rep=lire.nextLine();
                          }
                           
                       }  while((rep.equalsIgnoreCase("oui")));

                   break;
                } 
      
                if(choice==2)
                {
                    do{
                        System.out.println( "Vous avez choisi le traitement d'un Triangle Bas ");
                        System.out.println("Entrer la Hauteur: ");
                        Scanner lire=new Scanner(System.in);
                        int hauteur=lire.nextInt();
                        Triangle.dessineTriangleBas(hauteur);
                        double aire=Triangle.surfaceTriangleRectangle(hauteur);
                        System.out.println("L'aire vaut: "+aire);
                        double peri=Triangle.perimetreTriangleRectangle(hauteur);
                        lire.nextLine();
                        System.out.println("Voulez- vous continuer: ? Oui / Non");
                        rep=lire.nextLine();
                        while(!(rep.equalsIgnoreCase("non")) && !(rep.equalsIgnoreCase("oui")))
                          {
                              System.out.println("Entrer la bonne reponse :");
                               rep=lire.nextLine();
                          }
                           
                        }while((rep.equalsIgnoreCase("oui")));
                        break;
                        }
                   
                             
                 if(choice==3)
                {
                    do{
                        System.out.println( "Vous avez choisi le traitement d'un Triangle Isocele ");
                        System.out.println("Entrer la Hauteur: ");
                        Scanner lire=new Scanner(System.in);
                        int hauteur=lire.nextInt();
                        Triangle.dessineTriangleIsocele(hauteur);
                        double aire=Triangle.surfaceTriangleIsocele(hauteur);
                        System.out.println("L'aire vaut: "+aire);
                        double peri=Triangle.perimetreTriangleIsocele(hauteur);
                        System.out.println("Le perimetre vaut: "+peri);
                        lire.nextLine();
                        System.out.println("Voulez- vous continuer: ? Oui / Non");
                        rep=lire.nextLine();
                       while(!(rep.equalsIgnoreCase("non")) && !(rep.equalsIgnoreCase("oui")))
                          {
                              System.out.println("Entrer la bonne reponse :");
                               rep=lire.nextLine();
                          }
                           
                       }while((rep.equalsIgnoreCase("oui")));

                   break;
                }      
                break;
                
                case 4:
               System.out.println("\t ====== FIN DU PROGRAMME ====== ");
               System.exit(0);// permet darreter lexecution du programme
               break;
               
            default:
                break;
        }
      
    }
     
    
}

