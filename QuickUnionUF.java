/**
 * Created by Mohammed on 2/6/2016.
 */
public class QuickUnionUF
{
    private int id[];
    /*
        We initialize an array and set match the value to its index
         id[0] = 0;
         id[1] = 1;
         ....
     */
    public QuickUnionUF(int length)
    {
        id = new int[length];
        for(int i=0;i<length;i++)
            id[i] = i;
    }
    /*
        Get Root of The element
     */
    public int getRoot(int index)
    {
        while(id[index]!=index)
            index = id[index];
        return index;
    }
    /*
        Is Connected
     */
    public boolean isConnected(int firstIndex,int secondIndex)
    {
        return getRoot(firstIndex) == getRoot(secondIndex);
    }
    /*
        Union
     */
    public void union(int firstIndex,int secondIndex)
    {
        id[getRoot(firstIndex)] = getRoot(secondIndex);
    }
}
