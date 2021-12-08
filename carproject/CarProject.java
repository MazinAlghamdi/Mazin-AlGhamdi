/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

/**
 *
 * @author pc
 */
public class CarProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Car car1 = new BMW();
      BMW car2 = new BMW ();  
      
      Car paintCar1 = new PaintCar(car1);
      paintCar1.build();
      System.out.println(car2.getCar());
          
      Car car3 = new Chevrolet();
      Chevrolet car4 = new Chevrolet();
        
      Car paintCar2 = new PaintCar(car3);
      paintCar2.build();
      System.out.println(car4.getCar());
       
       
   }
 
}
