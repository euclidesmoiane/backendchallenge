package mz.com.backenddeveloper.service;

import java.util.Set;

import javax.ws.rs.core.Application;


@javax.ws.rs.ApplicationPath("rest")
public class BackendDeveloperService extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}
	
	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(mz.com.backenddeveloper.service.PaisService.class);

		
	}

}
