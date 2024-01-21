class Solution {
    public int countSegments(String s) {
        s = s.trim();
        return s.equals("") ? 0 : s.split("\\s+").length;
    }
}