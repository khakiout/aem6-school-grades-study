package com.khakiout.aem.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class GradeModel {

	@Inject
	private int grade;
	@Inject
	private String subject;
	@Inject
	private String studentId;
	@Inject
	private int weight;
//	private String teacherId;
	
	
}
