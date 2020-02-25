import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

public class CalculatorStepsDefinitons {
    Calculator calculator;
    Integer result;

    @Given("^I have calculator$")
    public void i_have_calculator() throws Exception {
        calculator = new Calculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(Integer a, Integer b) throws Exception {
        result =  calculator.add(a,b);
    }

    @Then("^I get (\\d+)$")
    public void i_get(Integer expectedOutput) throws Exception {
        Assertions.assertThat(result).isEqualTo(expectedOutput);

    }
}
