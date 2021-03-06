package co.com.taller.gurubank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/customer.feature",
                  glue = "co.com.taller.gurubank.stepdefinitions" ,
                  snippets = SnippetType.CAMELCASE,
                  tags = "@DeleteAccount"
                )
public class CustomerRunner {
}
