class Solution {
	public int reversePairs(int[] nums) {
		return divide(nums);
	}
	public int divide(int [] array){
		if(array.length <2)
			return 0;

		int mid = array.length/2;
		int [] left = new int[mid];
		for(int i = 0;i<mid;i++){
			left[i] = array[i];
		}

		int [] right = new int [array.length - mid];

		for (int i =mid;i<array.length;i++)
			right[i - mid] = array[i];

		int count = divide(left);
		count += divide(right);
		count += merge(left,right,array);
		return count;
	}
	public int merge(int[] left, int[] right, int [] result){
		int i = 0, j = 0, k = 0, count = 0;
		while(i < left.length){
			while(j < right.length && left[i] > 2*(long)(right[j]))
				j++;
			count += j;
			i++;
		}
		i = 0;
		j = 0;
		while (i< left.length && j< right.length){
			if (left[i] <= right[j])
				result[k++] = left[i++];
			else{
				result[k++] = right[j++];
			}
		}
		while (i< left.length)
			result[k++] = left[i++];
		while (j< right.length)
			result[k++] = right[j++];
		return count;
	}
	}