package com.example.jenkins.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertTrue(true);
		Assert.assertEquals(1, 1);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

}
