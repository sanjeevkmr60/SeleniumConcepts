package TestNGConcepts;

import org.testng.annotations.Test;

public class TestNgXMLConfiguration {
    //TestNg Features
    // 1.Multiple Before and After annotation options
    //2.XML-based test configuration
    //3.Dependent methods
    //4.Groups/group of groups
    //5.Dependent groups
    //6.Parameterization of test methods----@Parameters annotation
    //7.Data-driven testing---@DataProvider annotation
    //8.Parallel Execution
    //9.Better reporting-Testng provides XML and HTML reports by default for test execution

  @Test
  public void test1(){
    System.out.println("Testng Tutorial");
  }

  @Test
  public void test2(){
    System.out.println("Webdriver Tutorial");

  }
  @Test
  public void WebLoginCarLoan()
  {
    System.out.println("WebLoginCarLoan");
  }
  @Test
  public void MobileLoginCarLoan()
  {
    System.out.println("MobileLoginCarLoan");
  }
  @Test
  public void APILoginCarLoan()
  {
    System.out.println("APILoginCarLoan");
  }
  @Test
  public void MobileLoginPersonalLoan()
  {
    System.out.println("MobileLoginPersonalLoan");
  }
  @Test
  public void MobileLoginHomeLoan()
  {
    System.out.println("MobileLoginHomeLoan");
  }
  @Test
  public void LoginAPICarLoan()
  {
    System.out.println("LoginAPICarLoan");
  }

}
