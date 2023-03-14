package singleton;

import java.util.Objects;

public class ConfigApi {
	
	private static ConfigApi instance;
	
	private ConfigApi() {
	}

	public static ConfigApi getInstance() {
		if(Objects.isNull(instance)) {
			synchronized (ConfigApi.class) {
				if(Objects.isNull(instance)) {
					instance = new ConfigApi();
				}
			}
		}
		
		return instance;
	}
}
