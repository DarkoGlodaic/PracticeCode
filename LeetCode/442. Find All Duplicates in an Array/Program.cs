int[] numbers = { 1, 2, 3, 1, 4, 5, 5, 4};
FindDuplicates(numbers);

// Using cyclic sort
IList<int> FindDuplicates(int[] nums) {
    
    int i = 0;
    int temp = 0;
    while (i < nums.Length) {
        if (nums[i] != nums[nums[i] -1]) {
            temp = nums[i];
            nums[i] = nums[temp - 1];
            nums[temp - 1] = temp;
        }
        else {
            i++;
        }
    }


    var dupes = new List<int>();
        for (i = 0; i < nums.Length; i++) {
            if (nums[i] != i + 1) {
                dupes.Add(nums[i]);
            }
        }
        return dupes;
}


// Straightforward method
/* IList<int> FindDuplicates(int[] nums) {
    int[] copy = new int[nums.Length];
    int[] dupes = new int[] {};
    for (int i = 0; i < nums.Length; i++)
    {
        if (copy.Contains(nums[i])) {
            dupes = dupes.Append<int>(nums[i]).ToArray();
        }
        copy[i] = nums[i];
    } 

    return dupes;
}
 */