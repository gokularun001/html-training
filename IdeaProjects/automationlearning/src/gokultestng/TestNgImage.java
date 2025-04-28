package gokultestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class TestNgImage {
    @Test(priority = 1)
        void image() throws IOException {
        Reporter.log("<br><img src='/src/image/DSCO4566.JPG' height='500' width='500'/><br>");
        System.out.println("TestNG Reporter adding Image");//screenshots/download.jpg,image/DSCO4566.JPG
        }

    @Test(priority = 2)
        void adding(){
        System.out.println("Sucessful added");
        Reporter.log("Added Image test");
        }
}
