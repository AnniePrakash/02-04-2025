package org.sample;

import java.util.PriorityQueue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class testNGSample {
	
	@BeforeClass
	private void tc01() {
		System.out.println("Before class");

	}
	
	@BeforeMethod
	private void tc02() {
		System.out.println("Before method");

	}
	
	@Test(priority = 2)
	private void tc03() {
		System.out.println("Test 1");

	}
	
	@Test(priority = 1)
	private void tc06() {
		System.out.println("Test 2");

	}
	
	@AfterClass
	private void tc04() {
		System.out.println("After class");

	}
	
	@AfterMethod
	private void tc05() {
		System.out.println("After method");

	}

}
