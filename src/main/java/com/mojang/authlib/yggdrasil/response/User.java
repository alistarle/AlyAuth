package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.properties.PropertyMap;

public class User {
    private String id;
    private PropertyMap properties;

    public String getId() {
        return id;
    }

    public PropertyMap getProperties() {
        return properties;
    }

	public void setId(String id) {
		this.id = id;
	}

	public void setProperties(PropertyMap properties) {
		this.properties = properties;
	}
    
    
}
