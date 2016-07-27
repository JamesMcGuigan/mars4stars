package mars4stars;

/** 
 * A class for logging runtime errors and other  
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class Log {
    protected static boolean logErrors = true;
    protected static boolean logStatus = true;     
    
    protected static String ignoreString = "";
    protected static int    ignoreCount = 0;
    
    public static void ignore (int count, String error) {
        Log.ignoreCount = count;
        Log.ignoreString = error;
    }
    
    public static void error (Object object, String error) {
        if(logErrors) { // check logging is on
            if(Log.ignoreCount > 0 && Log.ignoreString == error) {
                    Log.ignoreCount--; // ignore the error 
        	}
            else { // Log error
                System.err.print("Error: " + error + " in ");
                System.err.print(object);
                System.err.print("\n\n");
                Log.ignoreCount = 0;
            }
        }
    }

    public static void status (Object object, String status) {
        if(logStatus) {
            System.out.print("Status: " + status + " in ");
            System.out.print(object);
            System.out.print("\n\n");
        }        
    }
}

