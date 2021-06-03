package Genericlib;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot implements Autoconstant {
public String getphoto(WebDriver driver,String name) throws IOException
{
	
Date d=new Date(0);


String date=d.toString().replace("_",":");
TakesScreenshot t=(TakesScreenshot)driver;
File src=t.getScreenshotAs(OutputType.FILE);
File des=new File(photopath+date+name+".png");
FileUtils.copyFile(src,des);
return date;
		

}
}