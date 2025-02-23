package sde.arrays3;

public class majority_element {

    public int func(int[] nums) {
        var maj_element = nums[0];
        var count = 1;
        for (var i = 1; i < nums.length; i ++) {
            if (maj_element == nums[i]) {
                count ++;
            } else {
                count --;
            }
            if (count == 0) {
                maj_element = nums[i];
                count = 1;
            }
        }
        return maj_element;
    }

}
