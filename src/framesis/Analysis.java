package framesis;

public class Analysis {

	private DataPreparation prep;
	private TextMiningTask task;
	
	public void setDataPreparation(DataPreparation dp)
	{
		prep = dp;
	}
	
	public void setTextMiningTask(TextMiningTask task)
	{
		this.task = task;
	}
	
	public String excecute(String data)
	{
		data = prep.prepare(data);
		String res = task.perform(data);
		return res;
	}
}
