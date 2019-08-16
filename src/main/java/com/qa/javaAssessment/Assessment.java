package com.qa.javaAssessment;

import java.util.ArrayList;
import java.util.Set;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i+4).equals("bert")) {
				String firstBert = input.substring(i, i+4);
				
				
		
		
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		int high= 0;
		int medium= 0;
		int small= 0;
				
		
		//This terrible I know. I can't remember the name of any Ordered data types
		
		if (a > b && a > c) {
			high = a;
			if(b > c) {
				medium = b;
				small = c;
			}
			else {
				medium = c;
				small = b;
			}
		}
		else if (b > a && b > c) {
			high = b;
			if(a > c) {
				medium = a;
				small = c;
			}
			else {
				medium = c;
				small = a;
			}
		}
		else if (c > a && c > b) {
			high = c;
			if(b > a) {
				medium = b;
				small = a;
				}
			else {
				medium = a;
				small = b;
				
			}}
		
		if (high - medium == medium - small) {
			return true;
		}

	
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		String subStr = input.substring(a, input.length()-a);
		return subStr;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		for (int i = 0; i <= input.length(); i++) {
			
		}
		
		
		
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or preceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		
		int amCounter = 0;
		for (int i = 0; i < arg1.length(); i++) {
			if (arg1.substring(i, i+1).equals("am") && ( arg1.indexOf((i+2).equals(" ") ) {
				amCounter += 1;
			}
		}

		return amCounter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if (arg1 % 5 == 0 && arg1 % 3 == 0) {
			return "fizzbuzz";
		}
		else if (arg1 % 5 == 0) {
			return "buzz";
		}
		else if (arg1 % 3 == 0) {
			return "fizz";
		}
		else {
			return "not divisible by 5 or 3";
		}
	
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		ArrayList<Integer>  myList = new ArrayList<Integer>();
		for (char c : arg1.toCharArray()) {
			int addedInts =0;

			
			switch(c) {
			case '1':
				addedInts +=1;
				break;
			case '2':
				addedInts +=2;
				break;
			case '3':
				addedInts +=3;
				break;
			case '4':
				addedInts +=4;
				break;
			case '5':
				addedInts +=5;
				break;
			case '6':
				addedInts +=6;
				break;
			case '7':
				addedInts +=7;
				break;
			case '8':
				addedInts +=8;
				break;
			case '9':
				addedInts +=9;
				break;
			case '0':
				break;
			}
			myList.add(addedInts);
		}
		
		for(int i : myList) {
			System.out.println(i);
		}
		
	
		

		
	
		return -1;
	}
}
