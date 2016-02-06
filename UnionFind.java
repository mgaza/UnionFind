/**
 * Created by Mohammed on 2/6/2016.
 */
public class UnionFind
{
    public static void main(String args[])
    {
        /*
            Write Your Own Test Here
         */
        QuickFindUF qf = new QuickFindUF(10); // bad
        QuickUnionUF qu = new QuickUnionUF(10); // not that good
        QuickUnionImproved qui = new QuickUnionImproved(10); // good
        /*
        Use The following methods
         => isConnected(value,value)
         => union(value,value)
         */
        qf.union(1,0);
        qu.union(8,2);
        qui.union(5,3);

        qf.isConnected(1,0); // true
        qu.isConnected(8,2); // true
        qui.isConnected(6,2); // false

    }
}
