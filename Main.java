/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;  
import java.util.regex.*;  


public class Main
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String line;
        LLStack stack = new LLStack(null);

        
        line = sc.nextLine(); 

        String[] split = line.split(" ");

        
        for(int i=0;i<split.length;i++){
            if(isNumeric(split[i]) == true){
                stack.Push(Integer.parseInt(split[i]));
            }    
            
            else if(split[i].equals("+")){
                stack.Push(stack.Pop()+stack.Pop());
            }
            
            else if(split[i].equals("-")){
                stack.Push(stack.Pop()-stack.Pop());
            }
            
            else if(split[i].equals("*")){
                stack.Push(stack.Pop()*stack.Pop());
            }
            
            else if(split[i].equals("/")){
                stack.Push(stack.Pop()/stack.Pop());
            }
            
            else{
                System.out.println("Split[i] is not a recognized input");
            }
            
        }
        
        stack.PrintStack();
        
    }

  
   public static boolean isNumeric(String strNum) {
       return strNum.matches("-?\\d+(\\.\\d+)?");
    } 
   
   
}
