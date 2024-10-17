package com.Twitter.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Twitter.databaseConnections.TwitterControllerFactory;
import com.Twitter.entity.TwitterEntity;

public class TwitterControllerTest {
 TwitterControllerInterface tc=null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("loading resources");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("unloading the global resources");
	}

	@Before
	public void setUp() throws Exception {
		tc=TwitterControllerFactory.createObject("user");
		
	}

	@After
	public void tearDown() throws Exception {
		tc=null;
	}

	@Test
	public void testCreateProfileController() {
		tc.createProfileController();
	}

	@Test
	public void testViewAllProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewProfileController() {
		System.out.println("Not yet implemented");
	}

}
