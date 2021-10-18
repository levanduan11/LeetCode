package TwoPointers;

import java.util.*;

public class Concatenation {
    static boolean matchex(String a,String b){
        int c=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b.charAt(i))c++;
            else {
                return false;
            }
        }
        return c==a.length();
    }
    static   String []conver(String s,String[]p){
        String k="";
        for (String i:p
             ) {
            k+=i;
        }
        int n=k.length();
        String res[]=new String[s.length()-n+1];
        for (int i = 0; i <=s.length()-n ; i++) {
            res[i]=s.substring(i,i+n);
        }

return res;
    }

   static   boolean ind(String s,String[]p){
       int res=0;
        for (int i = 0; i < p.length; i++) {
            int a=s.indexOf(p[i]);
            if(a!=-1){
               s=s.substring(0,s.indexOf(p[i]))+s.substring(a+p[i].length());
            }
        }
        return s.length()==0;
    }



    public static   List<Integer> findSubstring(String s, String[] words) {
        int n=words.length;
        List<Integer>list=new ArrayList<>();

String r[]=conver(s,words);
        for (int i = 0; i < r.length; i++) {
            if (ind(r[i],words))list.add(i);
        }



        return list;
  }

    public static List<Integer> findSubstring1(String s, String[] words) {
        List<Integer> output = new ArrayList<>();
        if (s == null || words == null || s.length() == 0 || words.length == 0) {
            return output;
        }
        int wordLen = words[0].length(), wordsCount = 0;
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
            wordsCount++;
        }
        int substringLen = wordLen * wordsCount;

        // wordLen = N, there are N ways to start the search. e.g., if N = 4, search from 0, 1, 2 and 3. Starting from index 4 will fall into the sliding window search that starts from 0.
        for (int start = 0; start < wordLen; start++) {
            Queue<String> queue = new LinkedList<>();
            Map<String, Integer> substrWordToCount = new HashMap<>();
            for (int lo = start, hi = start; hi <= s.length() - wordLen; hi += wordLen) {
                String word = s.substring(hi, hi + wordLen);
                if (!wordToCount.containsKey(word)) {
                    queue = new LinkedList<>();
                    lo = hi + wordLen;
                    substrWordToCount = new HashMap<>();
                } else {
                    int substrWordCount = substrWordToCount.getOrDefault(word, 0);
                    if (substrWordCount >= wordToCount.get(word)) {
                        while (!queue.peek().equals(word)) {
                            String wordToRemove = queue.poll();
                            int count = substrWordToCount.get(wordToRemove);
                            if (count == 1) substrWordToCount.remove(wordToRemove);
                            else substrWordToCount.put(wordToRemove, count - 1);
                            lo += wordLen;
                        }
                        lo += wordLen;
                        queue.poll();
                    } else {
                        substrWordToCount.put(word, substrWordCount + 1);
                    }
                    queue.offer(word);
                    if (queue.size() == wordsCount) {
                        output.add(lo);
                    }
                }
            }
        }
        return output;
    }
    public static List<Integer> findSubstring2(String s, String[] words) {
        int worldLength = words[0].length();
        int windowSize = words.length * worldLength;
        List<Integer> result = new ArrayList<>();
        if (s.length() < windowSize) {
            return result;
        }
        // use indexMap can flat currentWorldsCount from map to array, decrease hash op
        Map<String, Integer> indexMap = new HashMap<>();
        for (String word : words) {
            indexMap.putIfAbsent(word, indexMap.size());
        }
        int[] worldsCount = new int[indexMap.size()];
        for (String word : words) {
            worldsCount[indexMap.get(word)]++;
        }
        for (int i = 0; i < worldLength; i++) {
            int start = i;
            int limitIndex = s.length() - windowSize;
            while (start <= limitIndex) {
                int end = start + windowSize;
                int currentCount = 0;
                int[] currentWorldsCount = new int[worldsCount.length];
                // reverse traversal can speed up, or otherwise can only jump over one word
                while (end > start) {
                    String substring = s.substring(end - worldLength, end);
                    Integer index = indexMap.get(substring);
                    if (index == null) {
                        start = end;
                        break;
                    }
                    if(++currentWorldsCount[index] > worldsCount[index]){
                        start = end;
                        break;
                    }
                    if(++currentCount >= words.length){
                        result.add(start);
                        start += worldLength;
                        break;
                    }
                    end -= worldLength;
                }
            }
        }
        return result;
    }
    public static List<Integer> substringUsingConcatenationOfAllGivenWords(String str, String[] words) {
        if(str == null || str.length() == 0 || words == null || words.length == 0) {
            return new ArrayList<>();
        }

        Map<String, Integer> frequencyMap = new HashMap<>();

        for(String word: words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        int eachWordLength = words[0].length();
        int totalWords = words.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= str.length() - totalWords * eachWordLength; i++) {

            Map<String, Integer> seenWords = new HashMap<>();

            for (int j = 0; j < totalWords; j++) {
                int wordIndex = i + j * eachWordLength;

                String word = str.substring(wordIndex, wordIndex + eachWordLength);

                if(!frequencyMap.containsKey(word)) {
                    break;
                }

                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);

                if(seenWords.get(word) > frequencyMap.getOrDefault(word, 0)) {
                    break;
                }

                if(j + 1 == totalWords)   {
                    result.add(i);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s="bafoofoobathefoobaman";
        String s1="barfoo";
         String a[]={"ba","foo","the"};
         List<Integer>list=substringUsingConcatenationOfAllGivenWords(s,a);

    }
}
/*
barthefoo
thefoobar
k.substring(0,k.indexOf(r))+
"ababaab"
["ab","ba","ba"]
 */