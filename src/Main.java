import Contains_Duplicate.ContainsDuplicate;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1};

        ContainsDuplicate c = new ContainsDuplicate();

        boolean value = c.containsDuplicate(nums);

        System.out.println(value);
    }
}