package gokultestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataaPprovider {
    @Test(dataProvider = "arun")
    void gokul{
        System.out.println("Hello Guys");
    }
    @DataProvider(name = "arun")
    Object [][] daatte{
            Object [][]={{kabil,gopt}
    }
}
