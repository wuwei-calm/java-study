package com.test.basic;

/**
 * @author czg
 * @date 2018/5/23
 */
public class BasicType {
    public byte bval;
    public short sval;
    public int ival;
    public long lval;
    public float fval;
    public double dval;
    public char cval;
    public boolean booval;

    public static void main(String args[]){
        BasicType b = new BasicType();
        System.out.println(b.bval);
        System.out.println(b.sval);
        System.out.println(b.ival);
        System.out.println(b.lval);
        System.out.println(b.fval);
        System.out.println(b.dval);
        System.out.println(b.cval);
        System.out.println(b.booval);
    }
}
