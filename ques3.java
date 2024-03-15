import java.util.ArrayList;

public class ques3 {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int maxfreq = Integer.MIN_VALUE, indformaxFreq = -1;
        if (nums.contains(key) == false) {
            return -1;
        }
        for (int i = 0; i < nums.size(); i++) {
            int c = 1;
            int count = 0;
            for (int j = 0; j < i - 1; j++) {
                if (nums.get(i) == nums.get(j)) {
                    c = 0;
                }
            }
            if (c != 0) {
                for (int j = 0; j < nums.size(); j++) {
                    if (nums.get(j) == key && nums.get(j + 1) == nums.get(i)) {
                        count++;
                    }
                }
                if (maxfreq < count) {
                    maxfreq = count;
                    indformaxFreq = i;
                }
            }
        }
        return indformaxFreq;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;
        System.out.println(mostFrequent(nums, key) == -1 ? "Please provide valid key" : nums.get(mostFrequent(nums, key)));
    }

}
