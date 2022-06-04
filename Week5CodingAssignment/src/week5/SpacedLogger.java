package week5;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		
		int word = log.length();
	     int i;

	     
	     for(i = 0; i < word; i++)
	       {
	            System.out.print(" " +log.charAt(i));
	           }
		
	}

	
	
	
	@Override
	public void Error(String error) {
		
		int word = error.length();
	     int i;
	     System.out.print("Error:");
	     
	     for(i = 0; i < word; i++)
	       {
	            
	    	 System.out.print(" " + error.charAt(i));
	            }
		
	}

}
