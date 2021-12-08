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
public abstract class CarDecorator implements Car{
     
    protected Car internalVariable;
     
    public CarDecorator(Car internalVariable){
          this.internalVariable = internalVariable;
    }
 
    public abstract void build();
 
}