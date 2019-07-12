package org.dimigo.basic.oop2;

public class test {
    public static void main(String[] args) {
        int cnt = 0;
        for(int i =0 ; i < 5 ; i++){
            for(int j =0 ; j < 5 ; j++){
                if(i == j) break;
                if(i+j < 5) continue;
                {
                    cnt++;
                    System.out.println(i+""+j);
                }

            }
        }
        System.out.println(cnt);
    }
}
