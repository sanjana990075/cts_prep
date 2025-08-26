public class countspace {
    public static void main(String[] args) {
        int count=0;
        String s="he is a a a  ";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
