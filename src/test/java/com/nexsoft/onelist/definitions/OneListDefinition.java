package com.nexsoft.onelist.definitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.nexsoft.onelist.pom.OneList;
import com.nexsoft.onelist.pom.ScreenshotHandler;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OneListDefinition {

	protected AndroidDriver driver;
	protected OneList oneLst;
	protected ScreenshotHandler sc;

	@Before
	public void init() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformVersion", "11.0");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		oneLst = new OneList(driver);
		sc = new ScreenshotHandler(driver);
	}

	@Given("User berada di halaman MainActivity")
	public void gotoMainActivity() throws Throwable {
		System.out.println("User berada di halaman MainActivity");
	}

	@When("User menekan tombol add user")
	public void addNewList() throws Throwable {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println("User menekan tombol add user");
		oneLst.btnAddList.click();
	}

	@And("User input list name {string}")
	public void inputTitleList(String name) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(name);
		oneLst.txtListTitle.sendKeys(name);
	}

	@And("User menekan tombol centang untuk menyimpan list name")
	public void saveTitleList() {
		System.out.println("User menekan tombol centang untuk menyimpan list name");
		oneLst.btnSaveList.click();
	}

	@And("User input isi list 1 {string}")
	public void inputList(String list1) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println(list1);
		oneLst.txtListAdd.sendKeys(list1);
		oneLst.btnSaveAdd.click();
	}

	@And("User input isi list 2 {string}")
	public void inputList2(String list2) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println(list2);
		oneLst.txtListAdd.sendKeys(list2);
		oneLst.btnSaveAdd.click();
	}

	@Then("User input isi list 3 {string}")
	public void inputList3(String list3) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println(list3);
		oneLst.txtListAdd.sendKeys(list3);
		oneLst.btnSaveAdd.click();
		sc.screenshoot(driver);
	}
	
	@And("User input list name 2 {string}")
	public void inputTitleList1(String name1) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(name1);
		oneLst.txtListTitle.sendKeys(name1);
		sc.screenshoot(driver);
	}
	
	@And("User input list name 3 {string}")
	public void inputTitleList2(String name2) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(name2);
		oneLst.txtListTitle.sendKeys(name2);
	}
	
	@Then("User membatalkan pilihan ")
	public void cancelOption() {
		System.out.println("cancel");
		oneLst.btnCancelList.click();
		sc.screenshoot(driver);
	}
	

	@And("User kembali ke halaman MainActivity")
	public void backToMainActivity() {
		System.out.println("User kembali ke halaman MainActivity");
	}

}
