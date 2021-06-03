package Genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Proprtyfile implements Autoconstant
{

	public String getData(String key) throws FileNotFoundException, IOException
	{
	Properties p=new Properties();
	p.load(new FileInputStream(propertyfile));
	return p.getProperty(key);
	
}
}
