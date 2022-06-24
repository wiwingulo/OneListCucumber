package com.nexsoft.onelist.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class OneList {

	private AndroidDriver driver;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	public WebElement btnAddList;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement txtListTitle;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/addItemEditText")
	public WebElement txtListAdd;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validate")
	public WebElement btnSaveAdd;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/moreOptionsCursor")
	public WebElement btnMoreOpt;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEditList")
	public WebElement btnCancelList;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnSaveList;
	
	@AndroidFindBy(id = "//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']")
	public WebElement deleteTxt;
	
	public OneList (AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	
}
