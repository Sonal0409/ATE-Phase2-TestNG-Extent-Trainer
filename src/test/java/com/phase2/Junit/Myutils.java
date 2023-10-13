package com.phase2.Junit;

public class Myutils {
	
	public static void main(String [] args){
		Myutils pn = new Myutils();

        if(pn.isPalindrome("ABBA")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }   
    }

    public static boolean isPalindrome(String inputText){
        int i = inputText.length()-1;
        int j=0;
        while(i > j) {
            if(inputText.charAt(i) != inputText.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

}
