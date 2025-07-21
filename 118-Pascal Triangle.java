class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> oli = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        if(numRows == 0){
            return oli;
        }
        List<Integer> fi=new ArrayList<>();
        fi.add(1);
        oli.add(fi);
        for(int i=1;i<numRows;i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
             for(int j=1;j<i;j++){
                int val = oli.get(i-1).get(j-1)+oli.get(i-1).get(j);
                curr.add(val);
             }
                curr.add(1);
            oli.add(curr);
        }       
       return oli;
}
}
