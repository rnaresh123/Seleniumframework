package com.tmb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.tmb.enums.ConfigProperties;

public final class PropertyUtils {
	private PropertyUtils() {
	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<String, String>();
	static {
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
			property.load(file);

			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));

			}
			property.entrySet()
					.forEach(entry -> CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Hashtable is slow but its thread safe// Hashmap
	// converting a property to hashmap need some time

	public static String get(ConfigProperties key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(key)) {
			throw new Exception("property name" + key + "is not found.please the check the config property");
		}

		return CONFIGMAP.get(key.name().toLowerCase());
	}

}
