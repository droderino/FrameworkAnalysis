package framesis.api;

import java.util.Map;

public interface DataPreparation {

	public static final String XMLFILE = "xmlFile";
	public static final String PREPARATEDFILE = "convertedFile";
	public static final String ISSUEROOT = "root";
	public String prepare(Map<String, String> params);
}
