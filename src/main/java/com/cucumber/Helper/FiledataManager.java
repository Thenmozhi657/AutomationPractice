package com.cucumber.Helper;

public class FiledataManager {
	public static FiledataManager fdm=new FiledataManager();
	public ConfigReader cr;
	public ConfigReader getConfigReader() throws Throwable {
		if(cr==null) {
			cr=new ConfigReader();
		}
		return cr;
	}
	private FiledataManager() {
	
	}
}
