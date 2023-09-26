package Collections1;

import java.util.*;

public class Set1 {
 public static void main(String[] args) {
    Set<String> s1 = new HashSet<>();
    s1.add("One");    
    s1.add("Two");    
    s1.add("Three");   
    s1.add("Four");  
    s1.add("Five");  
    Iterator<String> i=s1.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    } 
    System.out.println(s1);

 } 
}
