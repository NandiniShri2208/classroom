package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

 public class Hero extends Vehicle
{
    int Speed=50;
    public int getSpeed(){
        return Speed;
    }
    public void radio(){
    System.out.println("provide facility to control radio device ");
}

    @Override
    public String getModelName() {
        return "heromodel";
    }

    @Override
    public String getRegistrationNumber() {
        return "hero01";
    }

    @Override
    public String getOwnerName() {
        return "Hero";
    }
}
