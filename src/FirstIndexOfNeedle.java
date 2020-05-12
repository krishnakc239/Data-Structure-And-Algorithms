public class FirstIndexOfNeedle {

    public int strStr(String haystack, String needle) {

        if(haystack == null || needle == null || haystack.length() < needle.length()){
            return -1;
        }

        if(needle.equals("")){
            return 0;
        }


        for(int i=0; i< (haystack.length() - needle.length())+1; i++){
            if(haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
