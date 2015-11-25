package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

public class MinecraftTexturesPayload implements Serializable {
    private long timestamp;
    private UUID profileId;
    private String profileName;
    private boolean isPublic;
    private Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> textures;

    public long getTimestamp() {
        return timestamp;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> getTextures() {
        return textures;
    }

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public void setProfileId(UUID profileId) {
		this.profileId = profileId;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public void setTextures(
			Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> textures) {
		this.textures = textures;
	}
    
    
}
