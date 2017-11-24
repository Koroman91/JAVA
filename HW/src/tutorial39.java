
public class tutorial39 {

	private int hour;
	private int minute;
	private int second;
	
	public tutorial39()
	{
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	public tutorial39(int h)
	{
		this.hour = h;
		this.minute = 0;
		this.second = 0;
	}
	public tutorial39(int h, int m)
	{
		this.hour = h;
		this.minute = m;
		this.second = 0;
	}
	public tutorial39(int h, int m, int s)
	{
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	public void setTime(int h, int m, int s)
	{
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h)
	{
		hour = ((h>=0 && h<24) ? h : 0);
	}
	public void setMinute(int m)
	{
		minute = ((m>=0 && m<60) ? m : 0);
	}
	public void setSecond(int s)
	{
		second = ((s>=0 && s<60) ? s : 0);
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	
	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}


