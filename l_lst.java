package com.example.javalib;
import java.util.*;
public class l_lst
{
    public static void main(String args[])
    {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("Waqqas");
        lst.add("save");
        lst.addLast("Vinay");
        lst.addFirst("cut");
        lst.add(2, "Yash");
        lst.add("me");
        lst.add("Talmiz");
        System.out.println("Linked list : " + lst);
        ListIterator i = lst.listIterator();
        System.out.println("Names with length less than 5: ");
        while (i.hasNext())
        {
            String s = i.next().toString();
            if(s.length()<5)
                System.out.print(s+"  ");
        }
    }
}
