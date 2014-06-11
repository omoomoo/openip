package com.cokepluscarbon.openip;

import java.util.Locale;

/**
 * if locale not support,than reset to Locale.ENGLISH
 */
public class Location {
	protected String[] data;
	private String ip;

	public String getCity() {
		return getCity(Locale.getDefault());
	}

	public String getCity(Locale locale) {
		if (locale.equals(Locale.CHINESE)) {
			return data[4];
		}
		return data[3];
	}

	public String getRegion() {
		return getRegion(Locale.getDefault());
	}

	public String getRegion(Locale locale) {
		if (locale.equals(Locale.CHINESE)) {
			return data[6];
		}
		return data[5];
	}

	public String getCountry() {
		return getCountry(Locale.getDefault());
	}

	public String getCountry(Locale locale) {
		if (locale.equals(Locale.CHINESE)) {
			return data[8];
		}
		return data[7];
	}

	public String getCountryCode() {
		return data[9];
	}

	public String getIsp() {
		return data[10];
	}

	public String getIp() {
		return ip;
	}

}
