class Solution12 {
    public int lengthOfLastWord(String s) {
      int count=0;
      String[] word=s.split(" ");
      String last=word[word.length-1];
      count=last.length();
      return count;
    }
    
    public static void main(String a[])
    {
        Solution sol=new Solution();
        String s="fly me to the moon";
        int res=sol.lengthOfLastWord(s);
        System.out.println(res);
    }
}

