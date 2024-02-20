package com.tmb.constants;

public class FrameworkConstants {
	private FrameworkConstants() {

	}

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH+"/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCEPATH+"/config/config.properties";
	private static final long EXPLICITWAIT=10;

	public static long getExplicitwait() {
		return EXPLICITWAIT;
	}
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
}
