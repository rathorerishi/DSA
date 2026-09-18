class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int n=Math.min(red,blue)+1;
        int cr=0;
        int cb=0;
        int cred=red;
        int cblue=blue;
        for(int i=1;i<=n;i++){
            if(i%2==1 && red>=i){
                red=red-i;
                cr++;

            }
            else if(i%2==0 && blue>=i){
                blue=blue-i;
                cr++;
            }
            else{
                break;
            }
            
        }
        for(int i=1;i<=n;i++){
            if(i%2==0 && cred>=i){
                cred=cred-i;
                cb++;

            }
            else if(i%2==1 && cblue>=i){
                cblue=cblue-i;
                cb++;
            }
            else{
                break;
            }
            
        }
        return Math.max(cb,cr); 
        
    }
}