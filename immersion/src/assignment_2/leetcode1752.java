public class leetcode1752 {
        public boolean check(int[] nums) {
            int n = nums.length;
            int rotationIndex = findRotationIndex(nums);

            if (rotationIndex == -1) {
                return true;
            }

            return isNonDecreasing(nums, rotationIndex);
        }

        public static int findRotationIndex(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return i;
                }
            }
            return -1;
        }

        public static boolean isNonDecreasing(int[] nums, int rotationIndex) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                int index = (rotationIndex + 1 + i) % n;
                int nextIndex = (rotationIndex + 2 + i) % n;
                if (nums[index] > nums[nextIndex]) {
                    return false;
                }
            }
            return true;
        }
    }
}
