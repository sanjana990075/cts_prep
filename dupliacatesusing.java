import java.util.HashSet;

public class dupliacatesusing
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,};
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int num:arr)
        {
            if(!seen.add(num))
            {
                duplicates.add(num);
            }
        }
        if(duplicates.isEmpty())
        {
        System.out.println("No");}

        else
        {
        System.out.println("yes");
    }




    }
}