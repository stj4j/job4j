package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when100ollarsToDRubleThen600() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(100);
        assertThat(result, is(6000));
    }

    @Test
    public void when100EuroToRubleThen700() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(100);
        assertThat(result, is(7000));
    }

}
