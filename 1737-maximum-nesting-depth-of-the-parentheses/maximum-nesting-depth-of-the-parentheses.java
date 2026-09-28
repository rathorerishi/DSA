class Solution {
    public int maxDepth(String s) {
        int max=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;//3
            }
            else if(s.charAt(i)==')'){
                max=Math.max(max,c);//3
                c--;//0

            }
        }
        return max;
        
       
        
    }
}