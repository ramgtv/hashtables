package org.gtv.hashtables;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       HashingByDivision hash = new HashingByDivision();
       hash.put(200);
       hash.put(300);
       hash.put(22);
       hash.put(1);
       hash.put(22222);
       System.out.println("Is element is present"+hash.isPresent(300));
       System.out.println("Is element is present"+hash.isPresent(200));
       System.out.println("Is element is present"+hash.isPresent(50));
       System.out.println("Is element is present"+hash.isPresent(22));
    }
}
