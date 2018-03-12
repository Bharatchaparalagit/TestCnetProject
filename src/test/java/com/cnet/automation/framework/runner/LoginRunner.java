package com.cnet.automation.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"C:\\Users\\Saurya\\workspace\\Cnet\\cnetautomation\\src\\test\\resources\\features\\login.feature"},
					glue={"\\src\\test\\java\\com\\cnet\\automation\\framework\\stepdefinition"},
					plugin={"pretty","json:target/LoginRunner.json"})
public class LoginRunner extends AbstractTestNGCucumberTests {

}
