package groupAnargram;

public class groupAnargram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();

        for(String s:strs){
            char charArray[]=s.toCharArray();
            Arrays.sort(charArray);
            String st=new String(charArray);
            if(!map.containsKey(st)){
                map.put(st, new LinkedList<String>());
            }
            map.get(st).add(s);
        }
        return new LinkedList<>(map.values());
    }
    
}
