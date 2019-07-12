package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember f1 = new FamilyMember("아빠");
        FamilyMember f2 = new FamilyMember("엄마");
        FamilyMember f3 = new FamilyMember("나");
        FamilyMember f4 = new FamilyMember("남동생");


        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(f1,10000);
        PiggyBank.putMoney(f2,5000);
        PiggyBank.putMoney(f3,2000);
        PiggyBank.putMoney(f4,1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(f3,1000);
        PiggyBank.printBalance();
    }
}

