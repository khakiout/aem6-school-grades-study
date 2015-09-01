package com.khakiout.aem.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;

@Model(adaptables = Resource.class)
public class UserModel {
	
	@Self
	private Resource resource;
	
	@Inject
	private String firstName;
	@Inject
	private String lastName;
	
	public String getRecordId() {
		return resource.getName();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
}
