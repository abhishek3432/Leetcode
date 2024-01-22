class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # sort the list in ascending order
        nums.sort()

        # initialize an empty list to store the triplets
        ans = []

        # get the length of the list
        n = len(nums)

        # set ptr1 to the first element of the list
        ptr1 = 0

        # iterate through the list with ptr1
        while ptr1 < n - 2:
            # skip over duplicates of nums[ptr1]
            if ptr1 > 0 and nums[ptr1] == nums[ptr1 - 1]:
                ptr1 += 1
                continue

            # exit early if nums[ptr1] is greater than 0
            if nums[ptr1] > 0:
                break

            # set ptr2 and ptr3
            ptr2, ptr3 = ptr1 + 1, n - 1

            while ptr2 < ptr3:
                # check for sum of 0
                sum_ = nums[ptr1] + nums[ptr2] + nums[ptr3]
                if sum_ == 0:
                    ans.append([nums[ptr1], nums[ptr2], nums[ptr3]])
                    ptr2 += 1
                    ptr3 -= 1

                    # skip over duplicates of nums[ptr2]
                    while ptr2 < ptr3 and nums[ptr2] == nums[ptr2 - 1]:
                        ptr2 += 1

                    # skip over duplicates of nums[ptr3]
                    while ptr2 < ptr3 and nums[ptr3] == nums[ptr3 + 1]:
                        ptr3 -= 1

                # adjust ptr2 or ptr3 based on sum
                elif sum_ < 0:
                    ptr2 += 1
                else:
                    ptr3 -= 1

            ptr1 += 1

        return ans