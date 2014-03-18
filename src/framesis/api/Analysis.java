package framesis.api;

import java.util.Map;

@SuppressWarnings("rawtypes")
public class Analysis {

	private TextMiningTask task;
	
	public void setTextMiningTask(TextMiningTask task)
	{
		this.task = task;
	}
	
	@SuppressWarnings("unchecked")
	public String execute(Map<String, String> params)
	{
		params.put("preparatedFile", params.get("file"));
		return task.execute(params);
	}
	public String execute(Map<String, String> params, DataPreparation prep)
	{
		String preparatedFile = prep.prepare(params.get("file"));
		params.put("preparatedFile", preparatedFile);
		String processedFile = execute(params);
		return processedFile;
	}
}
