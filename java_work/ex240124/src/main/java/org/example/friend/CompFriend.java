package org.example.friend;

import org.example.friend.Friend;

public class CompFriend extends Friend {
    private String department;

    public CompFriend(String name, String department, String phone){
        super(name, phone);
        this.department = department;
    }

    @Override
    public String toString() {
        return "CompFriend{" +
                "major='" + department + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
