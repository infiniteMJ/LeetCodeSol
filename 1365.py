class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        hashMap = {}

        res = sorted(nums[:])

        for i, num in enumerate(res):
            if num not in hashMap:
                hashMap[num] = i 

        for i, num in enumerate(nums):
            res[i] = hashMap[num]

        return res
