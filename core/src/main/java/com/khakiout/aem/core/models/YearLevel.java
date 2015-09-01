package com.khakiout.aem.core.models;

import java.util.stream.Stream;

public enum YearLevel {

	FIRST_YEAR("Freshmen", 1),
	SECOND_YEAR("Sophomore", 2),
	THIRD_YEAR("Junior", 3),
	FOURTH_YEAR("Senior", 4);
	
	private final String title;
	private final int level;
	
	YearLevel(String title, int level) {
		this.title = title;
		this.level = level;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLevel() {
		return level;
	}
	
	public static YearLevel fromLevel(int level) {
		return Stream.of(values()).filter(yearLevel ->
			yearLevel.level == level
		).findFirst().orElse(YearLevel.FIRST_YEAR);
	}
}
