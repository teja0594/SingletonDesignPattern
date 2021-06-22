package SingletonPattern;

public class printer 
{
	public static   printer p;	
	public static printer getInstance()
	{ 
		if(p==null){
			p = new printer();
			return p;
			}
		else
		{
		return p;
	}
	}
}
