package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticTest {
    @Test
    public void givenTwoInteger_WhenAdd_ShouldReturnAddition()
    {
        Arithmatic arithmatic = new Arithmatic();
        int result=arithmatic.add(4,5);
        Assert.assertEquals( 9,result);
    }

    @Test
    public void givenTwoInteger_WhenSub_ShouldReturnSubstraction()
    {
        Arithmatic arithmatic = new Arithmatic();
        int result=arithmatic.sub( 4,3);
        System.out.println("Substration" +result);
        Assert.assertEquals( 1,result);
    }

    @Test
    public void givenTwoInteger_WhenMult_ShouldReturnMultiplication() {
        Arithmatic arithmatic = new Arithmatic();
        int result = arithmatic.mult(5, 4);
        System.out.println("Multiplication" +result);
        Assert.assertEquals(22,result);
    }

    @Test
    public void givenTwoInteger_WhenDiv_ShouldReturnDivision() {
        Arithmatic arithmatic = new Arithmatic();
        int result = arithmatic.div(20, 4);
        System.out.println("Division"+result);
        Assert.assertEquals(5,result);
    }

}
