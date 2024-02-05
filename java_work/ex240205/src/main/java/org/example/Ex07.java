package org.example;

class User {
    enum Gender {
        // public static final
        MALE, FEMALE
    }

    private String name;
    private Gender gen;

    public User(String name, Gender gen) {
        this.name = name;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gen=" + gen +
                '}';
    }
}
public class Ex07 {
    public static void main(String[] args) {
        User hong = new User("hong", User.Gender.MALE);
        User lee = new User("lee", User.Gender.FEMALE);
//        User.Gender.EX;

        System.out.println(hong + ", " + lee);
    }
}
