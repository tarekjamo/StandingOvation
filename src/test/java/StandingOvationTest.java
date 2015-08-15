
import one.StandingOvation ;
import junit.framework.TestCase;
import org.junit.Test ;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;

import static org.fest.assertions.api.Assertions.assertThat;

public class StandingOvationTest {

    @Test
    public void one_not_shy_person_will_do_standing_ovation_without_anyone_needed()
    {
        int maxShyness = 0 ;
        int data = 1 ;
        int output = 0 ;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void many_people_different_shyness_no_need_anyone()
    {
        int maxShyness = 4 ;
        int data = 11111 ;
        int output = 0 ;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);

    }

    @Test
    public void one_shy_one_level_person_will_need_one_person_to_do_standing_ovation()
    {
        int maxShyness = 1 ;
        int data = 1 ;
        int output = 1;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void nine_one_level_shy_need_two()
    {
        int maxShyness = 1 ;
        int data = 9 ;
        int output = 1;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void gap_zeros_in_the_middle()
    {
        int maxShyness = 5 ;
        int data = 110011 ;
        int output = 2;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void one_really_shy_person()
    {
        int maxShyness = 10 ;
        int data = 1 ;
        int output = 10;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void lots_of_shy_person()
    {
        int maxShyness = 10 ;
        int data = 434 ;
        int output = 8;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void gap_in_the_middle()
    {
        int maxShyness = 10 ;
        int data = 1000001001 ;//01000001001
        int output = 8;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void no_shy_0_needed()
    {
        int maxShyness = 0 ;
        int data = 5 ;
        int output = 0;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }

    @Test
    public void gap()
    {
        int maxShyness =8;
        int data = 100000001 ;
        int output = 7;
        assertThat(StandingOvation.compute(maxShyness,data)).isEqualTo(output);
    }


    @Test
    public void test_all()
    {
        one_not_shy_person_will_do_standing_ovation_without_anyone_needed();
        many_people_different_shyness_no_need_anyone();
        one_shy_one_level_person_will_need_one_person_to_do_standing_ovation();
        nine_one_level_shy_need_two();
        gap_zeros_in_the_middle();
        one_really_shy_person();
        lots_of_shy_person();
        gap_in_the_middle();
        no_shy_0_needed() ;
        gap() ;
    }
}
