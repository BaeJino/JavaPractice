package org.dimigo.oop;

public class FamilyMember {
    private static int cnt;
    private String name;

    public FamilyMember(String name) {
        this.name = name;
        cnt++;
    }

    public String getName() {
        return name;
    }

    public static void printMemberCnt(){
        System.out.printf("가족 총 인원 수 : %d\n", cnt);
    }

}
