package co.com.taller.gurubank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/customer.feature",
                  glue = "co.com.practica.toolsqa.stepdefinitions" ,
                  snippets = SnippetType.CAMELCASE
                )
public class CustomerRunner {
}
