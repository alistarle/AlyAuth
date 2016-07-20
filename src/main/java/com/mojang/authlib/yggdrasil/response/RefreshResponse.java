package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.GameProfile;

public class RefreshResponse extends Response {
    private String accessToken;
    private String clientToken;
    private GameProfile selectedProfile;
    private GameProfile[] availableProfiles;
    private User user;

    public String getAccessToken() {
        return accessToken;
    }

    public String getClientToken() {
        return clientToken;
    }

    public GameProfile[] getAvailableProfiles() {
        return availableProfiles;
    }

    public GameProfile getSelectedProfile() {
        return selectedProfile;
    }

    public User getUser() {
        return user;
    }

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}

	public void setSelectedProfile(GameProfile selectedProfile) {
		this.selectedProfile = selectedProfile;
	}

	public void setAvailableProfiles(GameProfile[] availableProfiles) {
		this.availableProfiles = availableProfiles;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}
