package Linked_list;

import java.util.*;

public class L000linkedListUsingCollection
{
    public static void main(String[] args)
    {
        LinkedList <String> list = new LinkedList<String>();

        // add elements use - addfirst, addlast

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");

        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // delete elements use - removefirst, removelast
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove("a");   // also use index
        System.out.println(list);
    }
}
