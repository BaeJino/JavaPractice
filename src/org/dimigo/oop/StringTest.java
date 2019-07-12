package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {

       String id = "Admin";


       if(id != null && id.equalsIgnoreCase("admin"))
           //if("admin".equalsIgnoreCase(id))
           System.out.println("관리자임");
       else
           System.out.println("관리자아님");

       testString();
    }

    public static void testString(){

        String s = "abcdefgABCDEFG";
        System.out.println(s.length()); //14
        System.out.println(s.substring(3)); //defgABCDEFG
        System.out.println(s.substring(3,6)); //def
        System.out.println(s.indexOf("C")); //9
        System.out.println(s.charAt(9)); // 9 -> C
        System.out.println(s.concat("ABC") );
        System.out.println("["+"     ABC    D ".trim()+"]");
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a','A'));
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("FG"));


    }

}
