

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Mouftah Abdelaziz
 */
public class Point1 
{
  float x;
  float y;
  public Point1()
   
   {
      x=0; y=0;
     
   }
  public void setx(float a)
    { 
      x=a; 
    }
  public void sety(float b)
     {
      y=b;
      }
          
   public void afficherCoordonnée()
       {
       System.out.println("Abscisse =" +x);
       System.out.println("Ordonné =" +y);
        }
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
     {
     Point1 p;
      p = new Point1();
     p.x= 2; p.y= 3;
     p.afficherCoordonnée();
 
     }
    
}
