package actionUtils;
import java.util.Random;
public class SourceAndPort 
{
	Random rr=new Random();
	String str="";
	public String getSCName()
	{
		str="";
		str="SC"+String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10));
		return str;
	}
	public String getUser()
	{
		str="";
		str="USR"+String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10));
		return str;
	}
	
	public int getPort()
	{
		String str="";
		str=String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10))+String.valueOf(rr.nextInt(10));
		return Integer.parseInt(str);
	}
	public int getBW() {
		// TODO Auto-generated method stub
		return rr.nextInt(100)+10;
	}
}