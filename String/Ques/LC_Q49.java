class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();  // -- Hashmap for sorted string and anagram match 

        for(String str : strs) {

            char[] arr = str.toCharArray();  // convert every String in char then sort it then again return in form of String
            Arrays.sort(arr);
            String key = new String(arr);

            if(map.containsKey(key)) {
                map.get(key).add(str);  // agr key means vo String already contain kr rha h to vo usi position pe insert kr dega
            }

            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);   // agr key contain nhi krta h to vo new list bna kr usme add kr dega
                map.put(key, list);
            }

        }

        return new ArrayList<>(map.values()); // ye 2d me return kra rha h means list<list<......>>

    }
}
