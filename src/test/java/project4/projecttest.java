package project4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class projecttest {

	@Test
	public void SUM() {
		System.out.println("SUM");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void SUB() {
		System.out.println("SUB");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void MULTI() {
		System.out.println("MULTI");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void DIV() {
		System.out.println("DIV");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}

}
