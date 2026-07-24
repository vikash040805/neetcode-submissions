class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        StringBuilder st=new StringBuilder(s);
        return s.equals(st.reverse().toString());
    }
}
