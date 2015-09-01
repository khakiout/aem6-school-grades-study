package com.khakiout.aem.core.components;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUse;
import com.khakiout.aem.core.models.StudentModel;

/**
 * Fetch a list of the child pages and map it StudentModel class
 */
public class DataListComponent extends WCMUse {

	private static final Logger log = LoggerFactory.getLogger(DataListComponent.class);
	
	private String path;
	private List<StudentModel> data;
	
	@Override
	public void activate() throws Exception {
		data = new ArrayList<>();
		path = getProperties().get("path", "");
		log.debug("Component Path is {}", path);

		Iterable<Resource> children = getResourceResolver().getResource(path).getChildren();
		for (Resource child : children) {
			StudentModel model = child.adaptTo(StudentModel.class);
			data.add(model);
		}
		data = data.stream()
				.sorted(Comparator.comparing(StudentModel::getLastName))
				.collect(Collectors.toList());
		log.debug("There are {} students", data.size());
	}
	
	public List<StudentModel> getData() {
		return data;
	}

}
