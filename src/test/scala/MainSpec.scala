import org.scalatest._
import com.gregheartsfield._
import org.openqa.selenium._

class ExampleSpec extends FeatureSpec with GivenWhenThen {
 // Start with a browser
  val b = Driver.browser
  val home = "http://gregheartsfield.com/"
  feature("The user can view information on the website") {
    scenario("Homepage loads") {
      given("The Homepage")
      b.get(home)
      when("when the page loads")
      then("the title has my name")
      assert(b.getTitle().contains("Greg Heartsfield"))
    }
    scenario("Public Key Available") {
      given("The Homepage")
      b.get(home)
      when("The public key link is selected")
      b.findElement(By.linkText("GPG Public Key")).click
      then("The public key is loaded")
      assert(b.getPageSource.contains("GnuPG"))
    }
    scenario("Blog posts available") {
      given("The Homepage")
      b.get(home)
      when("The first blog post is selected")
      b.findElement(By.cssSelector("ul.posts > li > a")).click
      then("The blog post loads and has a title")
      assert(b.findElement(By.id("post")).getText() != null)
    }
  }
}
