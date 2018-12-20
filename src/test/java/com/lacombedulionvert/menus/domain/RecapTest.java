package com.lacombedulionvert.menus.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class RecapTest {
    Recap recap = new Recap();


    public static final String SALADE = "salade";

    @Test
    public void should_return_recap_with_only_one_dish_witch_named_salade() {
        List<String> dishes = asList("salade");
        assertThat(recap.getDishNumberByName(dishes)).isEqualTo(asList("salade : 1"));
    }

    @Test
    public void should_return_recap_with_two_salades() {
        assertThat(recap.getDishNumberByName(asList("salade", "salade"))).isEqualTo(asList("salade : 2"));
    }

    @Test
    public void should_return_recap_with_two_salades_and_one_baguette() {
        assertThat(recap.getDishNumberByName(asList("salade", "salade", "baguette"))).contains("salade : 2");

    }

    @Test
    public void should_return_recap_with_one_baguette() {
        assertThat(recap.getDishNumberByName(asList("salade", "salade", "baguette"))).contains("baguette : 1");

    }

    @Test
    public void should_return_recap_with_only_one_baguette() {
        assertThat(recap.getDishNumberByName(asList("baguette"))).containsOnly("baguette : 1");
    }

    @Test
    public void should_return_recap_with_only_one_saussage() {
        assertThat(recap.getDishNumberByName(asList("saussage"))).containsOnly("saussage : 1");
    }
}