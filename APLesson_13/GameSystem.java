import java.util.Random;

public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = (new Random()).nextInt(9000000) + 1000000;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (new Random()).nextInt(9000000) + 1000000;
	}
	
	public String getGSPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}