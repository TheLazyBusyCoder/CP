class Sol
{
    int isPossible (String S)
    {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < S.length(); i++) {
            char curr = S.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        if(S.length() % 2 == 0) {
            for(char c: map.keySet()) {
                if(map.get(c) % 2 != 0) {
                    return 0;
                }
            }
            return 1;
        } else {
            int count = 0;
            for(char c: map.keySet()) {
                if(map.get(c) % 2 != 0) {
                        count++;
                }
            }
            if(count == 1) return 1;
            else return 0;
        }
    }
}
