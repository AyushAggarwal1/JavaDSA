package Linked_list;

// hash set contains uniques numbers
// my hash set, void add, bool contains, void remove

import java.util.*;
public class L014ImplementHashSet
{
}

// using array of boolean

class MyHashSet
{
    boolean arr[];

    public MyHashSet()
    {
        arr = new boolean[1000001];
    }

    public void add(int key)
    {
        arr[key] = true;
    }

    public void remove(int key)
    {
        arr[key] = false;
    }

    public boolean contains(int key)
    {
        return arr[key];
    }
}

// using linked list

class MyHashSetLL
{
    List<List<Integer>> parent;

    int size = 100;

    public MyHashSetLL()
    {
        parent = new ArrayList<>();

        for(int i=0; i<size; i++)
        {
            parent.add(null);
        }
    }

    public void add(int key)
    {
        int index = key % size;
        List<Integer> child = parent.get(index);

        if(child == null)
        {
            List<Integer> temp = new LinkedList<>();
            temp.add(key);
            parent.set(index, temp);
        }

        else
        {
            child.add(key);
        }
    }

    public void remove(int key)
    {
        int index = key % size;

        List<Integer> child = parent.get(index);

        if(child != null)
        {
            child.remove(Integer.valueOf(key));
        }
    }

    public boolean cheak(int key)
    {
        int index = key % size;

        List<Integer> child = parent.get(index);

        return child != null && child.contains(key);
    }
}