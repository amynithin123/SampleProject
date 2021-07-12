package paralleltest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallelDP {
	
	
	
	@Test(dataProvider="getData")
	public void doLogin(String b) throws InterruptedException {
		
		System.out.println("Browser name: "+b);
		
		Thread.sleep(3000);
	}
	
	
	@DataProvider(parallel=true)
	public Object[][]getData(){
		
		Object[][] data=new Object[2][1];
		data[0][0]="chrome";
		data[1][0]="firefox";
		return data;
		
		
	}

}
