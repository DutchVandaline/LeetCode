import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
    	HashMap<String, Integer> h1 = new HashMap<String, Integer>();
    	h1.put("I",1);
    	h1.put("V",5);
    	h1.put("X",10);
    	h1.put("L",50);
    	h1.put("C",100);
    	h1.put("D",500);
    	h1.put("M",1000);
    	int result = 0;
    	
        String[] str_arr = s.split("");
        for(int i =0; i<str_arr.length-1; i++) {
        	if(h1.get(str_arr[i]) > h1.get(str_arr[i+1]) || h1.get(str_arr[i]) == h1.get(str_arr[i+1]))
        		result += h1.get(str_arr[i]);
        	else
        		result -= h1.get(str_arr[i]); 
        }
        result = result + h1.get(str_arr[str_arr.length - 1]); 
        return result;
    }
}
