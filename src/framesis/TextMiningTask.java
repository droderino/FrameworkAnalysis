package framesis;

public interface TextMiningTask<T> {

	public String perform(T data);
	public String getDescription();
}
