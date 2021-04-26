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
    void zeroMinutesIsRowOOOO() {
        int minutes = 0;
        String expectedRow = "OOOO";
        assertThat(converterUndertest.convertMinutesToOneMinuteRow(minutes), is(expectedRow));
    }

    @Test
    void twoMinutesIsRowYYOO() {
        int minutes = 2;
        String expectedRow = "YYOO";
        assertThat(converterUndertest.convertMinutesToOneMinuteRow(minutes), is(expectedRow));
    }

    @Test
    void fourMinutesIsRowYYYY() {
        int minutes = 4;
        String expectedRow = "YYYY";
        assertThat(converterUndertest.convertMinutesToOneMinuteRow(minutes), is(expectedRow));
    }
}