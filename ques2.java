import java.util.ArrayList;

public class ques2 {
    public static void LonelyNumber(ArrayList<Integer> nums, ArrayList<Integer> ans) {
        for (int i = 0; i < nums.size(); i++) {
            int ch = 1;
            int c = 0;

            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j)) {
                    c++;
                }
                if (nums.get(j) == nums.get(i) + 1 || nums.get(j) == nums.get(i) - 1) {
                    ch = 0;
                }
            }
            if (c == 1 && ch == 1) {
                ans.add(nums.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        LonelyNumber(nums, ans);
        System.out.println(ans);
    }
}