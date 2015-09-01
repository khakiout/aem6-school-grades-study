package com.khakiout.aem.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class StudentModel {

	@Inject
	private String firstName;
	@Inject
	private String lastName;
	@Inject
	private String level;
	
	private YearLevel yearLevel;
	
	@PostConstruct
    protected void init() {
		yearLevel = YearLevel.fromLevel(Integer.parseInt(level));
    }
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public YearLevel getYearLevel() {
		return yearLevel;
	}

}
