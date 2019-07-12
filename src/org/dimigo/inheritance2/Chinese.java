package org.dimigo.inheritance2;

public class Chinese extends Person{
    public Chinese(String name) {
        super(name);
    }

    public void sayHello(){
        System.out.println("니하오");
    }

    public void sayBye(){
        System.out.println("쨔이찌엔");
    }

    @Override
    public String toString() {
        return "저는 중국사람 "+getName()+" 입니다.";
    }
}
