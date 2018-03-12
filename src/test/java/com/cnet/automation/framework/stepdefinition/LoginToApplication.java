package com.cnet.automation.framework.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToApplication {
	
	WebDriver driver;
	
	@Given("^User launch the application url$")
	public void User_launch_the_application_url(){
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://dev21017.service-now.com/");
		
		
	}
	
	@Then("^Switch to mainframeone$")
	public void switch_to_mainframeone() {
		driver.switchTo().frame("gsft_main");
	    
	}

	@When("^Login Page title is ServiceNow$")
	public void login_Page_title_is_ServiceNow() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("ServiceNow", title);
	    
	}

	@Then("^User enters the username and password$")
	public void user_enters_the_username_and_password() {
	    driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys("qa.user");
	    driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("Cnet123$");
	    
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
	    driver.findElement(By.xpath(".//*[@id='sysverb_login']")).click();
	    Thread.sleep(5000);
	    
	}

	@Then("^User is on homepage$")
	public void user_is_on_homepage() {
	    String homepagetitle =driver.getTitle();
	    System.out.println("Home Page title is :" + homepagetitle);
	    Assert.assertEquals("System Administration | ServiceNow", homepagetitle);
	    
	}
	
	@Then("^User navigates to Filter Navigator search box and searches the Order Guides$")
	public void user_navigates_to_Filter_Navigator_search_box_and_searches_the_Order_Guides() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='filter']")).sendKeys("Order Guides");
		Thread.sleep(3000);
		
	}
	
	@Then("^User clicks on the Order Guides link$")
	public void user_clicks_on_the_Order_Guides_link() throws InterruptedException, IOException {
		Thread.sleep(2000);
		//Runtime.getRuntime().exec("C:\\CNET\\Automation\\AutoIT\\OrderGuideClick.exe");
		//driver.findElement(By.cssSelector("id#32ce5bb37f000001019feb946298246d")).click();
		//driver.findElement(By.xpath("//a[@id='32ce5bb37f000001019feb946298246d']/div/div")).click();
		//driver.findElement(By.xpath("//div[contains(text()='Order Guides')]")).click();
		//WebElement listBox = driver.findElement(By.className("ng-binding"));
		//driver.findElement(By.linkText("Order Guides")).click();
		//driver.findElement(By.xpath("//div[@class='sn-widget-list-title.ng-binding']")).click();
		//driver.findElement(By.xpath("//*[@id='32ce5bb37f000001019feb946298246d']/div[1]/div")).click();
		//driver.findElement(By.xpath("div[contains(text()='Order Guides')]/ancestor::div")).click();
		//driver.findElement(By.xpath("//a[@id='32ce5bb37f000001019feb946298246d']/div/div")).click();
		//driver.findElement(By.linkText("Order Guides")).click();
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement OrderGuide = driver.findElement(By.xpath("//li[13]/a/div/div"));
		js.executeScript("arguments[0].click();", OrderGuide);*/
	}	
	
	@Then("^Switch to mainframetwo$")
	public void switch_to_mainframetwo() throws InterruptedException {
		driver.switchTo().frame("gsft_main");
		Thread.sleep(3000);
	}
	
	@Then("^User clicks on the End to End Deployment link$")
	public void user_clicks_on_the_End_to_End_Deployment_link() {
		driver.findElement(By.xpath(".//*[@id='row_sc_cat_item_guide_cd2d5382db720300a68fda11cf96197a']/td[3]/a")).click();
	}

	@Then("^User clicks on the Try It button\\.$")
	public void user_clicks_on_the_Try_It_button() {
		driver.findElement(By.xpath(".//*[@id='try_it_catalog']")).click();
	    
	}

	@Then("^Verify the user is in Describe Needs page$")
	public void verify_the_user_is_in_Describe_Needs_page() {
	    String describeneedstext = driver.findElement(By.xpath("html/body/div[2]/div/div/table/tbody/tr/td/ol/li[1]/a")).getText();
	    System.out.println("Describe Needs Text is:" + describeneedstext);
	    Assert.assertEquals("Describe Needs", describeneedstext);
	    
	}
	
	@And("^Switch to mainframethree$")
	public void switch_to_mainframethree() {
		driver.switchTo().frame("gsft_main");
		
	}

	@Then("^User selects the project$")
	public void user_selects_the_project() {
	    driver.findElement(By.xpath(".//*[@id='lookup.IO:66e3d41edbf20300a68fda11cf9619d5']/span[1]")).click();
	    driver.switchTo().window("Projects | ServiceNow");
	    driver.findElement(By.xpath(".//*[@id='row_pm_project_22ae77e3db830300f69ff11ebf9619d4']/td[3]/a")).click();
	    
	}

	@Then("^User selects the Environment Information and Environment Type$")
	public void user_selects_the_Environment_Information_and_Environment_Type() {
	    
	}

	@Then("^User selects the Environment Name$")
	public void user_selects_the_Environment_Name() {
	
	}

	@Then("^User selects the Cloud Platform$")
	public void user_selects_the_Cloud_Platform() {
	    
	}

	@Then("^User selects the existing key pair radio button and enter the keypair$")
	public void user_selects_the_existing_key_pair_radio_button_and_enter_the_keypair() {
	    
	}

	@Then("^User selects the containerized platform for web server and container platform and Application type$")
	public void user_selects_the_containerized_platform_for_web_server_and_container_platform_and_Application_type() {
	    
	}

	@Then("^User selects the containerized platform for Database server and container platform$")
	public void user_selects_the_containerized_platform_for_Database_server_and_container_platform() {
	    
	}

	@Then("^Click Choose options button$")
	public void click_Choose_options_button() {
	    
	}

	@Then("^Verify user is in webserver deployment page$")
	public void verify_user_is_in_webserver_deployment_page() {
	    
	}

	@Then("^User entered service Requested$")
	public void user_entered_service_Requested() {
	    
	}

	@Then("^user entered cluster name$")
	public void user_entered_cluster_name() {
	    
	}

	@Then("^user entered operating system to be installed and server size requested$")
	public void user_entered_operating_system_to_be_installed_and_server_size_requested() {
	    
	}

	@Then("^User selects the additional storage$")
	public void user_selects_the_additional_storage() {
	    
	}

	@Then("^user enters the Storage type and Bucket name and EC(\\d+) Mount path$")
	public void user_enters_the_Storage_type_and_Bucket_name_and_EC_Mount_path(int arg1) {
	    
	}

	@Then("^User selects the  use existing network and enters the network$")
	public void user_selects_the_use_existing_network_and_enters_the_network() {
	    
	}

	@Then("^user selects the security group and enters the security group$")
	public void user_selects_the_security_group_and_enters_the_security_group() {
	    
	}

	@Then("^user selects the Monitoring$")
	public void user_selects_the_Monitoring() {
	    
	}

	@Then("^User selects the Auto Scaling$")
	public void user_selects_the_Auto_Scaling() {
	    
	}

	@Then("^User selects the Metric Type and Units$")
	public void user_selects_the_Metric_Type_and_Units() {
	    
	}

	@Then("^user clicks the Next tab button$")
	public void user_clicks_the_Next_tab_button() {
	    
	}

	@Then("^Verify the Database environment tab is displayed$")
	public void verify_the_Database_environment_tab_is_displayed() {
	    
	}

	@Then("^user selects the service Requested$")
	public void user_selects_the_service_Requested() {
	    
	}

	@Then("^user enter the cluster name$")
	public void user_enter_the_cluster_name() {
	    
	}

	@Then("^user enters the server size requested and operating system installed$")
	public void user_enters_the_server_size_requested_and_operating_system_installed() {
	    
	}

	@Then("^user selects the additional storage for database$")
	public void user_selects_the_additional_storage_for_database() {
	    
	}

	@Then("^verify the Application deployment tab is displayed$")
	public void verify_the_Application_deployment_tab_is_displayed() {
	    
	}

	@Then("^user enters the Application Name$")
	public void user_enters_the_Application_Name() {
	    
	}

	@Then("^user selects the Build from repo radio button$")
	public void user_selects_the_Build_from_repo_radio_button() {
	    
	}

	@Then("^User clicks checkout button$")
	public void user_clicks_checkout_button() {
	    
	}

	@Then("^verify the user is in shopping cart page$")
	public void verify_the_user_is_in_shopping_cart_page() {
	    	}

	@Then("^user click order now button$")
	public void user_click_order_now_button() {
	    
	}

	@Then("^verify the user is in order status page$")
	public void verify_the_user_is_in_order_status_page() {
	    
	}

	@Then("^click on request number link$")
	public void click_on_request_number_link() {
	    
	}

	@Then("^verify the request is approved$")
	public void verify_the_request_is_approved() {
	    
	}

	@Then("^User clicks on first RITM Number$")
	public void user_clicks_on_first_RITM_Number() {
	    
	}

	@Then("^click on Approvers tab$")
	public void click_on_Approvers_tab() {
	    
	}

	@Then("^Click on Requested link against qa user and click approve button-repeats (\\d+) times$")
	public void click_on_Requested_link_against_qa_user_and_click_approve_button_repeats_times(int arg1) {
	    
	}

	@Then("^verify the state is changed to closed complete$")
	public void verify_the_state_is_changed_to_closed_complete() {
	    
	}

	@Then("^user click on back arrow icon$")
	public void user_click_on_back_arrow_icon() {
	    
	}

	@Then("^click on second RITM number$")
	public void click_on_second_RITM_number() {
	    
	}

	@Then("^click on Third RITM number$")
	public void click_on_Third_RITM_number() {
	    
	}

	@Then("^user clicks the filter navigator and enters the cmdb_ci_server and press enter$")
	public void user_clicks_the_filter_navigator_and_enters_the_cmdb_ci_server_and_press_enter() {
	    
	}

	@Then("^user verify the webserver is displayed$")
	public void user_verify_the_webserver_is_displayed() {
	   
	}

	@Then("^user verify the Database server is displayed$")
	public void user_verify_the_Database_server_is_displayed() {
	    
	}

	@Then("^User verify the application server is displayed$")
	public void user_verify_the_application_server_is_displayed() {
	    
	}

	@Then("^User clicks logout button$")
	public void user_clicks_logout_button() {
	   
	}



}
