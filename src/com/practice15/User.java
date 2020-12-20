package com.practice15;

public class User {
    static int count = -1;
    int id;
    String nickname;
    User() {
        count++;
        id = count;
        nickname = "EMPTY";
    }
    User(String nickname) {
        this();
        this.nickname = nickname;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}' + '\n';
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
}
