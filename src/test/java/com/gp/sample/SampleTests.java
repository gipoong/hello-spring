package com.gp.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
public class SampleTests {
    @Setter(onMethod_ = { @Autowired})
    private Restaurant restaurant;

    @Test
    public void testExit() {

        assertNotNull(restaurant);

        System.out.println(restaurant);
        System.out.println("-----------------------");
        System.out.println(restaurant.getChef());

    }
}
