package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	@Test
    void sampleTest() {
        System.out.println("Running Jenkins test...");
        assertTrue(true);
    }
	
	@Test
	void myTest() {
	   assertEquals(5, 2+3);
	}


}
