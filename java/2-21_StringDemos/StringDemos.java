/* 
 * Some basic demos of string operations.
 * 
 */
public class StringDemos {

	public static void main(String[] args) {
		
		String sentence = "sloths are soooo nice";
		
		// charAt allows you to retrieve a single char from a string.  charAt
		//  requires the index of the character to retrieve.  The index refers to
		//  the location of the character within the string; the first index is 0,
		//  and the indices count up by 1 from there.
		System.out.println(sentence.charAt(3));
		System.out.println(sentence.charAt(0));
		System.out.println(sentence.charAt(6));

		// length gives you the number of characters in the string (spaces count
		//  as characters too!)  Because indices start counting from 0, the index
		//  of the last character is always one less than the length of the string.
		System.out.println(sentence.length());

		// substring allows you to get part of the original string.
		// There are two versions:
		//  x.substring(i) gives you the substring from index i (inclusive) of string x,
		//   all the way to the end
		//  x.substring(i, j) gives you the substring from index i (inclusive) to index
		//   j (exclusive) of x.  The length of this substring is (j - i).
		System.out.println(sentence.substring(1));
		System.out.println(sentence.substring(7, 10));
	}

}