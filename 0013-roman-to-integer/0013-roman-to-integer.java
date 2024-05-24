class Solution {
    public int romanToInt(String s) {
    	HashMap<Character, Integer> hash = new HashMap<>();
    	int sum = 0;
    	hash.put('I' , 1);
    	hash.put('V' , 5);
    	hash.put('X' , 10);
    	hash.put('L' , 50);
    	hash.put('C' , 100);
    	hash.put('D' , 500);
    	hash.put('M' , 1000);
    	
    	for(int i =0; i<s.length(); i++) {
    		if(i<s.length() - 1 && hash.get(s.charAt(i)) < hash.get(s.charAt(i+1))) {
    			sum += hash.get(s.charAt(i+1)) - hash.get(s.charAt(i));
    			i++;
    		}else {
    			sum += hash.get(s.charAt(i));
    		}
    	}
    	System.out.println(sum);
    	return sum;
    }
}