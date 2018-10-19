public class isPermutation {
	
	//Checks if an ASCII string is a permutation 
	public boolean isPermutation(String word1, String word2) {
		
		if(word1.length() != word2.length())
			return false;
		
		int[] tally = new int[256];
		
		for(int i = 0; i < word1.length(); i++)
			tally[word1.charAt(i)]++;
				
		for(int i = 0; i < word2.length(); i++) {
			tally[word2.charAt(i)]--;
			if(tally[word2.charAt(i)] < 0)
				return false;
		}
		
		return true;
	
	}
	
}
