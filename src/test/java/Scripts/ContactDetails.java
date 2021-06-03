package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.Point;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import POMpages.ContactUspage;
import POMpages.SkillRrayLoginPage;

public class ContactDetails extends Baseclass {
	@Test
	public void contatctus() throws FileNotFoundException, IOException, InterruptedException {
		
		SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
		Point loc=s.getContactus().getLocation();
		
		int x=loc.getX();
		int y=loc.getY();
		
		utilies.scollBar(driver, x, y);
		Thread.sleep(5000);
		s.cotatctusbtn();
		
		ContactUspage c=new ContactUspage(driver);
		c.nameTxtbox(p.getData("name"));
		c.emailAddress(p.getData("email"));
	    c.subjectTxtbox(p.getData("subject"));
	    c.messgaetb(p.getData("message"));
	    c.sendusemail();
		
	}

}

