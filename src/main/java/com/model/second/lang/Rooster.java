package com.model.second.lang;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Bird{

	private static final Map<String, String> langMap;
	static {
		langMap = new HashMap<String, String>();
		langMap.put("English", "Cock-a-doodle-doo");
		langMap.put("French", "cocorico");
	}
	
	public void sing(String language) {
		if(language.isEmpty()) {
			System.out.println("Cock-a-doodle-doo");
		}else {
			System.out.println(langMap.get(language));
		}
	}

}
