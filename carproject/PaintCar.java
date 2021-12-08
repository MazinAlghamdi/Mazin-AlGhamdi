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
public class PaintCar extends CarDecorator {
 
    public PaintCar(Car car) {
          super(car);       
       }
 
       @Override
       public void build() {
          System.out.println("----------------------------------"); 
          internalVariable.build();        
          paintCar();
       }
        
       private void paintCar(){
          System.out.println("This car have been painted as well.");
          System.out.println("----------------------------------");
       }
}