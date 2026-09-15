class Solution {
    public int lengthOfLastWord(String s) {
        String[] sArray=s.split(" ");
        int n=sArray.length;
        int len=sArray[n-1].length();
        return len;
    }
}