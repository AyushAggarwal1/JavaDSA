package Linked_list;

public class L015ImplementhashMap
{
}

// hash map - my hash map, void put, int get, void remove
// using array

class hashMap
{
    int arr[];
    int size = 1000001;

    public hashMap()
    {
        arr = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = -1;
        }
    }

    public void put(int key, int value)
    {
        arr[key] = value;
    }

    public int get(int key)
    {
        return arr[key];
    }

    public void remove(int key)
    {
        arr[key] = -1;
    }
}
