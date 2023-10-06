public class Solution {
	
    public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3; i++) {

			if (target > 0 && nums[0] > 0 && nums[0] > target)
				return result;

			if (target < 0 && nums[0] > 0)
				return result;
			
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			for (int j = i + 1; j < nums.length - 2; j++) {
				
				if (j > i+1 && nums[j] == nums[j - 1])
					continue;
				
				int k = j + 1;
				int l = nums.length - 1;
				while (k < l) {

					int sum = nums[i] + nums[j] + nums[k] + nums[l];

					if (sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
						l--;
						while (k < l) {
							if (nums[k] == nums[k - 1])
								k++;
							else
								break;
						}

						while (k < l) {
							if (nums[l] == nums[l + 1])
								l--;
							else
								break;
						}
					} else if (sum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}

		return result;
	}
}