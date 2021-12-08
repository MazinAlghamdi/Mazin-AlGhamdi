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
public class Carinfo {   
    private String bodyStyle;
    private String power;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private String carType;
     
    public Carinfo (String carType){
        this.carType = carType;
    }
     
    public String getBodyStyle() {
        return bodyStyle;
    }
    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getBreaks() {
        return breaks;
    }
    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }
    public String getSeats() {
        return seats;
    }
    public void setSeats(String seats) {
        this.seats = seats;
    }
    public String getWindows() {
        return windows;
    }
    public void setWindows(String windows) {
        this.windows = windows;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
     
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        System.out.println("--------------"+carType+"---------------------");
        System.out.print("Body: ");
        System.out.println(bodyStyle);
        System.out.print("Power: ");
        System.out.println(power);
        System.out.print("Engine: ");
        System.out.println(engine);
        System.out.print("Breaks: ");
        System.out.println(breaks);
        System.out.print("Seats: ");
        System.out.println(seats);
        System.out.print("Windows: ");
        System.out.println(windows);
        System.out.print("Fuel Type: ");
        System.out.println(fuelType);
         
        return sb.toString();
    }
}