import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConverterStepDefinitions {

    private Converter converterUnderTest;

    @Given("I have started the converter")
    public void iHaveStartedTheConverter() {
        this.converterUnderTest = new Converter();
    }

    @When("I enter {string}")
    public void iEnterTime(String time) {
        converterUnderTest.convertTime(time);
    }

    @Then("{string} is returned for the single minutes row")
    public void rowIsReturnedForTheSingleMinutesRow(String row) {
        assertThat(converterUnderTest.getOneMinuteRow(), is(row));
    }

    @Then("{string} is returned for the five minutes row")
    public void rowIsReturnedForTheFiveMinutesRow(String row) {
        assertThat(converterUnderTest.getFiveMinutesRow(), is(row));
    }

    @Then("{string} is returned for the single hours row")
    public void isReturnedForTheSingleHoursRow(String row) {
        assertThat(converterUnderTest.getOneHourRow(), is(row));
    }

    @Then("{string} is returned for the five hours row")
    public void isReturnedForTheFiveHoursRow(String row) {
        assertThat(converterUnderTest.getFiveHourRow(), is(row));
    }
}
