package Beginner;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean flag = true;
        for(int i=0;i<ransomNote.length();i++){
          if(magazine.contains(Character.toString(ransomNote.charAt(i)))){
            magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)), "");
          }else{
            return false;
          }
        }
        return flag;
    }
}