package com.data.structures.examples.Algorithms.SlidingWindow.FixedSize;

import com.data.structures.examples.Algorithms.Arrays.SlidingWindow.FixedSize.MaximumAverageSubArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaximumAverageSubArrayTest {
    @Autowired
    private MaximumAverageSubArray maximumAverageSubArray;

    @Test
    public void testMaximumAverageSubArray() {
        System.out.println(maximumAverageSubArray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        assertEquals(12.75000, maximumAverageSubArray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    @Test
    public void testMaximumAverageSubArray1() {
        System.out.println(maximumAverageSubArray.findMaxAverage(new int[]{5}, 1));
        assertEquals(5.00000, maximumAverageSubArray.findMaxAverage(new int[]{5}, 1));
    }

    @Test
    public void testMaximumAverageSubArray2() {
        System.out.println(maximumAverageSubArray.findMaxAverage(new int[]{-1}, 1));
        assertEquals(-1.00000, maximumAverageSubArray.findMaxAverage(new int[]{-1}, 1));
    }

    @Test
    public void testMaximumAverageSubArray3() {
        System.out.println(maximumAverageSubArray.findMaxAverage(new int[]{-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284, -3024, 1714, -2825, -2374, -2750, -959, 6516, 9356, 8040, -2169, -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293, -3486, -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576, -1501, -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636, -3994, -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880, 4127, -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591, 9076, 942, 4571, -4200, 7271, -6920, -1886, 662, 7844, 3658, -6562, -2106, -296, -3280, 8909, -8352, -9413, 3513, 1352, -8825}, 90));
        assertEquals(37.25555555555555, maximumAverageSubArray.findMaxAverage(new int[]{-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284, -3024, 1714, -2825, -2374, -2750, -959, 6516, 9356, 8040, -2169, -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293, -3486, -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576, -1501, -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636, -3994, -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880, 4127, -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591, 9076, 942, 4571, -4200, 7271, -6920, -1886, 662, 7844, 3658, -6562, -2106, -296, -3280, 8909, -8352, -9413, 3513, 1352, -8825}, 90));
    }

    @Test
    public void testMaximumAverageSubArray4() {
        System.out.println(maximumAverageSubArray.findMaxAverage(new int[]{9672,-6795,2696,-97,6315,936,4482,5863,5046,-1376,-4328,-7112,-7844,-3295,5268,5029,-2665,-8250,-879,8716,4184,-6046,-366,-1785,875,4281,-3168,2248,7773,-5652,2100,2575,432,4523,-9309,-9232,-59,-1532,-1493,-9329,-1850,7945,-1224,-2646,-8007,-6395,-396,9638,5254,-2544,-4907,3706,6002,-9347,6248,-47,-9564,4105,-4256,-1794,6345,-780,-3363,-5389,-8173,4810,6787,3589,-850,-9937,-6255,4218,-6299,-9022,-152,1063,-2003,-3677,9704,-6182,-9562,5489,6350,-1083,-7537,-3583,3029}, 31));
        assertEquals(573.6451612903226, maximumAverageSubArray.findMaxAverage(new int[]{9672,-6795,2696,-97,6315,936,4482,5863,5046,-1376,-4328,-7112,-7844,-3295,5268,5029,-2665,-8250,-879,8716,4184,-6046,-366,-1785,875,4281,-3168,2248,7773,-5652,2100,2575,432,4523,-9309,-9232,-59,-1532,-1493,-9329,-1850,7945,-1224,-2646,-8007,-6395,-396,9638,5254,-2544,-4907,3706,6002,-9347,6248,-47,-9564,4105,-4256,-1794,6345,-780,-3363,-5389,-8173,4810,6787,3589,-850,-9937,-6255,4218,-6299,-9022,-152,1063,-2003,-3677,9704,-6182,-9562,5489,6350,-1083,-7537,-3583,3029}, 31));
    }
}
