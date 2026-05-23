class Solution {
    func divideArray(_ nums: [Int]) -> Bool {
        var counter = [Int: Int]()

        for num in nums {
            counter[num, default: 0] += 1
        }

        for count in counter.values {
            if count % 2 != 0 {
                return false
            }
        }

        return true
    }
}