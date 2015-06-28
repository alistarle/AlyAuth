package com.mojang.authlib.yggdrasil.request;

import java.util.UUID;

public class JoinMinecraftServerRequest {
    public String accessToken;
    public UUID selectedProfile;
    public String serverId;
    
	public String getAccessToken() {
		return accessToken;
	}
	public UUID getSelectedProfile() {
		return selectedProfile;
	}
	public String getServerId() {
		return serverId;
	}
    
    
}
