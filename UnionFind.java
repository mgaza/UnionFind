/**
 * Created by Mohammed on 2/6/2016.
 */
public class UnionFind
{
    public static void main(String args[])
    {
        QuickUnionImproved qu = new QuickUnionImproved(10);
        qu.union(4,3);
        qu.union(3,8);

        System.out.println(qu.getRoot(8)[0]);
    }
}
