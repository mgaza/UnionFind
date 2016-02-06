/**
 * Created by Mohammed on 2/6/2016.
 */
public class QuickFindUF
{
    private int id[];

    /*
        We initialize an array and set match the value to its index
         id[0] = 0;
         id[1] = 1;
         ....
     */
    public QuickFindUF(int length)
    {
        id = new int[length];
        for(int i=0;i<length;i++)
            id[i] = i;
    }
    /*
        Check if two values are connected
     */
    public boolean isConnected(int firstIndex,int secondIndex)
    {
        return id[firstIndex] == id[secondIndex];
    }
    /*
        Union two values
     */
    public void union(int firstIndex,int secondIndex)
    {
        int secondValue = id[secondIndex];
        int firstValue = id[firstIndex];
        for(int i=0;i<id.length;i++)
        {
            if(id[i]==firstValue)
                id[i] = secondValue;
        }
    }
}
