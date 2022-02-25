public class Exercise3 {

	static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
            && ch != 'u') {
            return false;
        }
        return true;
    }
	static String alterstrings(char[] s)
    {

        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i])) {
                         if (s[i] == 'z') {
                    s[i] = 'a';
                }
             else {
                   s[i] = (char)(s[i] + 1);
                   if (isVowel(s[i])) {
                        s[i] = (char)(s[i] + 1);
                    }
                }
            }
        }
        return String.valueOf(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "iamhappy";
        System.out.println(
        		alterstrings(s.toCharArray()));

	}

}