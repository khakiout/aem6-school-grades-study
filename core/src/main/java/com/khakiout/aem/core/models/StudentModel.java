package com.khakiout.aem.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class StudentModel extends UserModel {

	@Inject
	private int level;
	
	private YearLevel yearLevel;

	public StudentModel(Resource resource) {
		super(resource);
	}
	
	@PostConstruct
    protected void init() {
		yearLevel = YearLevel.fromLevel(level);
    }
	
	public YearLevel getYearLevel() {
		return yearLevel;
	}

}
