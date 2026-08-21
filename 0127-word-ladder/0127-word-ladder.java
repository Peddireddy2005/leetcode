class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int steps = 1;
        set.remove(beginWord);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                String word = q.poll();
                for(int j=0;j<word.length();j++){
                    char[] chars = word.toCharArray();
                    char org = chars[j];
                    for(char k ='a';k<='z';k++){
                        chars[j] = k;
                        String newWord = new String(chars);
                        if(set.contains(newWord)){
                            if(endWord.equals(newWord)){
                                return steps+1;
                            }
                            q.add(newWord);
                            set.remove(newWord);
                        }
                    }
                    chars[j] = org;
                }
            }
            steps++;
        }
        return 0;
    }
}