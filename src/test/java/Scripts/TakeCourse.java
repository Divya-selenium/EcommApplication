package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import POMpages.SeleniumPage;
import POMpages.SkillRrayLoginPage;
import POMpages.TakeThiscoursePage;

public class TakeCourse extends Baseclass {
	@Test
	public void takecourse() throws FileNotFoundException, IOException, InterruptedException {
		SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
		s.serachTxtbox(p.getData("selsubject"));
		s.serachbutton();
		
		SeleniumPage sel=new SeleniumPage(driver);
		sel.coursebtn();
		
		TakeThiscoursePage t=new TakeThiscoursePage(driver);
		utilies.switchFrame(driver);
		t.playbutton();
		Thread.sleep(10000);
		t.pausebtn();
		utilies.switchback(driver);
		t.takethiscourse();
		
		
	}
}
