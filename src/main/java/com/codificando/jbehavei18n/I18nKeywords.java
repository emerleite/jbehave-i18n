package com.codificando.jbehavei18n;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class I18nKeywords {
	private String scenario;
	private String given;
	private String when;
	private String then;
	private String and;
	private static final I18nKeywords INSTANCE = new I18nKeywords();
	
	@SuppressWarnings("unchecked")
	private I18nKeywords() {
		InputStream input = this.getClass().getResourceAsStream("/keywords.yaml");
		Yaml yaml = new Yaml();
		Map<String, String> keywords = (Map<String, String>) yaml.load(input);
		this.scenario = readInUTF8(keywords.get("scenario"));
		this.given = readInUTF8(keywords.get("given"));
		this.when = readInUTF8(keywords.get("when"));
		this.then = readInUTF8(keywords.get("then"));	
	}
	
	public static I18nKeywords getInstance() {return INSTANCE;}

	public String readInUTF8(String valor) {
		try {
			return new String(valor.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {throw new RuntimeException("Should not throw this encoding error");}		
	}
	
	public String getScenario() {
		return scenario;
	}

	public String getGiven() {
		return given;
	}

	public String getWhen() {
		return when;
	}

	public String getThen() {
		return then;
	}

	public String getAnd() {
		return and;
	}
}
