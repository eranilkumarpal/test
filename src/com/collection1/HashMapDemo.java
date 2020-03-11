package com.collection1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapDemo {

	public static void main(String[] args) {

		// System.out.println(getCredentialsMap());

		// System.out.println(getCredentialsMap().get("customer"));
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anilk\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("email")).sendKeys(getUserName("customer"));
		driver.findElement(By.id("pass")).sendKeys(getPasswdName("customer"));
		String credentials_customer = getCredentialsMap().get("customer");

	}

	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("customer", "anilpal:Test@123");
		userMap.put("admin", "amarnath:Test@123");
		userMap.put("distributor", "suman:Test@123");
		userMap.put("sellor", "jyoti:Test@123");
		userMap.put("deliveryboy", "somesh:Test@123");
		userMap.put("deliveryboy", "somesh:Test@123");

		return userMap;
	}

	public static String getUserName(String role) {
		String credential = getCredentialsMap().get(role);
		return credential.split(":")[0];
	}

	public static String getPasswdName(String role) {
		String credential = getCredentialsMap().get(role);
		return credential.split(":")[1];
	}
}
