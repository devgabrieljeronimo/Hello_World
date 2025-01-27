import java.util.ArrayList;

public class Hello_World {
    public static void main(String[] args) {

        System.out.println("Hello World!" +
         "\n" + "Obrigado guanabara!");

        int[] nums = new int[3];
        nums[0] = 1;

        for ( int i : nums) {
            System.out.println(i);
        }

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(1);
        nums2.add(2);
        System.out.println(nums2.isEmpty());
    }
}
