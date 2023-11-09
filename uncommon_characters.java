class Solution
{
    String UncommonChars(String A, String B)
    {
        String s="";
        for(int i=0;i<A.length();i++)
        {
            String x = String.valueOf(A.charAt(i));
            if(!B.contains(x) && !s.contains(x))
                s+=A.charAt(i);
        }
        for(int i=0;i<B.length();i++)
        {
            String x = String.valueOf(B.charAt(i));
            if(!A.contains(x) && !s.contains(x))
                s+=B.charAt(i);
        }
        char res[]=s.toCharArray();
        Arrays.sort(res);
        if(res.length==0)
            return "-1";
        return String.valueOf(res);
    }
}
