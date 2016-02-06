/**
 * Created by Mohammed on 2/6/2016.
 * We will try to avoid tree from being tall
 * So we can improve performance to be log(N)
 * The Method Used here is => Weighting
 */
public class QuickUnionImproved
{
    private int id[];
    /*
        We initialize an array and set match the value to its index
         id[0] = 0;
         id[1] = 1;
         ....
     */
    public QuickUnionImproved(int length)
    {
        id = new int[length];
        for(int i=0;i<length;i++)
            id[i] = i;
    }
    /*
        Get Root of The element
     */
    public int[] getRoot(int index)
    {
        int []indexAndLength = new int[2];
        int length = 0;
        while(id[index]!=index)
        {
            index = id[index];
            length++;
        }
        indexAndLength[0] = index;
        indexAndLength[1] = length;
        return indexAndLength;
    }
    /*
        Is Connected
     */
    public boolean isConnected(int firstIndex,int secondIndex)
    {
        return getRoot(firstIndex)[0] == getRoot(secondIndex)[0];
    }
    /*
        Union
     */
    public void union(int firstIndex,int secondIndex)
    {
        int first[] = getRoot(firstIndex); // will return array[0] = root array[1] = length of tree
        int second[] = getRoot(secondIndex);
        if(first[1] >= second[1]) // compare length
            id[second[0]] = first[0];
        else
            id[first[0]] = second[0];
    }
}
