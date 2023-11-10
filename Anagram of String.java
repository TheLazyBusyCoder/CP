class GfG
{
	public int remAnagrams(String s,String s1) {
        String small = s.length() > s1.length() ? s : s1;
        String big = s.length() > s1.length() ? s1 : s;
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < small.length(); i++) {
            char curr = small.charAt(i);
            if(map.get(curr) == null) {
                map.put(curr , 1);
            } else {
                map.put(curr , map.get(curr) + 1);
            }
        }
        
        for(int i = 0; i < big.length(); i++) {
            char curr = big.charAt(i);
            if(map2.get(curr) == null) {
                map2.put(curr , 1);
            } else {
                map2.put(curr , map2.get(curr) + 1);
            }
        }
        
        int output = 0;
        ArrayList<Character> one = new ArrayList<>();
        ArrayList<Character> two = new ArrayList<>();
        for(char c: map.keySet()) {
            if(map2.get(c) == null) {
                output += map.get(c);
                one.add(c);
            } else {
                output += Math.abs(map.get(c) - map2.get(c));
                one.add(c);
                two.add(c);
            }
        }
        
        for(char c: one) {
            map.remove(c);
        }
        for(char c: two) {
            map2.remove(c);
        }
        
        ArrayList<Character> three = new ArrayList<>();
        
        for(char c: map2.keySet()) {
            if(map.get(c) == null) {
                output += map2.get(c);
                three.add(c);
            }
        }
        
        for(char c: three) {
            map2.remove(c);
        }

        return output;
    }
}
