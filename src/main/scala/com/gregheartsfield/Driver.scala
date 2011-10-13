package com.gregheartsfield
import org.openqa.selenium._
import org.openqa.selenium.htmlunit._
//import org.openqa.selenium.firefox._

object Driver {
//  val driver = new FirefoxDriver();
  val driver = new HtmlUnitDriver();
  def browser = {driver}
}
