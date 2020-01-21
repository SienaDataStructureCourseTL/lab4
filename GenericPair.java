public class GenericPair<U, V> 
{
    private U first;
    private V second;

    public GenericPair(U first, V second) 
    {
        this.first = first;
        this.second = second;
    }

    public U getFirst() 
    {
        return first;
    }

    public V getSecond() 
    {
        return second;
    }

    public void setFirst(U newFirst) 
    {
        first = newFirst;
    }

    public void setSecond(V newSecond) 
    {
        second = newSecond;
    }

    public void setValues(U newFirst, V newSecond) 
    {
        first = newFirst;
        second = newSecond;
    }
    
    public String toString() 
    {
        return "(" + first + ", " + second + ")";
    }

    public boolean equals(Object o) 
    {
        GenericPair<U, V> other = (GenericPair<U, V>)o;
        return other.first.equals(first) && other.second.equals(second);
    }
}
