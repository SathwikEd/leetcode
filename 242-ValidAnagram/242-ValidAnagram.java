class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            HashMap<Character, Integer> s_chars = new HashMap<>();
            HashMap<Character, Integer> t_chars = new HashMap<>();
            for(char c: s.toCharArray()){
                s_chars.put(c, s_chars.getOrDefault(c,0) +1);
            }
            for(char c: t.toCharArray()){
                t_chars.put(c, t_chars.getOrDefault(c,0) + 1);
            }
            // for(int i=0;i<s.length();i++){
            //     s_chars.put(s.charAt(i), s_chars.getOrDefault(s.charAt(i), 0) + 1);
            //     t_chars.put(t.charAt(i), t_chars.getOrDefault(t.charAt(i), 0) + 1);
            // }
            return s_chars.equals(t_chars);
        }
        return false;
    }
}