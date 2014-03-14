package framesis;

import java.util.ArrayList;
import java.util.List;


public class TaskRegistry {

	private static List<Class<TextMiningTask>> tmTasks;
	
	static
	{
		tmTasks = new ArrayList<Class<TextMiningTask>>();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static synchronized void register(Class clazz)
	{
		tmTasks.add(clazz);
	}
	
	@SuppressWarnings("rawtypes")
	public static synchronized void deregister(Class clazz)
	{
		tmTasks.remove(clazz);
	}
	
	public static synchronized List<TextMiningTask> createTasks()
	{
		List<TextMiningTask> instances = new ArrayList<TextMiningTask>();
		for( Class<TextMiningTask> clazz : tmTasks )
		{
			try {
				instances.add(clazz.newInstance());
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instances;
	}
}
