package be.abis.palindrome.model;

import be.abis.palindrome.exception.NotAPalindromeException;

public class Palindrome {
    private final String value;

    public Palindrome(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isPalindrome() throws NotAPalindromeException {
        boolean retval=false;

        if (value != null && !value.equals("") && value.length()!=1) {
            StringBuilder sb = new StringBuilder(value);
            StringBuilder sbrev = new StringBuilder(value).reverse();
            retval=sb.toString().equals(sbrev.toString());
        }
        if (retval==false) throw new NotAPalindromeException(" is not a palindrome.");
        return retval;
    }

    public static int countNumberOfPalindromes(Palindrome[] palindromes){
        int counter = 0;
        for (Palindrome p: palindromes){
            try {
                if (p!=null && p.isPalindrome()){
                    counter++;
                }
            } catch (NotAPalindromeException e) {

            }
        }
        return counter;
    }

    public String toString(){
        return value;
    }


}

