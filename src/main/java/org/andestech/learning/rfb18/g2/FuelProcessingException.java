package org.andestech.learning.rfb18.g2;

public class FuelProcessingException extends Exception {

    //.....
    private int f;

    public FuelProcessingException(String m)
    {
        super(m);
    }

    public FuelProcessingException(String m, int f)
    {
        super(m);
        this.f = f;
    }
}
