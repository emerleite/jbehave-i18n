package com.codificando.jbehavei18n;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public class I18nKeywords {
	private String scenario;
	private String given;
	private String when;
	private String then;
	private String and;
	private static final I18nKeywords INSTANCE = new I18nKeywords();
	
	private I18nKeywords() {
		ResourceBundle keywords = ResourceBundle.getBundle("keywords");
		this.scenario = convertToUTF8(keywords.getString("keyword.scenario"));
		this.given = convertToUTF8(keywords.getString("keyword.given"));
		this.when = convertToUTF8(keywords.getString("keyword.when"));
		this.then = convertToUTF8(keywords.getString("keyword.then"));
	}
	
	public static I18nKeywords getInstance() {return INSTANCE;}

	public String convertToUTF8(String valor) {
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
