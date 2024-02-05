package org.example;

//interface Person {
//    int MAN = 1;
//    int WOMAN = 2;
//}
enum Person {
    MAN, WOMAN;
}

//interface Animal {
//    int DOG = 1;
//    int CAT = 2;
//}
enum Animal {
    DOG, CAT;
}

public class Ex05 {
    public static void who(Person p) {
        switch (p) {
            case MAN:
                System.out.println("남성");
            break;
            case WOMAN:
                System.out.println("여성");
            break;
        }
    }
    public static void main(String[] args) {
        who(Person.MAN);
        who(Person.WOMAN);
//        who(Animal.DOG);
    }
}
