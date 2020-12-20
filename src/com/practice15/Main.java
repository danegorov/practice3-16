package com.practice15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Int> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Int(i));
        }
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());


        LinkedList<User>  list = new LinkedList<User>();
        list.add(new User("qwerty"));
        list.add(new User("nickname"));
        list.add(new User("rr31"));
        list.add(new User());

        System.out.println(list + "\n\n");

        list.addFirst(new User("First"));
        list.addLast(new User("Last"));
        list.add(3, new User("index == 3"));
        System.out.println(list);

        Base<User> users = new Base<>();
        users.add(new User("qwerty"));
        users.add(new User("nickname"));
        users.add(new User("rr31"));
        users.add(new User());
        ArrayIterator<User> iterator = (ArrayIterator<User>) users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
