class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        // String[] numsAsStrings = new String[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     numsAsStrings[i] = Integer.toString(nums[i]);
        // }
        // Arrays.sort(numsAsStrings, new Comparator<String>() {
        //     public int compare(String a, String b) {
        //         String order1 = a + b;
        //         String order2 = b + a;
        //         return order2.compareTo(order1);
        //     }
        // });
        // if (numsAsStrings[0].equals("0")) {
        //     return "0";
        // }
        // StringBuilder ad = new StringBuilder();
        // for (String s : numsAsStrings) {
        //     ad.append(s);
        // }
        // return ad.toString();

         if (nums == null || n == 0) return "";
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        if (s[0].equals("0")) return "0";

        StringBuilder ad = new StringBuilder();
        for (String str : s) {
            ad.append(str);
        }

        return ad.toString(); 
    }
}
