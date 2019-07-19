// Test driver for the Homework5 class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestNQueens 
{
    public static void main(String[] args)
    {
        nQueens myHW5 = new nQueens();
        
        int n = 0;
        int numCalls = 0;
        int numTotalTests = 0;
                
        // Test 1
        numTotalTests++;
        int iReturn = -1;
        String eMsg = "N/A";
        try
        {
            n = 7;  // number of queens
            numCalls = 19;
            myHW5.setNumQueens(n);
            System.out.println("Test " + numTotalTests + " - queens(" + n + "):");
            myHW5.queens(0);
            iReturn = myHW5.getCalls();
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println(" Expected: # calls = " + numCalls);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: # calls = " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 2
        numTotalTests++;
        iReturn = -1;
        eMsg = "N/A";
        try
        {
            n = 4;  // number of queens
            numCalls = 27;
            myHW5.setNumQueens(n);
            System.out.println("Test " + numTotalTests + " - queens(" + n + "):");
            myHW5.queens(0);
            iReturn = myHW5.getCalls();
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println(" Expected: # calls = " + numCalls);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: # calls = " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");   
        
        // Test 3
        numTotalTests++;
        iReturn = -1;
        eMsg = "N/A";
        try
        {
            n = 6;  // number of queens
            numCalls = 172;
            myHW5.setNumQueens(n);
            System.out.println("Test " + numTotalTests + " - queens(" + n + "):");
            myHW5.queens(0);
            iReturn = myHW5.getCalls();
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        catch (StackOverflowError e)
        {
            eMsg = "Stack Overflow error occurred.";   
        }
        
        System.out.println(" Expected: # calls = " + numCalls);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: # calls = " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");          
    }
}