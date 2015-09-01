package com.khakiout.aem.core.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestYearLevel {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFromLevelIfOutOfScopeMustReturnFirstYear() {
		assertEquals(YearLevel.FIRST_YEAR, YearLevel.fromLevel(5));
	}
	
	@Test
	public void testFromLevelIfLevel1MustReturnFirstYear() {
		assertEquals(YearLevel.FIRST_YEAR, YearLevel.fromLevel(1));
	}
	
	@Test
	public void testFromLevelIfLevel2MustReturnSecondYear() {
		assertEquals(YearLevel.SECOND_YEAR, YearLevel.fromLevel(2));
	}
	
	@Test
	public void testFromLevelIfLevel3MustReturnThirdYear() {
		assertEquals(YearLevel.THIRD_YEAR, YearLevel.fromLevel(3));
	}
	
	@Test
	public void testFromLevelIfLevel4MustReturnFourthYear() {
		assertEquals(YearLevel.FOURTH_YEAR, YearLevel.fromLevel(4));
	}

}
