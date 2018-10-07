class Token
{
	private String str;
	private int count=1;
	public Token(String st)
	{
		str=st;
	}
	public void incrementCount()
	{
		count++;
	}
	public String showToken()
	{
		return str;
	}
	public int showCount()
	{
		return count;
	}
}