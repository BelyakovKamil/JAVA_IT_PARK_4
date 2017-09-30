package ru.itpark;




public class Vehicle {
    private String number;
    private String colour;
    private int power;

    void setNumber(String number) {
        this.number = number;
    }

    void setColour(String colour) {
        this.colour = colour;
    }


    void setPower (int power){
        if(power > 0 ) {
            this.power = power;
        }
        else
            this.power = 0;
    }

    String getNumber(){
        return number;
    }
    String getColour(){
        return colour;
    }
    int getPower(){
        return power;
    }
}
