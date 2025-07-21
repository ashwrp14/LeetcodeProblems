class Solution {
    public int countSubstrings(String s) {
        int count=0;
		for(int i=0; i<s.length(); i++) {
		    String a="";
			for(int j=i; j<s.length(); j++) {
			    a=a+s.charAt(j);
			    int l=0;
			   int r=a.length()-1;
               int c=0;
			    
			   while(l<=r){
                if(a.charAt(l)==a.charAt(r)){
			       l++;
			       r--;
			       c++;
			   }
			    else{
			        break;
			    }
               }
			    	if(c==((l+r)/2)+1){
			    count++;
			}
			    
			}
		
		}
		return count;
    }
}
