package com.automobile;

import com.automobile.TwoWheeler.Hero;

public class Honda extends Vehicle{
    int speed=60;
public int getspeed(){
    return speed;
}
public void cdPlayer(){
    System.out.println("provides facility to control the cd player which is available in car");
}

    @Override
    public String getModelName() {
        return "hondamodel";
    }

    @Override
    public String getRegistrationNumber() {
        return "honda02";
    }

    @Override
    public String getOwnerName() {
        return "honda";
    }
}
class Test{
    public static void main(String[] args) {
        Honda obj1=new Honda();
        obj1.cdPlayer();
        System.out.println(obj1.getModelName());
        System.out.println(obj1.getOwnerName());
        System.out.println(obj1.getRegistrationNumber());
        System.out.println(obj1.getspeed());
        System.out.println("*******************************************************");
Hero obj2=new Hero();
        obj2.radio();
        System.out.println(obj2.getModelName());
        System.out.println(obj2.getOwnerName());
        System.out.println(obj2.getRegistrationNumber());
        System.out.println(obj2.getSpeed());
}
}