package com.hcy308.lombok;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Simon Huang
 */
@SpringBootTest(classes = DemoLombokApplication.class)
@WebAppConfiguration
public class ApplicationTests extends BaseTests {

    @Test
    public void contextLoads() {
    }

}

