class Solution {
    public String smallestPalindrome(String s) {
        
        int n=s.length();
        if(n==1){
            return s;
        }
        char[] c=new char[n/2];
        for(int i=0;i<n/2;i++){
            c[i]=s.charAt(i);
        }
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n/2;i++){
            sb.append(c[i]);

        }
        if(n%2!=0){
            sb.append(s.charAt(n/2));
        }
        for(int i=n/2-1;i>=0;i--){
            sb.append(c[i]);
        }
        return sb.toString();

        
    }
}