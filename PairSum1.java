import java.util.ArrayList;
public class PairSum1 {
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        // Brute Force - O(n^2)
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         if(list.get(i) + list.get(j) == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        // 2 pointer Approach - O(n)
        int lp=0,rp=list.size()-1;
        while(lp < rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(pairSum1(list,target));

    }
}
