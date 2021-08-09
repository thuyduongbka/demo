package com.duongntt.item3;

import java.io.Serializable;

/*
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public void leaveTheBuilding(){}
}
*/
/*
// Singleton with static factory
public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){}
    public static Elvis getInstance(){return INSTANCE;}
    public void leaveTheBuilding(){}

    // readResolve method to preserve singleton property
    private Object readResolve() {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return INSTANCE;
    }
}
*/
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding(){}
}
