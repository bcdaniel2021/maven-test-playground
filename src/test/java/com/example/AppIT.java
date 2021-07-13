package com.example;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Integration test for simple App.
 */
public class AppIT {
    Random rand = new Random();

    @Test
    public void integrationTestShouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("Integration test passed!");
    }

    @Test
    public void dummyIntegrationTestFail()
    {
        fail();
        System.out.println("Integration test failed!");
    }

    @Test
    public void randomNumberIsEven()
    {
        assertEquals(0, rand.nextInt(100) % 2);
        System.out.println("Integration test failed!");
    }

    @Ignore
    @Test
    public void randomNumberIsOdd()
    {
        assertEquals(1, rand.nextInt(100) % 2);
        System.out.println("Integration test failed!");
    }


    @Test
    public void randomNumberIsMultipleOfThree()
    {
        assertEquals(0, rand.nextInt(100) % 3);
        System.out.println("Integration test failed!");
    }


    @Test
    public void randomNumberIsInTheLower20Range()
    {
        assertTrue(rand.nextInt(100) <= 20);
        System.out.println("Integration test failed!");
    }
}
