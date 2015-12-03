/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author carlos
 */
public class Car {
    private Size size;
    private String brand, plate;

    public Car(String brand, String plate, Size size) {
        this.brand = brand;
        this.plate = plate;
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return  "size: " + size + "\nbrand: " + brand + "\nplate: " + plate;
    }
    
    
    
}
