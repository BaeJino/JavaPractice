package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper 클래스 : Primitive type을 Wrapping해주는 클래스
        //클래스 : 필드(데이터)와 메소드(기능)
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        //Boxing ( Primitive type -> Wrapper 객체)
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double d1 = Double.valueOf(3.14);

        //Unboxing ( Wrapper 객체 -> Primitive type)
        int r1 = i1.intValue();
        double r2 = d1.doubleValue();

        int r3 = Integer.parseInt("300");
        double r4 = Double.parseDouble("3.14");

        //입력받은 100과 200을 받아 답이 300이 나오게 해보기

        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(args[0] + args[1]); //100200
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println(n1+n2);

        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);
        System.out.println(obj1 + obj2);

        Integer a = 1000;
        //원래는 Integer a = new Integer(1000) 써야 하는데
        //outoBoxing , outunBoxing 다 해주기 때문에 가능함
        int b = a + 100;
        System.out.println(b);


        //AutoBoxing , AutoUnBoxing 몇번?
        Integer c = 10; //오토박싱 1번 ,
        Integer d = c + 20; //오토박싱 1번 , 오토언박싱 1번
        Integer result = c + d; //오토박싱 1번 , 오토언박싱 2번


    }
}

