class Solution {
    public boolean isAnagram(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (var character : str1.toCharArray())
            map1.put(character, map1.getOrDefault(character, 0) + 1);

        for (var character : str2.toCharArray())
            map2.put(character, map2.getOrDefault(character, 0) + 1);

        return map1.equals(map2);
    }
}
