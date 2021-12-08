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
public class Chevrolet implements Car,CarBuilder {
    Chevrolet (){
         buildBodyStyle();
         buildPower();
         buildEngine();
         buildBreaks();
         buildSeats();
         buildWindows();
         buildFuelType();
     }
    public void build(){
        System.out.println("A Chevrolet car have been built.");
    } 
    private final Carinfo B = new Carinfo("SEDAN");
     
    @Override
    public void buildBodyStyle() {
        B.setBodyStyle("External dimensions: overall length (inches): 202.9, " +
                "overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9," +
                " front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }
     
    @Override
    public void buildPower(){
        B.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }
 
    @Override
    public void buildEngine() {
        B.setEngine("3.5L Duramax V 6 DOHC");
    }
 
    @Override
    public void buildBreaks() {
        B.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
    }
 
    @Override
    public void buildSeats() {
        B.setSeats("Front seat center armrest.Rear seat center armrest.Split-folding rear seats");
    }
 
    @Override
    public void buildWindows() {
        B.setWindows("Laminated side windows.Fixed rear window with defroster");
         
    }
 
    @Override
    public void buildFuelType() {
        B.setFuelType("Gasoline 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
         
    }
     
    public Carinfo getCar(){
        return B;
    }
     
}
