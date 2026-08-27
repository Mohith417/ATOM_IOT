//287 — Find the Duplicate Number
int findDuplicate(int[] nums) {
    // Phase 1: detect cycle
    int slow = nums[0], fast = nums[0];
    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);

    // Phase 2: find cycle entry = duplicate
    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }
    return slow;
}