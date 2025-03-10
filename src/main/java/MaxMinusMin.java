
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        
        int max = nums.get(0);
        int min = nums.get(0);

        for (int number : nums) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }
        return max - min;
    }
}
