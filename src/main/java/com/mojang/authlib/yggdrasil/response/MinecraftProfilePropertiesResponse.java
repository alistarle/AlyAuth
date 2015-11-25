package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.properties.PropertyMap;

import java.util.UUID;

public class MinecraftProfilePropertiesResponse extends Response {
    private UUID id;
    private String name;
    private PropertyMap properties;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PropertyMap getProperties() {
        return properties;
    }

	public void setId(UUID id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(PropertyMap properties) {
		this.properties = properties;
	}
    
    
}
