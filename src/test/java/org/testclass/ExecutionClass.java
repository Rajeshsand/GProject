package org.testclass;

import org.baseclass.HelperClass;
import org.pomframe.PojoClass;

public class ExecutionClass extends HelperClass {
	
	
	public static void main(String[] args) throws InterruptedException  {
		PojoClass pc = new PojoClass();
		browserLaunch("chrome");
		maximixeWindow();
		launchUrl("https://www.directline.com/");
		Thread.sleep(3000);
		btnClick(pc.getNaviBtn());
		btnClick(pc.getNaviAcc());
		btnClick(pc.getNaviIhaveAcc());
		
		
	}
	

}
