package com.nikitagajbhiye.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    // Create a booking, get the token
    // Verify get the booking
    // Update the booking
    // delete the booking

    @Owner("Nik")
    @Description("Tc1 - Verify create the booking can be created")
    @Test(groups = "QA", priority = 1)
    public void Createthebooking(){
        Assert.assertTrue(true);
    }

    @Owner("Nik")
    @Description("Tc1 - Verify create the booking can be created")
    @Test(groups = "QA", priority = 2)
    public void Verifythebooking(){
        Assert.assertTrue(true);
    }

    @Owner("Nik")
    @Description("Tc1 - Verify create the booking can be created")
    @Test(groups = "QA", priority = 2)
    public void Updatethebooking(){
        Assert.assertTrue(true);
    }

    @Owner("Nik")
    @Description("Tc1 - Verify create the booking can be created")
    @Test(groups = "QA", priority = 3)
    public void deletethebooking(){
        Assert.assertTrue(true);
    }

}
