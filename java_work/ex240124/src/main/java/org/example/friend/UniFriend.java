package org.example.friend;

import org.example.friend.Friend;

public class UniFriend extends Friend {
    private String major;

    public UniFriend(String name, String major, String phone){
        super(name, phone);
        this.major = major;
    }

    @Override
    public String toString() {
        return "UniFriend{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
