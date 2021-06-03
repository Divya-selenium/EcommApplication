package Scripts;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import POMpages.AddtoCartPage;
import POMpages.DemoSkillraryLoginpage;
import POMpages.SkillRrayLoginPage;

public class Addtocart extends Baseclass

{
@Test
public void addproduct() 
{
	SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
	s.gearsButton();
	s.skillraryDemoapp();
	
	utilies.switchTab(driver);

	DemoSkillraryLoginpage d = new DemoSkillraryLoginpage(driver);
	utilies.mouseHover(driver, d.getCoursebtn());
	d.seleniumTrainingBtn();
	
	AddtoCartPage a=new AddtoCartPage(driver);
	utilies.doubleClick(driver,a.getAddbtn());
	a.addtocartButton();
	utilies.alertPopup(driver);
}
}
