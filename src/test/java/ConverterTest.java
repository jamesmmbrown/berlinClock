import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class ConverterTest {

    private Converter converterUndertest;

    @BeforeEach
    void setUp() {
        this.converterUndertest = new Converter();
    }

    @Test
    void zeroSecondsIsRowOOOO() {
        int seconds = 0;
        String expectedRow = "OOOO";
        assertThat(converterUndertest.convertSecondsToOneMinuteRow(seconds), is(expectedRow));
    }
}