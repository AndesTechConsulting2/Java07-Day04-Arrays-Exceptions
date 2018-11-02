package org.andestech.learning.rfb18.g2;

public class Engine {
    //..

    public static final int DELATA_FUEL = 17;


    private int fuel = 0;

    private void blockValve(){
        //..

         System.out.println("Valve closed..");

    }

    @Deprecated
    private void addFuel_old(int f)
    {
        if(f >= DELATA_FUEL) return;
// ....
        fuel = f;
        System.out.println("fuel ok: " + f);

    }

    public void addFuel(int f) throws FuelProcessingException
    {
        if(f >= DELATA_FUEL)
            throw new FuelProcessingException("Превышен лимит впрыска... f="+f,f);
// ....
        fuel = f;
        System.out.println("fuel ok: " + f);

    }
}
