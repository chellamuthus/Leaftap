package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class CreateLead extends Annotations{
	public CreateLead() {
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy (how=How.ID,using="createLeadForm_companyName") WebElement companyname;
	@FindBy (how=How.ID,using="createLeadForm_firstName") WebElement firstname;
	@FindBy (how=How.ID,using="createLeadForm_lastName") WebElement lastname;
	@FindBy (how=How.NAME,using="submitButton") WebElement submit;
	
	public CreateLead typecname(String data) {
		clearAndType(companyname, data); 
		return this;
	}
	
	public CreateLead typefname(String data) {
		clearAndType(firstname, data); 
		return this;
	}
	public CreateLead typelname(String data) {
		clearAndType(lastname, data); 
		return this;
	}
	
	public CreateLead clickSubmit() {
		click(submit); 
		return this;
	}
}
