import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.math.abs

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
//        romaToInt()

//        val result = longestCommonPrefix(arrayOf("ab", "a"))
//        println(result)

//        val result = isValid2("([}}])")
//        println(result)

//        val result = moveZeroes2(intArrayOf(0,1,0,3,12))
//        result.forEach {
//            print("$it ")
//        }

        moveZeroes3(intArrayOf(2,1,3)).forEach {
            print("$it ")
        }

//        val len = removeElement(intArrayOf(0,1,2,2,3,0,4,2),2)
//        println(len)

//        val len = removeDuplicates1(intArrayOf(1,2,2))
//        println(len)

//        sortColors2(intArrayOf(2,0,2,1,1,0))
//        sortColors(intArrayOf(3,2,3,1,2,4,5,5,6))

//        merge(intArrayOf(1,2,3,0,0,0),3, intArrayOf(2,5,6),3)
//        val result = twoSum3(intArrayOf(0,0,3,4),0)
//        result.forEach {
//            print("$it ")
//        }

//        println(isPalindrome("A man, a plan, a canal: Panama"))
//        println(reverseVowels("aA"))

//        println(maxArea(intArrayOf(4,3,2,1,4)))
//        println(minSubArrayLen(7, intArrayOf(2,3,1,2,4,3)))
//        println(maxSubArray2(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
//        plusOne(intArrayOf(7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6)).forEach {
//            print("$it ")
//        }

//        println(findMedianSortedArrays(intArrayOf(0,0),intArrayOf(0,0)))
//        println(threeSum(intArrayOf(2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4)))
//        println(threeSumClosest(intArrayOf(1,2,4,8,16,32,64,128),82))
//        fourSum(intArrayOf(-2, -1, -1, 1, 1, 2, 2), 0).forEach {
//            it.forEach {
//                print("$it ")
//            }
//            println()
//        }
//        nextPermutation(intArrayOf(1,9,8,5))
//        println(search(intArrayOf(1),9))
//        searchRange(intArrayOf(1),1).forEach {
//            print("$it ")
//        }

//        combinationSum(intArrayOf(2, 3, 5), 8).forEach {
//            it.forEach {
//                print("$it ")
//            }
//            println()
//        }

//        rotate(intArrayOf(1,2),5)
//        println(containsDuplicate(intArrayOf(3,3)))
//        println(singleNumber1(intArrayOf(4,1,2,1,2)))
//        intersect1(intArrayOf(4,9,5,4,4), intArrayOf(9,4,9,8,4,6)).forEach {
//            print("$it ")
//        }
//        val board = arrayOf(
//                charArrayOf('5','3','.','.','7','1','.','.','.'),
//                charArrayOf('6','.','.','1','9','5','.','.','.'),
//                charArrayOf('1','9','8','.','.','.','.','6','.'),
//                charArrayOf('8','.','.','.','6','.','.','.','3'),
//                charArrayOf('4','.','.','8','.','3','.','.','1'),
//                charArrayOf('7','.','.','.','2','.','.','.','6'),
//                charArrayOf('.','6','.','.','.','.','2','8','.'),
//                charArrayOf('.','.','.','4','1','9','.','.','5'),
//                charArrayOf('.','.','.','.','8','.','.','7','9'))

//        println(isValidSudoku(board = board))

//        rotate(arrayOf(
//                intArrayOf(5,1,9,11),
//                intArrayOf(2,4,8,10),
//                intArrayOf(13,3,6,7),
//                intArrayOf(15,14,12,16)
//        ))

//        reverseString(charArrayOf('H','a','n','n','a','h'))

//        println(firstUniqChar("loveleetcode"))
//        println(isAnagram("anaagram","nagaram"))
//        println(myAtoi("-2147483647"))
//        println(strStr("mississippi" ,"issip"))
//        println(countAndSay(0))
//        for (i in 0 until 1){
//            println(i)
//        }


        val head = ListNode(1)
        val one = ListNode(2)
        val two = ListNode(6)
        val three = ListNode(3)
        val four = ListNode(4)
        val five = ListNode(5)
        val six = ListNode(6)
        head.next = one
        one.next = two
        two.next = three
        three.next = four
        four.next = five
        five.next = six

//        println(removeElements(head,6)!!.n)

//
//        val head1 = ListNode(2)
//        val one1 = ListNode(2)
//        val two1 = ListNode(4)
//        val three1 = ListNode(5)
//        head1.next = one1
//        one1.next = two1
//        two1.next = three1

//        var tm : ListNode?= head
//        while (tm != null){
//            print("${tm.n} ")
//            tm = tm.next
//        }
//        println()
//        println("**************")
//        var result = reverseList(head)
//        while (result != null){
//            print("${result.n} ")
//            result = result.next
//        }

//        var re = mergeTwoLists(head,head1)
//        while (re != null){
//            print("${re.n} ")
//            re = re.next
//        }
//        println(isPalindrome(head))

//        println(hasCycle(head))

        val tree1 = TreeNode(1)
        val tree2 = TreeNode(2)
        val tree3 = TreeNode(2)
        val tree4 = TreeNode(3)
        val tree5 = TreeNode(4)
        val tree6 = TreeNode(4)
        val tree7 = TreeNode(3)
        tree1.left = tree2
        tree1.right = tree3
        tree2.left = tree4
        tree2.right = tree5
        tree3.left = tree6
        tree3.right = tree7
//        println(maxDepth(tree1))

//        println(isValidBST(tree1))

//        println(isSymmetric(tree1))

//        levelOrder(tree1).forEach {
//            it.forEach {
//                print("$it ")
//            }
//            println()
//        }

//        sortedArrayToBST(intArrayOf(-10,-3,0,5,9))

//        println(climbStairs(44))

//        println(maxProfit2(intArrayOf(7,1,5,3,6,4)))

//        println(rob(intArrayOf(2,7,9,3,1)))

//        combinationSum2(intArrayOf(2,5,2,1,2), 5).forEach {
//            it.forEach {
//                print("$it ")
//            }
//            println()
//        }

//        println(firstMissingPositive(intArrayOf(7,9)))

//        println(trap(intArrayOf(2,1,4,5)))

//        generate(3).forEach {
//            it.forEach {
//                print("$it ")
//            }
//            println()
//        }
//
//        getRow(3).forEach {
//            print("$it ")
//        }

//        spiralOrder(arrayOf(
//                intArrayOf(1,2,3,4),
//                intArrayOf(5,6,7,8),
//                intArrayOf(9,10,11,12),
//                intArrayOf(13,14,15,16))).forEach {
//                    print("$it ")
//        }

//        merge(arrayOf(intArrayOf(1,4),
//                      intArrayOf(0,0))).forEach {
//                          it.forEach {
//                              print("$it ")
//                          }
//            println()
//        }

//        insert(arrayOf(intArrayOf(1,2), intArrayOf(4,6), intArrayOf(7,9)), intArrayOf(3,3)).forEach {
//            it.forEach {
//                print("$it ")
//            }
//            println()
//        }
//
        //        println(searchMatrix2(arrayOf(intArrayOf(1,2,3,4,5),
        //                                      intArrayOf(6,7,8,9,10),
        //                                      intArrayOf(11,12,13,14,15),
        //                                      intArrayOf(16,17,18,19,20),
        //                                      intArrayOf(21,22,23,24,25)),19))

//        setZeroes(arrayOf(
//                intArrayOf(0,1,2,0),
//                intArrayOf(3,4,5,2),
//                intArrayOf(1,3,1,5)
//        ))

//        println(canPlaceFlowers(intArrayOf(0,0,0,0,1),2))
        //[[-2147483646,-2147483645],[2147483646,2147483647]]

//        println(findMinArrowShots(arrayOf(intArrayOf(-2147483646,-2147483645),
//                intArrayOf(2147483646,2147483647))))

//        println(findMinArrowShots(arrayOf(intArrayOf(9,12),
//                intArrayOf(1,10),
//                intArrayOf(4,11),
//                intArrayOf(8,12),
//                intArrayOf(3,9),
//                intArrayOf(6,9),
//                intArrayOf(6,7))))

//        combine(4,2).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        matrixReshape(arrayOf(intArrayOf(1,2), intArrayOf(3,4)),1,4).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        println(wordPattern("abba","dog cat cat dog"))

//        groupAnagrams2(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")).forEach {
//            it?.forEach { str->
//                print("$str ")
//            }
//            println()
//        }

        //18855122122554663322156413212654131216429
        //46412123346498896413216465494645685452632
//        println(multiply2("999","999"))

//        println(pivotIndex(intArrayOf(1,-1,3,-3,5,-5,2)))

//        findDiagonalOrder(arrayOf(intArrayOf(1,2,3,1))).forEach {
//                                    print("$it ")
//        }

//        println(longestPalindrome("aacabdkacaa"))

//        println(reverseWords2("Alice does not even like bob"))

//        println(arrayPairSum(intArrayOf(6,2,6,5,1,2)))

//        println(findMaxConsecutiveOnes(intArrayOf(1,1,1,1,1,1,1)))

//        println(findMin(intArrayOf(2,1)))

//        println(minPathSum(arrayOf(intArrayOf(1,2,3))))

//        permute(intArrayOf(1,2,3)).forEach { l ->
//            l.forEach {
//                print("$it ")
//            }
//            println()
//        }

//        println(lengthOfLongestSubstring2("ckilbkd"))

        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)
        val node6 = ListNode(2)
        val node7 = ListNode(5)
        val node8 = ListNode(5)
        node1.next = node2
//        node2.next = node3
//        node3.next = node4
//        node4.next = node5
//        node5.next = node6
//        node6.next = node7
//        node7.next = node8

        val nodea = ListNode(9)
        val nodeb = ListNode(9)
        val nodec = ListNode(9)
        val noded = ListNode(9)
        nodea.next = nodeb
        nodeb.next = nodec
        nodec.next = noded

//        var result = addTwoNumbers(node1,nodea)
//        while (result != null){
//            println("${result.n} ")
//            result = result.next
//        }

//        println(convert("P",5))

//        println(intToRoman(7))

//        letterCombinations("23").forEach {
//            print("$it ")
//        }

//        permuteUnique(intArrayOf(2,2,1,1)).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        subsets(intArrayOf(1,2,3,4)).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        println(canJump(intArrayOf()))

//        println(jump(intArrayOf(5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5)))
//        println(jump(intArrayOf(2,3,1,1,4)))

//        println(exist(arrayOf(charArrayOf('a','a','b','a','a','b'),
//                              charArrayOf('a','a','b','b','b','a'),
//                              charArrayOf('a','a','a','a','b','a'),
//                              charArrayOf('b','a','b','b','a','b'),
//                              charArrayOf('a','b','b','a','b','a'),
//                              charArrayOf('b','a','a','a','a','b')),"bbbaabbbbbab"))

//        combine(5,3).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        solveSudoku(arrayOf(charArrayOf('5','3','.','.','7','.','.','.','.'),
//                charArrayOf('6','.','.','1','9','5','.','.','.'),
//                charArrayOf('.','9','8','.','.','.','.','6','.'),
//                charArrayOf('8','.','.','.','6','.','.','.','3'),
//                charArrayOf('4','.','.','8','.','3','.','.','1'),
//                charArrayOf('7','.','.','.','2','.','.','.','6'),
//                charArrayOf('.','6','.','.','.','.','2','8','.'),
//                charArrayOf('.','.','.','4','1','9','.','.','5'),
//                charArrayOf('.','.','.','.','8','.','.','7','9'))).forEach {
//            it.forEach { c ->
//                print("$c ")
//            }
//            println()
//        }
//        var result = swapPairs(node1)
//        while (result != null){
//            print("${result.n} ")
//            result = result.next
//        }
//        var result = rotateRight(node1,7)
//        while (result != null){
//            print("${result.n} ")
//            result = result.next
//        }

//        var result = deleteDuplicates(node1)
//        while (result != null){
//            print("${result.n} ")
//            result = result.next
//        }

//        var result = partition(node1,6)
//        while (result != null){
//            print("${result.n} ")
//            result = result.next
//        }

//        var result = reverseBetween(node1,1,2)
//        while (result != null){
//            print("${result.n} ")
//            result = result.next
//        }

//        print(searchNum2(intArrayOf(-1,0,3,5,9,12),12))
//        sortedSquares(intArrayOf(-7,-3,2,3,11)).forEach {
//            print("$it ")
//        }
    }


    private fun updateOneElement(array: ArrayList<Int>) {
        array.add(4)
    }

    private fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isNullOrEmpty()) return ""
        var result = ""
        val baseStr = strs[0]
        for (i in baseStr.indices) {
            for (j in 1 until strs.size) {
                if (strs[j].length < i + 1) return result
                if (baseStr[i] == strs[j][i]) {
                    continue
                } else {
                    return result
                }
            }
            result += baseStr[i]
        }
        return result
    }

    private fun romaToInt() {
        val s = "MMMCMXC"
        val pattern = ""
        val regex = Regex(pattern)
        if (s.length in 1..15) {
            var preNum = getNum(s[0].toString())
            var num = 0
            for (i in 1 until s.length) {
                val curNum = getNum(s[i].toString())
                if (curNum > preNum) {
                    num -= preNum
                } else {
                    num += preNum
                }
                preNum = curNum
            }
            println("num:$num")
        } else {
            println("字符无效")
        }
    }

    private fun getNum(s: String): Int {
        return when (s) {
            "I" -> 1
            "V" -> 5
            "X" -> 10
            "L" -> 50
            "C" -> 100
            "D" -> 500
            "M" -> 1000
            else -> 0
        }
    }

    private fun isValid2(s: String): Boolean {
        println(s)
        if (s.length % 2 == 1) return false
        val stack = Stack<Char>()
        try {
            s.forEach {
                when (it) {
                    '(' -> stack.push(it)
                    '[' -> stack.push(it)
                    '{' -> stack.push(it)
                    ')' -> if (stack.peek() == '(') stack.pop() else return false
                    ']' -> if (stack.peek() == '[') stack.pop() else return false
                    '}' -> if (stack.peek() == '{') stack.pop() else return false
                }
            }
        } catch (e: EmptyStackException) {
            return false
        }
        return stack.empty()
    }

    private fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) return false
        var temp = 0
        for (i in s.indices) {
            if (i < temp) continue
            if (i == 0 && (s[i] == ')' || s[i] == ']' || s[i] == '}')) return false
            for (j in s.length - 1 downTo 1) {
                when (s[i]) {
                    '(' -> {
                        if (s[j] == ')') {
                            if (loop(j - 1, i + 1, s)) return false else {
                                temp = j
                                break
                            }
                        }
                    }
                    '[' -> {
                        if (s[j] == ']') {
                            if (loop(j - 1, i + 1, s)) return false
                        }
                    }
                    '{' -> {
                        if (s[j] == '}') {
                            if (loop(j - 1, i + 1, s)) return false
                        }
                    }
                }
            }
        }
        return true
    }

    private fun loop(j: Int, i: Int, s: String): Boolean {
        if ((j - i) % 2 == 1) {
            isValid(s.substring(i, j))
        } else {
            return true
        }
        return false
    }

    fun moveZeroes(nums: IntArray): IntArray {
        var pointer = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                pointer++
            } else if (pointer != 0) {
                nums[i - pointer] = nums[i]
                nums[i] = 0
            }
            nums.forEach {
                print("$it ")
            }
            println()
        }
        return nums
    }

    fun moveZeroes2(nums: IntArray): IntArray {
        var pointer = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[pointer++] = nums[i]
            }
        }
        nums.forEach {
            print("$it ")
        }
        println()
        while (pointer < nums.size) {
            nums[pointer] = 0
            pointer++
        }
        nums.forEach {
            print("$it ")
        }
        return nums
    }

    /**
     * [4,2,4,0,0,3,0,5,1,0]
     */
    fun moveZeroes3(nums: IntArray): IntArray {
        var l = 0
        var r = 0
        while (r < nums.size) {
            while (l < nums.size - 1 && nums[l] != 0) {
                l++
                r++
            }
            while (r < nums.size - 1 && nums[r] == 0) r++
            if (l == r) break
            nums[l] = nums[l] xor nums[r]
            nums[r] = nums[l] xor nums[r]
            nums[l] = nums[l] xor nums[r]
            l++
            r++
        }
        return nums
    }

    fun removeElement(nums: IntArray, value: Int): Int {
        var index = 0
        nums.forEach {
            if (it != value) {
                nums[index++] = it
            }
        }
        nums.forEach {
            print("$it ")
        }
        println()
        return index
    }

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var index = 0
        var target = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] != target) {
                nums[++index] = nums[i]
                target = nums[i]
            }
        }
        nums.forEach {
            print("$it ")
        }
        println()
        return index + 1
    }

    fun removeDuplicates1(nums: IntArray): Int {
        if (nums.size == 1) return 1
        var l = 0
        var r = 0
        while (r <= nums.size - 1) {
            if (nums[r] != nums[l]) {
                if (l + 1 < r) {
                    nums[l + 1] = nums[l + 1] xor nums[r]
                    nums[r] = nums[l + 1] xor nums[r]
                    nums[l + 1] = nums[l + 1] xor nums[r]
                }
                l++
            }
            r++
        }
        nums.forEach {
            print("$it ")
        }
        println()
        return l + 1
    }

    fun removeDuplicates2(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var index = 0
        var target = nums[0]
        var count = 0
        for (i in 1 until nums.size) {
            if (nums[i] != target) {
                nums[++index] = nums[i]
                target = nums[i]
                if (count != 0)
                    count = 0
            } else {
                if (count == 0) {
                    count++
                    nums[++index] = nums[i]
                    target = nums[i]
                }
            }
        }
        nums.forEach {
            print("$it ")
        }
        println()
        return index + 1
    }

    /**
     * 2,0,2,1,1,0
     */
    fun sortColors(nums: IntArray) {
        nums.forEach {
            print("$it ")
        }
        println()
        var temp = 0
        for (i in nums.indices) {
            for (j in 0 until nums.size - i - 1) {
                if (nums[j + 1] > nums[j]) {
                    temp = nums[j]
                    nums[j] = nums[j + 1]
                    nums[j + 1] = temp
                }
            }
        }
        nums.forEach {
            print("$it ")
        }
    }

    /**
     * 75.颜色分类
     * 双指针
     * 2,0,2,1,1,0
     */
    fun sortColors2(nums: IntArray){
        var l = 0
        var r = nums.size-1
        for (i in nums.indices){
            while (l < nums.size-1 && nums[l] == 0) l++
            while (r > 0 && nums[r] == 2) r--
            if (nums[i] == 0){
                nums[l] = nums[i] xor nums[l]
                nums[i] = nums[i] xor nums[l]
                nums[l] = nums[i] xor nums[l]
                l++
            }else if (nums[i] == 2){
                nums[r] = nums[i] xor nums[r]
                nums[i] = nums[i] xor nums[r]
                nums[r] = nums[i] xor nums[r]
                r--
            }
//            i++
        }
    }


    /**
     * 1,2,3,0,0,0
     * 2,5,6
     */
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        for (i in nums2.size - 1 downTo 0) {
            nums1[nums1.size - 1 - i] = nums2[i]
            for (j in nums1.size - 1 - i downTo 1) {
                if (nums1[j] < nums1[j - 1]) {
                    val temp = nums1[j]
                    nums1[j] = nums1[j - 1]
                    nums1[j - 1] = temp
                }
            }
        }
        nums1.forEach {
            print("$it ")
        }
    }

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val mid = target.div(2).toFloat()
        for (s in numbers.indices) {
            if (numbers[s] > mid) return intArrayOf()
            for (l in numbers.size - 1 downTo 0) {
                if (numbers[l] < mid) break
                if (numbers[s] + numbers[l] == target) {
                    return intArrayOf(s + 1, l + 1)
                }
            }
        }
        return intArrayOf()
    }

    /**
     * 对撞指针法
     */
    fun twoSum2(numbers: IntArray, target: Int): IntArray {
        var currentSum: Int
        var left = 0
        var right = numbers.size - 1
        while (left < right) {
            currentSum = numbers[left] + numbers[right]
            when {
                currentSum < target -> left++
                currentSum > target -> right--
                else -> return intArrayOf(left + 1, right + 1)
            }
        }
        return intArrayOf()
    }

    /**
     * 二分搜索法
     */
    fun twoSum3(numbers: IntArray, target: Int): IntArray {
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                if (numbers[j] == target - numbers[i]) {
                    return intArrayOf(i + 1, j + 1)
                }
            }
        }
        return intArrayOf()
    }

    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return true
        var l = 0
        var r = s.length - 1
        var cl: Char
        var cr: Char
        while (l < r) {
            if (!isValidChar(s[l])) {
                l++
                continue
            }
            if (!isValidChar(s[r])) {
                r--
                continue
            }
            cl = if (s[l] in 'A'..'Z') s[l] + 32 else s[l]
            cr = if (s[r] in 'A'..'Z') s[r] + 32 else s[r]
            if (cl != cr) {
                return false
            }
            l++
            r--
        }
        return true
    }

    private fun isValidChar(char: Char): Boolean {
        return char in 'A'..'Z' || char in 'a'..'z' || char in '0'..'9'
    }

    fun reverseVowels(s: String): String {
        if (s.isEmpty()) return s
        val stringArray = s.toCharArray()
        var l = 0
        var r = stringArray.size - 1
        var temp = ' '
        while (l < r) {
            if (!isVowelChar(stringArray[l])) {
                l++
                continue
            }
            if (!isVowelChar(stringArray[r])) {
                r--
                continue
            }
            temp = stringArray[l]
            stringArray[l] = stringArray[r]
            stringArray[r] = temp
            l++
            r--
        }
        return String(stringArray)
    }

    private fun isVowelChar(char: Char): Boolean {
        return when (char) {
            'a' -> true
            'e' -> true
            'i' -> true
            'o' -> true
            'u' -> true
            'A' -> true
            'E' -> true
            'I' -> true
            'O' -> true
            'U' -> true
            else -> false
        }
    }

    /**
     * 1,3,2,5,25,24,5
     */
    fun maxArea(height: IntArray): Int {
        if (height.size == 2) return height[0].coerceAtMost(height[1])
        var l = 0
        var r = height.size - 1
        var maxArea = 0
        while (l < r) {
            maxArea = maxArea.coerceAtLeast(height[l].coerceAtMost(height[r]) * (r - l))
            if (height[l] < height[r]) {
                l++
            } else {
                r--
            }
        }
        return maxArea
    }

    /**
     * 2,3,1,2,4,3
     * 7
     */
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        if (nums.contains(target)) return 1
        var i1 = 0
        var i2 = -1
        var currentSum = 0
        var minLen = Int.MAX_VALUE
        while (i1 < nums.size) {
            if (currentSum < target && i2 < nums.size - 1) {
                /*
                此处如果用i2++的话 假设一直满足if条件 在倒数第二次执行完后i2=nums.size-1
                此时因最后一次不满足if条件将不执行 如果数组全部加起来刚好满足>=target条件
                那么显然会得到错误答案 所以用++i2 相应的i2初始值为-1 否则数组第一个值加不上
                 */
                currentSum += nums[++i2]
            } else {
                currentSum -= nums[i1++]
            }
            if (currentSum >= target) {
                minLen = minLen.coerceAtMost(i2 - i1 + 1)
            }
        }
        return if (minLen == Int.MAX_VALUE) 0 else minLen
    }

    /**
     * -2,-1,-3,-4,-1,-2,-1,-5,-4
     */
    fun maxSubArray(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        if (nums.size == 2) {
            return nums[0].coerceAtLeast(nums[1]).coerceAtLeast(nums[0] + nums[1])
        }
        var i1 = 0
        var i2 = 0
        var currentSum = nums[0]
        var maxSum = nums[0]
        while (i1 < nums.size - 1) {
            if (currentSum >= nums[i2] && i2 < nums.size - 1) {
                currentSum += nums[++i2]
            } else {
                currentSum -= nums[i1++]
            }
            if (currentSum > maxSum) {
                maxSum = currentSum
            }
        }
        return maxSum
    }

    /**
     * 最大子序和
     * 动态规划解法
     *
     * 1、确定状态
     * 2、确定状态迁移方程
     * 3、确定初始状态和边界条件
     * 4、计算结果
     *
     * 定义一个dp数组，dp[i]表示前i+1个数组成的最大字序和（i从0开始）
     * 想求得dp[i]，首先要知道dp[i-1]的结果（状态）
     * 当dp[i-1]大于0时，dp[i] = dp[i-1]+nums[i];当dp[i-1]小于0时,去掉dp[i-1]的值，重置dp[i]到当前位置，因为dp[i-1]表示前i个数的最大字序和，当其小于0时没必要再和后面的数做累加
     * 对上面这句话的理解可以类比为 当第一个数为负数时，后面从第二个数开始的计算肯定是要抛弃第一个负数的，如果前两个数的和为0，那么在计算第三个数的时候，前两个数就不考虑了
     * 所以状态迁移方程就是：dp[i] = nums[i]+max(dp[i-1],0)
     */
    fun maxSubArray2(nums: IntArray): Int {
        var current = nums[0]
        var max = current
        for (i in 1 until nums.size) {
            current = nums[i] + current.coerceAtLeast(0)
            max = max.coerceAtLeast(current)
        }
        return max
    }

    /**
     * 9，9，9，9
     */
    fun plusOne(digits: IntArray): IntArray {
        digits[digits.size - 1] = digits.last() + 1
        val newArray = arrayListOf<Int>()
        for (i in digits.size - 1 downTo 1) {
            if (digits[i] == 10) {
                digits[i] = 0
                digits[i - 1] += 1
            }
            newArray.add(0, digits[i])
        }
        if (digits[0] == 10) {
            newArray.add(0, 0)
            newArray.add(0, 1)
        } else {
            newArray.add(0, digits[0])
        }
        return newArray.toIntArray()
    }

    /**
     * 4. 寻找两个正序数组的中位数
     * 归并排序
     */
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val mergeArray = IntArray(nums1.size + nums2.size)
        var i1 = 0
        var i2 = 0
        for (m in mergeArray.indices) {
            if (i1 > nums1.size - 1) {
                mergeArray[m] = nums2[i2++]
                continue
            }
            if (i2 > nums2.size - 1) {
                mergeArray[m] = nums1[i1++]
                continue
            }
            if (nums1[i1] < nums2[i2]) {
                mergeArray[m] = nums1[i1++]
            } else {
                mergeArray[m] = nums2[i2++]
            }
        }
        if (mergeArray.size % 2 == 1) {
            return mergeArray[(mergeArray.size - 1) / 2].toDouble()
        }
        val b = mergeArray[mergeArray.size / 2]
        val a = mergeArray[mergeArray.size / 2 - 1]
        return (a + b).toDouble() / 2
    }

    /**
     * 15. 三数之和
     * [2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4]
     */
    fun threeSum(nums: IntArray): List<List<Int>> {
        //先排序
//        val nums = quickSort(nums,0,nums.size-1)
        nums.sort()
        nums.forEach {
            print("$it ")
        }
        val resultArray = arrayListOf<List<Int>>()
        for (i1 in 0 until nums.size - 2) {
            //正序数组 第一个数都大于0了 后面没必要计算了
            if (nums[i1] > 0) break
            //排序过的数组遇到重复的直接跳过 进入下一次遍历
            if (i1 > 0 && nums[i1] == nums[i1 - 1]) continue
            val twoSum = 0 - nums[i1]
            //双指针  由于是排序过的数组 所以当sum>target时 右边减1 当sum<target时 左边加1
            var l = i1 + 1
            var r = nums.size - 1
            while (l < r) {
                while (l < r && l > i1 + 1 && nums[l] == nums[l - 1]) l++
                while (l < r && r < nums.size - 1 && nums[r] == nums[r + 1]) r--
                if (nums[l] + nums[r] > twoSum) {
                    r--
                    continue
                }
                if (nums[l] + nums[r] < twoSum) {
                    l++
                    continue
                }
                if (l < r) {
                    val resultSubArray = arrayListOf<Int>()
                    resultSubArray.add(nums[i1])
                    resultSubArray.add(nums[l++])
                    resultSubArray.add(nums[r--])
                    resultArray.add(resultSubArray)
                }
            }
        }
        return resultArray
    }

    /**
     * 快速排序
     */
    private fun quickSort(array: IntArray, l: Int, r: Int): IntArray {
        if (l < r) {
            var i = l
            //从倒数第二个数开始比较 每次排序的数组最后一个数作为轴
            var j = r - 1
            //轴
            val node = array[r]
            while (i <= j) {
                //从左边找 找到比轴大的数为止
                while (i <= j && array[i] < node) i++
                //从右边找 找到比轴小的数为止
                while (i <= j && array[j] >= node) j--
                //做一次判断
                if (i < j) {
                    val temp = array[i]
                    array[i++] = array[j]
                    array[j--] = temp
                }
            }
            val tm = array[i]
            array[i] = node
            array[r] = tm
            quickSort(array, l, i - 1)
            quickSort(array, i + 1, r)
        }
        return array
    }

    /**
     * 16. 最接近的三数之和
     * 1,2,5,10,11  12
     * [1,2,4,8,16,32,64,128]
     */
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        var l = 0
        var r = 0
        var closestSum = nums[0] + nums[1] + nums[2]
        for (i in 0 until nums.size - 2) {
            l = i + 1
            r = nums.size - 1
            while (l < r) {
                val threeSum = nums[i] + nums[l] + nums[r]
                if (Math.abs(closestSum - target) >= Math.abs(target - threeSum)) {
                    closestSum = nums[i] + nums[l] + nums[r]
                }
                when {
                    threeSum > target -> r--
                    threeSum < target -> l++
                    else -> return threeSum
                }
            }
        }
        return closestSum
    }

    /**
     * 18. 四数之和
     * [-2,-1,-1,1,1,2,2]
     */
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if (nums.isEmpty()) return emptyList()
        //排序
        nums.sort()
        val resultArray = arrayListOf<List<Int>>()
        for (i in 0 until nums.size - 3) {
            //去重
            if (i > 0 && nums[i] == nums[i - 1]) continue
            //排序过的数组 从i起前四个数之和大于target 后面没必要再去判断
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[3] > target) break
            //第i个数和最后三个数相加还小于target 进入下一次循环
            if (nums[i] + nums[nums.size - 3] + nums[nums.size - 2] + nums[nums.size - 1] < target) continue
            for (j in i + 1 until nums.size - 2) {
                //去重
                if (j > i + 1 && nums[j] == nums[j - 1]) continue
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break
                if (nums[i] + nums[j] + nums[nums.size - 2] + nums[nums.size - 1] < target) continue
                var l = j + 1
                var r = nums.size - 1
                while (l < r) {
                    //左边指针去重
                    if (l > j + 1 && nums[l] == nums[l - 1]) {
                        l++
                        continue
                    }
                    //右边指针去重
                    if (r < nums.size - 1 && nums[r] == nums[r + 1]) {
                        r--
                        continue
                    }
                    val fourSum = nums[i] + nums[j] + nums[l] + nums[r]
                    if (fourSum > target) {
                        r--
                        continue
                    } else if (fourSum < target) {
                        l++
                        continue
                    } else {
                        val subArray = arrayListOf<Int>()
                        subArray.add(nums[i])
                        subArray.add(nums[j])
                        subArray.add(nums[l++])
                        subArray.add(nums[r--])
                        resultArray.add(subArray)
                    }
                }
            }
        }
        return resultArray
    }

    /**
     * 31. 下一个排列
     * 4,2,0,2,3,2,0
     */
    fun nextPermutation(nums: IntArray): Unit {
        if (nums.size <= 1) return
        for (i in nums.size - 1 downTo 1) {
            if (i < nums.size - 1 && nums[i] == nums[i - 1]) continue
            if (nums[i] > nums[i - 1]) {
                for (j in nums.size - 1 downTo i) {
                    if (nums[j] > nums[i - 1]) {
                        val tm = nums[i - 1]
                        nums[i - 1] = nums[j]
                        nums[j] = tm
                        quickSort(nums, i, nums.size - 1)
                        nums.forEach {
                            print("$it ")
                        }
                        return
                    }
                }
            }
        }
        nums.sort()
        nums.forEach {
            print("$it ")
        }
    }

    /**
     * 33. 搜索旋转排序数组
     * 4,5,6,7,0,1,2
     * 6,7,8,0,1,2,3,4,5   0
     */
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1
        return searchMid(nums, 0, nums.size - 1, target)
    }

    private fun searchMid(nums: IntArray, start: Int, end: Int, target: Int): Int {
        if (end - start >= 2) {
            val mid = (start + end) / 2
            return if (nums[mid] > nums[start]) {
                when {
                    nums[start] > target -> searchMid(nums, mid + 1, end, target)
                    nums[start] < target -> searchMid(nums, start, mid - 1, target)
                    else -> start
                }
            } else {
                when {
                    nums[mid] > target -> searchMid(nums, start, mid - 1, target)
                    nums[mid] < target -> searchMid(nums, mid + 1, end, target)
                    else -> mid
                }
            }
        } else {
            nums.forEachIndexed { index, i ->
                if (i == target) return index
            }
        }
        return -1
    }

    /**
     * 81. 搜索旋转排序数组 II
     * 2,5,6,0,0,1,2  0
     */
//    fun search2(nums: IntArray, target: Int): Boolean {
//
//    }

    /**
     * 34. 在排序数组中查找元素的第一个和最后一个位置
     * 5,7,7,8,8,8,8,8,10    7  5,7,7,8,8,10  8
     */
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)
        if (nums[0] > target) return intArrayOf(-1, -1)
        if (nums.last() < target) return intArrayOf(-1, -1)
        val resultArray = IntArray(2)
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val mid = (l + r) / 2
            when {
                nums[mid] >= target -> r = mid - 1
                nums[mid] < target -> l = mid + 1
            }
        }
        resultArray[0] = if (nums[l] == target) l else -1
        r = nums.size - 1
        while (l <= r) {
            val mid = (l + r) / 2
            when {
                nums[mid] > target -> r = mid - 1
                nums[mid] <= target -> l = mid + 1
            }
        }
        resultArray[1] = if (nums[r] == target) r else -1
        return resultArray
    }

    /**
     * 39. 组合总和
     * 2,3,6,7    2 3 5
     */
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        if (candidates.isEmpty()) return emptyList()
        val resultArray = arrayListOf<List<Int>>()
        val subArray = arrayListOf<Int>()
        candidates.sort()
        combination(candidates, 0, target, subArray, resultArray)
        return resultArray
    }

    private fun combination(candidates: IntArray, i: Int, target: Int, subArray: ArrayList<Int>, resultArray: ArrayList<List<Int>>) {
        if (target < 0) return
        if (target == 0) {
            //用一个新数组去接收次数的subArray，否则下面对subArray进行操作时会删除元素
            val tmArray = arrayListOf<Int>()
            tmArray.addAll(subArray)
            resultArray.add(tmArray)
            return
        }
        for (j in i until candidates.size) {
            if (target < candidates[j]) break
            subArray.add(candidates[j])
            combination(candidates, j, target - candidates[j], subArray, resultArray)
            subArray.removeAt(subArray.size - 1)
        }
    }

    /**
     * 189. 旋转数组
     *
     * 1,2,3,4,5,6,7  5
     */
    fun rotate(nums: IntArray, k: Int): Unit {
        var k1 = k
        if (k > nums.size) k1 = k % nums.size
        val resultArray = IntArray(nums.size)
        for (i in nums.size - 1 downTo 0) {
            if (i >= (nums.size - k1)) {
                resultArray[i - nums.size + k1] = nums[i]
            } else {
                resultArray[i + k1] = nums[i]
            }
        }
        System.arraycopy(resultArray, 0, nums, 0, resultArray.size)
        nums.forEach {
            print("$it ")
        }
    }

    fun rotate2(nums: IntArray,k: Int): Unit{
        val newNums = IntArray(nums.size)
        for (i in nums.indices){
            newNums[(i+k)%nums.size] = nums[i]
        }
        System.arraycopy(newNums,0,nums,0,newNums.size)
    }

    /**
     * 217. 存在重复元素
     * 排序
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size < 2) return false
        nums.sort()
        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) return true
        }
        return false
    }

    /**
     * 217. 存在重复元素
     * 哈希表
     */
    fun containsDuplicate2(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        nums.forEach {
            if (!set.add(it)) return true
        }
        return false
    }

    /**
     * 只出现一次的数字
     *
     * 哈希表写法
     */
    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        val set = HashSet<Int>()
        for (i in nums.indices) {
            if (!set.add(nums[i])) set.remove(nums[i])
        }
        return set.first()
    }

    /**
     * 只出现一次的数字
     *
     * 位运算写法
     */
    fun singleNumber1(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }

    /**
     * 两个数组的交集 II  nums1 = [1,2,2,1], nums2 = [2,2]
     * 4,5,9   4,4,8,9,9
     * 排序+双指针写法
     */
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()
        val resultArray = IntArray(nums1.size.coerceAtMost(nums2.size))
        var i1 = 0
        var i2 = 0
        var i = 0
        while (i1 < nums1.size && i2 < nums2.size) {
            when {
                nums1[i1] > nums2[i2] -> {
                    i2++
                }
                nums1[i1] < nums2[i2] -> {
                    i1++
                }
                else -> {
                    resultArray[i] = nums1[i1]
                    i++
                    i1++
                    i2++
                }
            }
        }
        return resultArray.copyOfRange(0, i)
    }

    /**
     * 两个数组的交集 II
     * 哈希表写法
     * 4 9 5 4 4
     * 9 4 9 8 4 6
     */
    fun intersect1(nums1: IntArray, nums2: IntArray): IntArray {
        val resultArray = IntArray(nums1.size.coerceAtMost(nums2.size))
        var i = 0
        val map = HashMap<String, Int>()
        for (i1 in nums1) {
            map["$i1"] = map.getOrDefault("$i1", 0) + 1
        }
        for (i2 in nums2) {
            if (map.getOrDefault("$i2", 0) > 0) {
                resultArray[i] = i2
                map["$i2"] = map.getOrDefault("$i2", 0) - 1
                i++
            }
        }
        return resultArray.copyOfRange(0, i)
    }

    /**
     * 有效的数独
     *
     *   charArrayOf('5','3','.','.','7','.','.','.','.'),
     *   charArrayOf('6','.','.','1','9','5','.','.','.'),
     *   charArrayOf('.','9','8','.','.','.','.','6','.'),
     *   charArrayOf('8','.','.','.','6','.','.','.','3'),
     *   charArrayOf('4','.','.','8','.','3','.','.','1'),
     *   charArrayOf('7','.','.','.','2','.','.','.','6'),
     *   charArrayOf('.','6','.','.','.','.','2','8','.'),
     *   charArrayOf('.','.','.','4','1','9','.','.','5'),
     *   charArrayOf('.','.','.','.','8','.','.','7','9')
     */
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val hashSet = HashSet<Char>()
        val hashSet1 = HashSet<Char>()
        val hashSet2 = HashSet<Char>()
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] != '.' && !hashSet.add(board[i][j])) return false
            }
            hashSet.clear()
            for (k in 0..8) {
                if (board[k][i] != '.' && !hashSet.add(board[k][i])) return false
            }
            hashSet.clear()
            if (i > 0 && i % 3 == 2) {
                for (m in i - 2..i) {
                    for (n in 0..8) {
                        when {
                            n < 3 -> if (board[m][n] != '.' && !hashSet.add(board[m][n])) return false
                            n in 3..5 -> if (board[m][n] != '.' && !hashSet1.add(board[m][n])) return false
                            else -> if (board[m][n] != '.' && !hashSet2.add(board[m][n])) return false
                        }
                    }
                }
                hashSet.clear()
                hashSet1.clear()
                hashSet2.clear()
            }
        }
        return true
    }

    /**
     * 旋转图像
     *
     *  intArrayOf(1,2,3),
     *  intArrayOf(4,5,6),
     *  intArrayOf(7,8,9),
     */
    fun rotate(matrix: Array<IntArray>): Unit {
        var u = 0
        var d = matrix.size - 1
        while (u < d) {
            for (i in matrix.indices) {
                matrix[u][i] = matrix[u][i] xor matrix[d][i]
                matrix[d][i] = matrix[u][i] xor matrix[d][i]
                matrix[u][i] = matrix[u][i] xor matrix[d][i]
            }
            u++
            d--
        }
        for (j in matrix.indices) {
            for (k in j + 1 until matrix.size) {
                matrix[j][k] = matrix[j][k] xor matrix[k][j]
                matrix[k][j] = matrix[j][k] xor matrix[k][j]
                matrix[j][k] = matrix[j][k] xor matrix[k][j]
            }
        }
        matrix.forEach {
            it.forEach {
                print("$it ")
            }
            println()
        }
    }

    /**
     * 反转字符串
     */
    fun reverseString(s: CharArray): Unit {
        var l = 0
        var r = s.size - 1
        while (l < r) {
            val tm = s[l]
            s[l++] = s[r]
            s[r--] = tm
        }
        s.forEach {
            print("$it ")
        }
    }

    /**
     * 字符串中的第一个唯一字符
     */
    fun firstUniqChar(s: String): Int {
        val map = HashMap<String, Int>()
        var l = 0
        var r = s.length - 1
        while (l < r) {
            map["${s[l]}"] = map.getOrDefault("${s[l]}", 0) + 1
            map["${s[r]}"] = map.getOrDefault("${s[r]}", 0) + 1
            l++
            r--
        }
        if (l == r) map["${s[l]}"] = map.getOrDefault("${s[l]}", 0) + 1
        for (i in s.indices) {
            if (map["${s[i]}"] == 1)
                return i
        }
        return -1
    }

    /**
     * 有效的字母异位词
     */
    fun isAnagram(s: String, t: String): Boolean {
        val map = HashMap<String, Int>()
        for (i in s) {
            map["$i"] = map.getOrDefault("$i", 0) + 1
        }
        for (j in t) {
            map["$j"] = map.getOrDefault("$j", 0) - 1
        }
        map.keys.forEach {
            if (map[it] != 0) return false
        }
        return true
    }

    /**
     * 字符串转换整数 (atoi)  0 91283472332
     */
    fun myAtoi(s: String): Int {
        var index = 0
        var isStart = true
        var hasNum = false
        val sb = StringBuilder()
        while (index < s.length) {
            while (isStart && index < s.length && s[index] == ' ') index++
            isStart = false
            if (index >= s.length) break
            if (s[index].isDigit()) {
                if (s[index] == '0' && !hasNum) {
                    index++
                    continue
                }
                sb.append(s[index++])
                hasNum = true
            } else {
                if (s[index] == '-' || s[index] == '+') {
                    if (index == 0) {
                        sb.append(s[index++])
                        continue
                    }
                    if (s[index - 1] == ' ') {
                        sb.append(s[index++])
                    } else break
                } else break
            }
        }
        if (sb.isEmpty()) return 0
        val maxS = Int.MAX_VALUE.toString()
        val minS = Int.MIN_VALUE.toString()
        if (sb[0] == '-') {
            if (sb.length == 1) return 0
            return when {
                sb.length > minS.length -> Int.MIN_VALUE
                sb.length == minS.length -> if (sb.toString().toLong() < Int.MIN_VALUE) Int.MIN_VALUE else sb.toString().toInt()
                else -> sb.toString().toInt()
            }
        }
        if (sb[0] == '+') {
            sb.delete(0, 1)
            if (sb.isEmpty()) return 0
            return getFinalNum(sb, maxS)
        }
        return getFinalNum(sb, maxS)
    }

    private fun getFinalNum(sb: StringBuilder, maxS: String): Int {
        return when {
            sb.length > maxS.length -> Int.MAX_VALUE
            sb.length == maxS.length -> if (sb.toString().toLong() > Int.MAX_VALUE) Int.MAX_VALUE else sb.toString().toInt()
            else -> sb.toString().toInt()
        }
    }

    /**
     * 实现 strStr()
     * hello ll
     */
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length > haystack.length) return -1
        if (needle.isEmpty()) return 0
        var h = 0
        var n = 0
        var i = -1
        var isStart = true
        var nextI = -1
        while (n < needle.length) {
            while (isStart && h < haystack.length && haystack[h] != needle[n]) h++
            if (h >= haystack.length) return -1
            while (!isStart && h < haystack.length && n < needle.length && haystack[h] == needle[n]) {
                if (haystack[h] == needle[0] && nextI == -1 && h != i) nextI = h
                h++
                n++
            }
            if (isStart) {
                i = h
                isStart = false
                continue
            }
            if (n < needle.length) {
                h = if (nextI == -1) h else nextI
                nextI = -1
                n = 0
                isStart = true
            }
        }
        return i
    }

    /**
     * 外观数列
     */
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        }
        var count = 1
        val tmS = countAndSay(n - 1)
        val sb = StringBuilder()
        var i = 1
        while (i < tmS.length) {
            if (i > 0 && tmS[i] == tmS[i - 1]) {
                count++
            } else {
                sb.append(count).append(tmS[i - 1])
                count = 1
            }
            i++
        }
        sb.append(count).append(tmS.last())
        return sb.toString()
    }

    class ListNode(var n: Int?) {
        var next: ListNode? = null
    }

    /**
     * 删除链表中的节点
     */
    fun deleteNode(node: ListNode) {
        node.n = node.next?.n
        node.next = node.next?.next
    }

    /**
     * 删除链表的倒数第N个节点
     */
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var length = 0
        var h = head
        while (h != null) {
            length++
            h = h.next
        }
        if (length == n) return head?.next
        val end = length - n
        var pre = head
        for (i in 0..end) {
            pre = pre?.next
        }
        pre?.next = pre?.next?.next
        return pre
    }

    /**
     * 反转链表
     */
    fun reverseList(head: ListNode?): ListNode? {
        val stack = Stack<ListNode>()
        var tm = head
        while (tm != null) {
            stack.push(tm)
            tm = tm.next
        }
        if (stack.isEmpty()) return null
        var result = stack.pop()
        val node = result
        while (!stack.isEmpty()) {
            result.next = stack.pop()
            result = result.next
        }
        result.next = null
        return node
    }

    /**
     * 合并两个有序链表
     *
     * 1 1 3 6
     * 2 2 4 5
     */
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        return when {
            l1 == null && l2 == null -> null
            l1 != null && l2 == null -> l1
            l1 == null && l2 != null -> l2
            else -> {
                val tm = ListNode(0)
                var result = tm
                var t1 = l1
                var t2 = l2
                while (t1 != null && t2 != null) {
                    if (t1.n ?: 0 <= t2.n ?: 0) {
                        result.next = t1
                        t1 = t1.next
                    } else {
                        result.next = t2
                        t2 = t2.next
                    }
                    result = result.next!!
                }
                result.next = t1 ?: t2
                tm.next
            }
        }
    }


    /**
     * 回文链表
     *
     * 1 2 2 1
     */
    fun isPalindrome(head: ListNode?): Boolean {
        val stack = Stack<ListNode>()
        var tm = head
        var source = head
        var len = 0
        while (tm != null) {
            stack.push(tm)
            tm = tm.next
            len++
        }
        if (stack.isEmpty()) return true
        len /= 2
        while (len-- >= 0) {
            if (source?.n ?: 0 != stack.pop()?.n) return false
            source = source?.next
        }
        return true
    }

    /**
     * 环形链表
     */
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head
        var isStart = true
        while (fast != null && slow != null) {
            if (!isStart && slow == fast) return true
            isStart = false
            slow = slow.next
            fast = fast.next?.next
        }
        return false
    }

    /**
     * 环形链表
     */
    fun hasCycle2(head: ListNode?): Boolean {
        val set = HashSet<ListNode?>()
        var next = head
        set.add(next)
        while (next != null){
            next = next.next
            if (!set.add(next)) return true
        }
        return false
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    /**
     * 二叉树的最大深度
     */
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return leftDepth.coerceAtLeast(rightDepth) + 1
    }

    /**
     * 验证二叉搜索树
     */
    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBSTSubTree(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    private fun isValidBSTSubTree(tree: TreeNode?, min: Long, max: Long): Boolean {
        if (tree == null) return true
        if (tree.`val` > max || tree.`val` < min) return false
        return isValidBSTSubTree(tree.left, min, tree.`val`.toLong()) && isValidBSTSubTree(tree.right, tree.`val`.toLong(), max)
    }

    /**
     * 对称二叉树
     */
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return isSymmetricSubNode(root.left, root.right)
    }

    private fun isSymmetricSubNode(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null || left.`val` != right.`val`) return false
        return isSymmetricSubNode(left.left, right.right) && isSymmetricSubNode(left.right, right.left)
    }

    /**
     * 二叉树的层序遍历
     */
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val queue = LinkedList<TreeNode>()
        val result = arrayListOf<ArrayList<Int>>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val levelNumber = queue.size
            val subList = arrayListOf<Int>()
            for (i in 0 until levelNumber) {
                val node = queue.poll()
                subList.add(node.`val`)
                if (node.left != null) {
                    queue.add(node.left!!)
                }
                if (node.right != null) {
                    queue.add(node.right!!)
                }
            }
            result.add(subList)
        }
        return result
    }

    /**
     * 将有序数组转换为二叉搜索树
     *
     * -10,-3
     *
     */
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        nums.forEach {
            print("$it ")
        }
        println()
        if (nums.isEmpty()) return null
        if (nums.size == 1) return TreeNode(nums[0])
        if (nums.size == 2) {
            val head = TreeNode(nums[0])
            head.right = TreeNode(nums[1])
            return head
        }
        val mid = if (nums.size % 2 == 1) nums.size / 2 else nums.size / 2 - 1
        val midNode = TreeNode(nums[mid])
        val leftArray = IntArray(mid)
        System.arraycopy(nums, 0, leftArray, 0, leftArray.size)
        val rightArray = IntArray(nums.size - mid - 1)
        System.arraycopy(nums, mid + 1, rightArray, 0, rightArray.size)
        midNode.left = sortedArrayToBST(leftArray)
        midNode.right = sortedArrayToBST(rightArray)
        return midNode
    }


    /**
     * 爬楼梯
     */
    fun climbStairs(n: Int): Int {
        return memorial(hashMapOf(), n)
    }

    private fun memorial(maps: HashMap<Int, Int>, n: Int): Int {
        if (n == 1) return 1
        if (n == 2) return 2
        if (maps.keys.contains(n)) return maps[n]!!
        var result = 0
        result += (memorial(maps, n - 1) + memorial(maps, n - 2))
        maps[n] = result
        return result
    }

    fun climbStairs2(n: Int): Int{
        if (n == 1) return 1
        if (n == 2) return 2
        val dp = Array(n){IntArray(1)}
        dp[0][0] = 1
        dp[1][0] = 2
        for (i in 2 until n){
            dp[i][0] = dp[i-1][0]+dp[i-2][0]
        }
        return dp[n-1][0]
    }

    fun climbStairs3(n: Int): Int{
        if (n == 1) return 1
        if (n == 2) return 2
        val dp = IntArray(3)
        dp[0] = 1
        dp[1] = 2
        for (i in 2 until n){
            dp[2] = dp[0]+dp[1]
            dp[0] = dp[1]
            dp[1] = dp[2]
        }
        return dp[2]
    }

    /**
     * 买卖股票的最佳时机
     */
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = Int.MIN_VALUE
        var currentIMin = Int.MAX_VALUE
        var currentJMax = Int.MIN_VALUE
        var currentJMaxPos = 0
        for (i in prices.indices) {
            if (prices[i] >= currentIMin) continue
            currentIMin = prices[i]
            if (currentJMaxPos > i) {
                maxProfit = prices[currentJMaxPos] - currentIMin
                continue
            }
            currentJMax = Int.MIN_VALUE
            for (j in i + 1 until prices.size) {
                if (prices[j] <= prices[i]) continue
                if (prices[j] <= currentJMax) continue
                if (maxProfit < (prices[j] - prices[i])) {
                    maxProfit = prices[j] - prices[i]
                    currentJMax = prices[j]
                    currentJMaxPos = j
                }
            }
        }
        return if (maxProfit == Int.MIN_VALUE) 0 else maxProfit
    }

    /**
     * 买卖股票的最佳时机
     * 动态规划：
     * dp[i]表示前i天内的最低价
     * base  case: dp[0] = prices[0]
     * 动态转移方程：dp[i] = min{dp[i-1],prices[i]}
     *
     * 7,1,5,3,6,4
     */
    fun maxProfit2(prices: IntArray): Int{
        val dp = IntArray(prices.size)
        dp[0] = prices[0]
        var max = 0
        for (i in 1 until prices.size){
            dp[i] = dp[i-1].coerceAtMost(prices[i])
            max = max.coerceAtLeast(prices[i] - dp[i])
        }
        return max
    }

    /**
     * 打家劫舍
     */
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var dp0 = 0
        var dp1 = nums[0]
        for (i in 1 until nums.size) {
            val tm = dp0.coerceAtLeast(dp1)
            dp1 = nums[i] + dp0
            dp0 = tm
        }
        return dp0.coerceAtLeast(dp1)
    }

    /**
     * 40. 组合总和 II
     *
     * 10,1,2,7,6,1,5  8
     *
     * 1,1,2,5,6,7,10
     */
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        if (candidates.isEmpty()) return emptyList()
        val res = HashSet<List<Int>>()
        candidates.sort()
        for (i in candidates.indices){
            if (i > 0 && candidates[i] == candidates[i-1]) continue
            if (candidates[i] > target) break
            combination2(candidates, target, i, arrayListOf(), res)
        }
        return res.toList()
    }

    private fun combination2(candidates: IntArray, target: Int, start: Int, subArray: ArrayList<Int>, resultArray: HashSet<List<Int>>) {
        if (target < 0) return
        if (target == 0){
            val tmArray = arrayListOf<Int>()
            tmArray.addAll(subArray)
            resultArray.add(tmArray)
            return
        }
        for (i in start until candidates.size){
            if (candidates[i] > target) break
            subArray.add(candidates[i])
            combination2(candidates,target-candidates[i],i+1,subArray, resultArray)
            subArray.removeAt(subArray.size-1)
        }
    }

    /**
     * 41. 缺失的第一个正数
     *
     * 3,4,-1,1  1 4 -1 3
     */
    fun firstMissingPositive(nums: IntArray): Int {
        val len = nums.size
        for (i in nums.indices){
            while (nums[i] in 1..len && nums[nums[i] - 1] != nums[i]){
                swap(nums,i,nums[i]-1)
            }
        }
        for (j in nums.indices){
            if (j+1 != nums[j]) return j+1
        }
        return len+1
    }

    private fun swap(nums: IntArray,i: Int,j: Int){
        val tm = nums[i]
        nums[i] = nums[j]
        nums[j] = tm
    }

    /**
     * 42. 接雨水
     *
     * 0,1,0,2,1,0,1,3,2,1,2,1   4,2,0,3,2,5
     * 5,4,1,2   2, 1, 4, 5
     */
    fun trap(height: IntArray): Int {
        var l = 0
        var r = 0
        var s = 0
        var max = 0
        var maxPos = 0
        for (i in height.indices){
            maxPos = if (height[i] > max) i else maxPos
            max = max.coerceAtLeast(height[i])
        }
        while (r < maxPos){
            while (l < maxPos && ((l == 0 && height[l] < height[l+1]) || (l > 0 && (height[l] in height[l-1] .. height[l+1] || height[l] < height[l-1])))) l++
            if (l == maxPos) break
            r = l+1
            while (r < height.size-1 && ((r == 0 && height[r] < height[r+1]) || (r > 0 && (height[r] in height[r-1] .. height[r+1] || height[r] < height[r-1] || height[r] < height[l])))) r++
            if (r == height.size - 1 && height[r] <= height[r-1]) break
            s += height[l].coerceAtMost(height[r])*(r-l)
            s = subtractSpare(height, l, r, s)
            l = r
        }
        if (r == height.size-1) return s
        l = height.size-1
        r = height.size-1
        while (r > maxPos){
            while (l > maxPos && ((l == height.size-1 && height[l] < height[l-1]) || (l < height.size-1 && (height[l] in height[l-1] .. height[l+1] || height[l] < height[l+1])))) l--
            if (l == maxPos) break
            r = l-1
            while (r > maxPos && ((r == height.size-1 && height[r] < height[r-1]) || (r < height.size-1 && (height[r] in height[r-1] .. height[r+1] || height[r] < height[r+1] || height[r] < height[l])))) r--
            if (r == maxPos && height[r] <= height[r+1]) break
            s += height[l].coerceAtMost(height[r])* abs(r-l)
            s = subtractSpare(height, r, l, s)
            l = r
        }
        return s
    }

    private fun subtractSpare(height: IntArray, l: Int, r: Int, s: Int): Int {
        var s1 = s
        if (height[l] <= height[r]) {
            for (i in l until r) {
                if (height[i] != 0)
                    s1 -= height[i]
            }
        }
        if (height[l] > height[r]) {
            for (i in r downTo l + 1) {
                if (height[i] != 0)
                    s1 -= height[i]
            }
        }
        return s1
    }

    /**
     * 118. 杨辉三角
     */
    fun generate(numRows: Int): List<List<Int>> {
        val resultList = arrayListOf<List<Int>>()
        for (i in 0 until numRows){
            val subList = arrayListOf<Int>()
            for (j in 0 until i+1){
                if (j == 0 || j == i)
                    subList.add(1)
                else
                    subList.add(resultList[i-1][j-1]+resultList[i-1][j])
            }
            resultList.add(subList)
        }
        return  resultList
    }

    /**
     * 119. 杨辉三角 II
     */
    fun getRow(rowIndex: Int): List<Int> {
        val resultList = arrayListOf<List<Int>>()
        for (i in 0 until rowIndex+1){
            val subList = arrayListOf<Int>()
            for (j in 0 until i+1){
                if (j == 0 || j == i)
                    subList.add(1)
                else
                    subList.add(resultList[i-1][j-1]+resultList[i-1][j])
            }
            resultList.add(subList)
        }
        return  resultList.last()
    }

    /**
     * 54. 螺旋矩阵
     */
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = arrayListOf<Int>()
        val isVisited = Array(matrix.size){ BooleanArray(matrix[0].size){false} }
        spiralOrderProcess(0,0,1,matrix,isVisited,result)
        return result
    }


    private fun spiralOrderProcess(r: Int,c: Int,dir: Int,matrix: Array<IntArray>,isVisited: Array<BooleanArray>,result: ArrayList<Int>): Boolean{
        if (r < 0 || c < 0) return false
        if (r > matrix.size-1 || c > matrix[0].size-1) return false
        if (isVisited[r][c]) return false
        result.add(matrix[r][c])
        isVisited[r][c] = true
        return when(dir){
            1 -> spiralOrderProcess(r, c+1, dir, matrix, isVisited, result) || spiralOrderProcess(r+1, c, 2, matrix, isVisited, result)
            2 -> spiralOrderProcess(r+1, c, dir, matrix, isVisited, result) || spiralOrderProcess(r, c-1, 3, matrix, isVisited, result)
            3 -> spiralOrderProcess(r, c-1, dir, matrix, isVisited, result) || spiralOrderProcess(r-1, c, 4, matrix, isVisited, result)
            4 -> spiralOrderProcess(r-1, c, dir, matrix, isVisited, result) || spiralOrderProcess(r, c+1, 1, matrix, isVisited, result)
            else -> true
        }
    }

    /**
     * 56. 合并区间
     *
     * 1 3  2 6   3 4  2 6   1 6  2 5
     *
     * 1 2  3 4  1 4  0 4
     */
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        Arrays.sort(intervals) { a, b -> a[0] - b[0]}
        var index = 0
        val resultList = arrayListOf<IntArray>()
        resultList.add(intervals[index])
        while (index < intervals.size-1){
            index += 1
            if (resultList.last()[1] >= intervals[index][0]){
                resultList.last()[0] = resultList.last()[0].coerceAtMost(intervals[index][0])
                resultList.last()[1] = resultList.last()[1].coerceAtLeast(intervals[index][1])
            } else{
                val subArray = IntArray(2)
                subArray[0] = intervals[index][0]
                subArray[1] = intervals[index][1]
                resultList.add(subArray)
            }
        }
        val result = Array(resultList.size){ intArrayOf()}
        resultList.forEachIndexed { i, ints ->
            result[i] = ints
        }
        return result
    }

    /**
     * 57. 插入区间
     *
     * 1 3  6 9     2 5
     *
     * 1 2  3 5  6 7  8 10  12 16    4 8
     *
     * 1 5    6 6
     *
     * 1 2  4 6     3 3
     */
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val resultList = arrayListOf<IntArray>()
        if (intervals.isEmpty()) return arrayOf(newInterval)
        var hasInsert = false
        for (i in intervals.indices){
            if (!hasInsert){
                if (newInterval[0] > intervals[i][1]){
                    resultList.add(intervals[i])
                }else{
                    if (newInterval[1] < intervals[i][0]){
                        resultList.add(newInterval)
                        resultList.add(intervals[i])
                    }else{
                        newInterval[0] = newInterval[0].coerceAtMost(intervals[i][0])
                        newInterval[1] = newInterval[1].coerceAtLeast(intervals[i][1])
                        resultList.add(newInterval)
                    }
                    hasInsert = true
                }
            }else{
                if (resultList.last()[1] < intervals[i][0]){
                    resultList.add(intervals[i])
                }else{
                    resultList.last()[1] = resultList.last()[1].coerceAtLeast(intervals[i][1])
                }
            }
        }
        if (!hasInsert){
            resultList.add(newInterval)
        }
        val result = Array(resultList.size){ intArrayOf()}
        resultList.forEachIndexed { index, ints ->
            result[index] = ints
        }
        return result
    }

    /**
     * 73. 矩阵置零
     */
    fun setZeroes(matrix: Array<IntArray>) {
        val rowMap = HashMap<Int,Int>()
        val columnMap = HashMap<Int,Int>()
        for (i in matrix.indices){
            for (j in matrix[i].indices){
                if (matrix[i][j] == 0){
                    rowMap[j] = i
                    columnMap[i] = j
                }
            }
        }
        //列置零
        for (k in rowMap.keys){
            for (m in matrix.indices){
                for (n in matrix[m].indices){
                    if (n == k){
                        matrix[m][n] = 0
                    }
                }
            }
        }
        //行置零
        for (j in columnMap.keys){
            for (m in matrix.indices){
                if (m == j){
                    for (n in matrix[m].indices){
                        matrix[m][n] = 0
                    }
                }
            }
        }
    }

    /**
     * 74. 搜索二维矩阵
     */
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (i in matrix.indices){
            if (matrix[i].last() >= target){
                for (j in matrix[i].indices){
                    if (matrix[i][j] == target) return true
                }
                return false
            }
        }
        return false
    }

    /**
     * 240. 搜索二维矩阵 II
     */
    fun searchMatrix2(matrix: Array<IntArray>, target: Int): Boolean {
        var recordRowStart = false
        var recordColumnStart = false
        var rowStartIndex = 0
        var rowEndIndex = 0
        var columnStartIndex = 0
        var columnEndIndex = 0
        for (i in matrix.indices){
            if (matrix[i][0] < target && matrix[i].last() > target){
                if (!recordRowStart){
                    rowStartIndex = i
                    recordRowStart = true
                }
                rowEndIndex = i
            }else if(matrix[i][0] == target || matrix[i].last() == target){
                return true
            }
        }
        for (j in matrix[0].indices){
            if (matrix[0][j] < target && matrix.last()[j] > target){
                if (!recordColumnStart){
                    columnStartIndex = j
                    recordColumnStart = true
                }
                columnEndIndex = j
            }else if (matrix[0][j] == target || matrix.last()[j] == target){
                return true
            }
        }
        for (m in rowStartIndex .. rowEndIndex){
            for (n in columnStartIndex .. columnEndIndex){
                if (matrix[m][n] == target) return true
            }
        }
        return false
    }

    /**
     * 面试题 01.01. 判定字符是否唯一
     */
    fun isUnique(astr: String): Boolean {
        val set = HashSet<Char>()
        astr.forEach {
            if (!set.add(it)) return false
        }
        return true
    }

    /**
     * 面试题 01.02. 判定是否互为字符重排
     */
    fun CheckPermutation(s1: String, s2: String): Boolean {
        if (s1.length != s2.length) return false
        if (s1.isEmpty() and s2.isEmpty()) return true
        val map = HashMap<String,Int>()
        s1.forEach {
            map["$it"] = (map["$it"]?:0).plus(1)
        }
        s2.forEach {
            if (map["$it"] == null) return false
            map["$it"] = map["$it"]!!.minus(1)
        }
        map.values.forEach {
            if (it != 0) return false
        }
        return true
    }

    /**
     * 605. 种花问题
     *
     * 1,0,0,0,1,0,0   0 0 0 0 1
     */
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val list = arrayListOf<Int>()
        flowerbed.forEach {
            list.add(it)
        }
        list.add(0, 0)
        list.add(0)
        var flowers = 0
        for (i in 1 until list.size - 1) {
            if (list[i] == 0 && list[i - 1] == 0 && list[i + 1] == 0) {
                list[i] = 1
                flowers += 1
            }
        }
        return flowers >= n
    }

    /**
     * 452. 用最少数量的箭引爆气球
     *
     * [10,16],[2,8],[1,6],[7,12]
     *
     * [1,6],[2,8],[7,12],[10,16]
     *
     * [[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]
     */
    fun findMinArrowShots(points: Array<IntArray>): Int {
        Arrays.sort(points) { o1, o2 ->
            if (o1?.get(0)!! < 0 || o2?.get(0)!! < 0) {
                Math.abs(o1[0] - o2?.get(0)!!)
            } else {
                o1[0] - o2[0]
            }
        }
        points.forEach {
            it.forEach { num ->
                print("$num ")
            }
            println()
        }
        val sortArray = arrayListOf<IntArray>()
        sortArray.add(points[0])
        for (i in 1 until points.size){
            if (points[i][0] > sortArray.last()[1]){
                sortArray.add(points[i])
            }else{
                sortArray.last()[0] = sortArray.last()[0].coerceAtLeast(points[i][0])
                sortArray.last()[1] = sortArray.last()[1].coerceAtMost(points[i][1])
            }
        }
        return sortArray.size
    }

//    /**
//     * 77. 组合
//     */
//    fun combine(n: Int, k: Int): List<List<Int>> {
//        for (i in 1..n){
//
//        }
//    }

    /**
     * 566. 重塑矩阵
     */
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r*c) return mat
        val result = Array(r){IntArray(c)}
        val queue = LinkedList<Int>()
        for (i in mat.indices){
            for (j in mat[i].indices){
                queue.push(mat[i][j])
            }
        }
        for (m in 0 until r){
            for (n in 0 until c){
                result[m][n] = queue.pollLast()
            }
        }
        return result
    }

    /**
     * 383. 赎金信
     */
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = HashMap<Char,Int>()
        ransomNote.forEach { c ->
            map[c] = map.getOrDefault(c,0)+1
        }
        magazine.forEach {
            map[it] = map.getOrDefault(it,0)-1
        }
        for (v in map.values){
            if (v > 0 ) return false
        }
        return true
    }

    /**
     * 203. 移除链表元素
     *
     * 1 2 6 3 4 5 6
     */
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var p = ListNode(0)
        p.next = head
        var tm: ListNode? = p
        while (tm?.next != null){
            if (tm.next!!.n == `val`){
                tm.next = tm.next!!.next
            }
            tm = tm.next
        }
        return p.next
    }

    /**
     * 83. 删除排序链表中的重复元素
     * 1->2->3->3->4->4->5
     *
     * 1->1->2->3->4->4->4->5
     *
     * 1->2->3->3->4->4->5->5
     */
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var slow: ListNode? = ListNode(0)
        slow?.next = head
        val tmSlow = slow
        var fast = head
        while (fast != null){
            if (fast.n == fast.next?.n){
                while (fast?.n == fast?.next?.n){
                    fast = fast?.next
                }
            }else{
                slow?.next = fast
                slow = slow?.next
            }
            fast = fast?.next
        }
        slow?.next = null
        return tmSlow?.next
    }

    /**
     * 144. 二叉树的前序遍历
     */
    fun preorderTraversal(root: TreeNode?): List<Int> {
//        return if (root != null){
//            val subList = arrayListOf<Int>()
//            subList.add(root.`val`)
//            val subLeftList = preorderTraversal(root.left)
//            subList.addAll(subLeftList)
//            val subRightList = preorderTraversal(root.right)
//            subList.addAll(subRightList)
//            subList
//        }else{
//            emptyList()
//        }
        val result = arrayListOf<Int>()
        pre(root,result)
        return result
    }

    private fun pre(root: TreeNode?,list: ArrayList<Int>){
        if (root == null) return
        list.add(root.`val`)
        pre(root.left,list)
        pre(root.right,list)
    }

    /**
     * 226. 翻转二叉树
     */
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val tm = root.left
        root.left = root.right
        root.right = tm
        invertTree(root.left)
        invertTree(root.right)
        return root
    }

    /**
     * 112. 路径总和
     */
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null){
            return root.`val` == targetSum
        }
        return hasPathSum(root.left,targetSum - root.`val`) || hasPathSum(root.right,targetSum - root.`val`)
    }

    /**
     * 700. 二叉搜索树中的搜索
     */
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == `val`) return root
        return if (root.`val` > `val`) searchBST(root.left,`val`) else searchBST(root.right,`val`)
    }

    /**
     * 701. 二叉搜索树中的插入操作
     */
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return TreeNode(`val`)
        if (`val` > root.`val`){
            root.right = insertIntoBST(root.right,`val`)
        }else{
            root.left = insertIntoBST(root.left,`val`)
        }
        return root
    }

    /**
     * 169. 多数元素
     */
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        var maxCount = 0
        var maxNum = 0
        for (num in nums){
            map[num] = map.getOrDefault(num,0)+1
            if (map[num]!! > maxCount){
                maxCount = map[num]!!
                maxNum = num
            }
        }
        return maxNum
    }

    /**
     * 290. 单词规律
     */
    fun wordPattern(pattern: String, s: String): Boolean {
        val sb = StringBuilder()
        var index = 0
        val map = HashMap<Char,String>()
        val newS = StringBuilder(s).append(' ')
        val set = HashSet<String>()
        val patternLength = pattern.length
        for (i in newS.indices){
            if (index >= patternLength) return false
            if (newS[i] == ' '){
                if (map[pattern[index]].isNullOrEmpty()){
                    if (!set.add(sb.toString())) return false
                    map[pattern[index]] = sb.toString()
                }else{
                    if (map[pattern[index]] == sb.toString()){
                        index++
                        sb.clear()
                        continue
                    }else{
                        return false
                    }
                }
                index++
                sb.clear()
                continue
            }
            sb.append(s[i])
        }
        return index == patternLength
    }

    /**
     * 49. 字母异位词分组
     *
     * "eat", "tea", "tan", "ate", "nat", "bat"
     */
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = arrayListOf<ArrayList<String>>()
        val map = HashMap<Char,Int>()
        b@ for (i in strs.indices){
            if (result.isEmpty()){
                addNewElement(strs[i], result)
                continue@b
            }
            a@ for (m in result.indices){
                map.clear()
                if (strs[i].length != result[m][0].length) continue@a
                for (n in result[m][0].indices){
                    map[result[m][0][n]] = map.getOrDefault(result[m][0][n],0)+1
                    map[strs[i][n]] = map.getOrDefault(strs[i][n],0)-1
                }
                for (j in map.values){
                    if (j != 0) continue@a
                }
                result[m].add(strs[i])
                continue@b
            }
            addNewElement(strs[i],result)
        }
        return result
    }

    private fun addNewElement(str: String, result: ArrayList<ArrayList<String>>) {
        val subList = arrayListOf<String>()
        subList.add(str)
        result.add(subList)
    }

    /**
     * 49. 字母异位词分组
     * 排序
     */
    fun groupAnagrams2(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, ArrayList<String>>()
        for (s in strs) {
            val ch = s.toCharArray()
            Arrays.sort(ch)
            val key = String(ch)
            if (!map.containsKey(key)) map[key] = arrayListOf()
            map[key]!!.add(s)
        }
        return ArrayList(map.values)
    }

    /**
     * 43. 字符串相乘
     * 123  456  188  32  6994 36  408 5
     */
    fun multiply(num1: String, num2: String): String {
        println("sss:${18/10}")
        println("ccc:${18%10}")
        var result = "0"
        for (i in num1.length-1 downTo 0){
            if (num1[i] == '0') continue
            for (j in num2.length-1 downTo 0){
                if (num2[j] == '0') continue
                val sb = StringBuilder(((num1[i].toString().toInt()) *(num2[j].toString().toInt())).toString())
                val count = (num1.length-i)+(num2.length-j)-2
                for (k in 0 until count){
                    sb.append(0)
                }
                result = addStrings(result,sb.toString())
            }
        }
        return result
    }

    fun multiply2(num1: String,num2: String): String{
        val sumArr = IntArray(num1.length+num2.length)
        for (i in num1.length-1 downTo 0){
            for (j in num2.length-1 downTo 0){
                val subNum = (num1[i]-'0')*(num2[j]-'0') + sumArr[i+j+1]
                sumArr[i+j] += subNum/10
                sumArr[i+j+1] = subNum%10
            }
        }
        val sb = StringBuilder()
        var i = 0
        while (i < sumArr.size-1 && sumArr[i] == 0)
            i++
        for (j in i until sumArr.size){
            sb.append(sumArr[j])
        }
        return sb.toString()
    }


    /**
     * 415. 字符串相加
     */
    fun addStrings(num1: String, num2: String): String {
        val res = StringBuilder()
        var isNeedCarry = false
        var p1 = num1.length - 1
        var p2 = num2.length - 1
        while (p1 >= 0 || p2 >= 0) {
            val n1 = if (p1 < 0) 0 else num1[p1].toString().toInt()
            val n2 = if (p2 < 0) 0 else num2[p2].toString().toInt()
            var tmpRes = n1 + n2
            if (isNeedCarry) {
                tmpRes += 1
            }
            val subRes = tmpRes.toString()
            if (subRes.length == 2) {
                isNeedCarry = true
                res.insert(0, subRes.substring(1, 2))
            } else {
                isNeedCarry = false
                res.insert(0, subRes)
            }
            p1--
            p2--
        }
        if (isNeedCarry && p1 < 0 && p2 < 0){
            res.insert(0,"1")
        }
        return res.toString()
    }

    /**
     * 724. 寻找数组的中心索引  1,-1,3,-3,5,-5,2
     */
    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = nums.sum()-nums[0]
        if (leftSum == rightSum) return 0
        for (i in nums.indices){
            if (i == 0) continue
            leftSum += nums[i-1]
            rightSum -= nums[i]
            if (leftSum == rightSum){
                return i
            }
        }
        return -1
    }

    /**
     * 498. 对角线遍历
     *  [ 1, 2, 3, 1]
     *  [ 4, 5, 6, 1]
     *  [ 7, 8, 9, 1]
     *  [ 1, 1, 1, 1]
     */
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val endPoint = mat.size+mat[0].size-2
        val result = arrayListOf<Int>()
        var r = 0
        var c = 0
        for (i in 0..endPoint){
            if (i%2 == 0){
                for (j in i-r .. c){
                    result.add(mat[i-j][j])
                }
            }else{
                for (j in i-c .. r){
                    result.add(mat[j][i-j])
                }
            }
            r = if (i<mat.size-1) r+1 else mat.size-1
            c = if (i<mat[0].size-1) c+1 else mat[0].size-1
        }
        return result.toIntArray()
    }

    /**
     * 最长回文子串
     */
    fun longestPalindrome(s: String): String {
        val set = HashSet<Char>()
        var l = 0
        var r = 0
        val sb = StringBuilder()
        var longestPalindrome = ""
        val dp = Array(s.length){BooleanArray(s.length)}

        return longestPalindrome
    }

    /**
     * 翻转字符串里的单词
     */
    fun reverseWords(s: String): String {
        val newString = StringBuilder(s).append(" ").toString()
        val result = StringBuilder()
        val sb = StringBuilder()
        newString.forEach { c ->
            if (c == ' '){
                if (sb.isEmpty()){
                    return@forEach
                }else{
                    result.insert(0,sb.toString())
                    result.insert(0," ")
                    sb.clear()
                }
            }else{
                sb.append(c)
            }
        }
        result.delete(0,1)
        return result.toString()
    }

    /**
     * 数组拆分 I
     */
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var maxSum = 0
        nums.forEachIndexed { index, i ->
            if (index%2 == 0){
                maxSum += i
            }
        }
        return maxSum
    }

    /**
     * 最大连续1的个数
     */
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var start = 0
        var count = 0
        var isStarted = false
        nums.forEachIndexed { index, i ->
            if (i == 0){
                if (isStarted){
                    count = count.coerceAtLeast(index - start)
                    isStarted = false
                }
            }else{
                if (!isStarted){
                    start = index
                    isStarted = true
                }
            }
        }
        if (isStarted){
            count = count.coerceAtLeast(nums.size-start)
        }
        return count
    }

    /**
     * 翻转字符串里的单词 II
     */
    fun reverseWords2(s: String): String {
        val resourceSb = StringBuilder(s).append(" ")
        val resultSb = StringBuilder()
        val tmp = StringBuilder()
        resourceSb.forEach { c->
            if (c == ' '){
                resultSb.append(tmp.toString()).append(" ")
                tmp.clear()
            }else{
                tmp.insert(0,c)
            }
        }
        resultSb.delete(resultSb.length-1,resultSb.length)
        return resultSb.toString()
    }

    /**
     * 寻找旋转排序数组中的最小值
     */
    fun findMin(nums: IntArray): Int {
        if (nums.last() > nums.first()) return nums.first()
        if (nums.size < 2) return nums.first()
        var left = 1
        var right = nums.size-2
        while (left <= right){
            if (nums[left] < nums[left-1]) return nums[left]
            if (nums[right] > nums[right+1]) return nums[right+1]
            left++
            right--
        }
        return nums[left]
    }

    /**
     * 64. 最小路径和
     */
    fun minPathSum(grid: Array<IntArray>): Int {
        val dp = Array(grid.size){IntArray(grid[0].size)}
        dp[0][0] = grid[0][0]
        for (i in 1 until grid.size){
            dp[i][0] = dp[i-1][0]+grid[i][0]
        }
        for (j in 1 until grid[0].size){
            dp[0][j] = dp[0][j-1]+grid[0][j]
        }
        for (m in 1 until grid.size){
            for (n in 1 until grid[m].size){
                dp[m][n] = dp[m-1][n].coerceAtMost(dp[m][n-1])+grid[m][n]
            }
        }
        return dp[grid.size-1][grid[0].size-1]
    }

    /**
     * 46. 全排列
     * 1 2 3
     */
    fun permute(nums: IntArray): List<List<Int>> {
        val result = arrayListOf<ArrayList<Int>>()
        process(nums,0,result)
        return result
    }

    private fun process(nums: IntArray,i: Int,result: ArrayList<ArrayList<Int>>){
        if (i == nums.size-1){
            val subList = arrayListOf<Int>()
            nums.forEach {
                subList.add(it)
            }
            result.add(subList)
            return
        }
        for (j in i until nums.size){
            swap(nums, j, i)
            process(nums,i+1,result)
            //回溯 回到过去之前要先将数据还原
            swap(nums, j, i)
        }

    }

    /**
     * 3. 无重复字符的最长子串
     * abcabcbb
     */
    fun lengthOfLongestSubstring(s: String): Int {
        val mapCount = HashMap<Char,Int>()
        val mapPosition = HashMap<Char,Int>()
        var maxLength = 0
        for (i in s.indices){
            if (mapCount.getOrDefault(s[i],0) == 1){
                maxLength = maxLength.coerceAtLeast(mapCount.size)
                if (s[i] == s[i-1]){
                    mapCount.clear()
                    mapPosition.clear()
                    mapCount[s[i]] = mapCount.getOrDefault(s[i],0)+1
                    mapPosition[s[i]] = i
                }else{
                    val ite = mapPosition.iterator()
                    val position = mapPosition.getOrDefault(s[i],0)
                    while (ite.hasNext()){
                        val mapEle = ite.next()
                        if (mapEle.value <= position){
                            mapCount.remove(mapEle.key)
                            ite.remove()
                        }
                    }
                    mapCount[s[i]] = mapCount.getOrDefault(s[i],0)+1
                    mapPosition[s[i]] = i
                }
            }else{
                mapPosition[s[i]] = i
                mapCount[s[i]] = mapCount.getOrDefault(s[i],0)+1
            }
        }
        maxLength = maxLength.coerceAtLeast(mapCount.size)
        return maxLength
    }

    /**
     * 3. 无重复字符的最长子串
     * 滑动窗口解法
     * abcabcbb
     */
    fun lengthOfLongestSubstring2(s: String): Int{
        var start = 0
        var end = 0
        var maxLength = 0
        var map = HashMap<Char,Int>()
        while(end < s.length){
            //出现重复字符时更新start位置到第一次出现的下一位
            if (map.containsKey(s[end])){
                start = start.coerceAtLeast(map.getOrDefault(s[end],0)+1)
            }
            map[s[end]] = end
            end++
            maxLength = maxLength.coerceAtLeast(end-start)
        }
        return maxLength
    }

    /**
     * 2. 两数相加
     * 9>9>9>9>9>9>9   9>9>9>9
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var n1 = l1
        var n2 = l2
        var result = ListNode(0)
        var tmNode: ListNode? = result
        var isCarry = false
        while (n1 != null || n2 != null){
            if (n1 == null && n2 != null){
                val sum = if (isCarry) (n2.n?:0)+1 else n2.n?:0
                isCarry = sum >= 10
                val subNode = if (isCarry) ListNode(sum%10) else ListNode(sum)
                tmNode?.next = subNode
                tmNode = tmNode?.next
                if (isCarry){
                    n2 = n2.next
                    continue
                }else{
                    tmNode?.next = n2.next
                    break
                }
            }
            if (n1 != null && n2 == null){
                val sum = if (isCarry) (n1.n?:0)+1 else n1.n?:0
                isCarry = sum >= 10
                val subNode = if (isCarry) ListNode(sum%10) else ListNode(sum)
                tmNode?.next = subNode
                tmNode = tmNode?.next
                if (isCarry){
                    n1 = n1.next
                    continue
                }else{
                    tmNode?.next = n1.next
                    break
                }
            }
            val sum = if (isCarry) ((n1!!.n?:0).plus(n2!!.n?:0))+1 else (n1!!.n?:0).plus(n2!!.n?:0)
            isCarry = sum >= 10
            val subNode = if (isCarry) ListNode(sum%10) else ListNode(sum)
            tmNode?.next = subNode
            tmNode = tmNode?.next
            n1 = n1.next
            n2 = n2.next
        }
        if (isCarry){
            val subNode = ListNode(1)
            tmNode?.next = subNode
        }
        return result.next
    }

    /**
     * 6. Z 字形变换
     */
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val extraColumn = (numRows-2).coerceAtLeast(0)
        val group = s.length/(numRows+extraColumn)
        val column = if (group == 0){
            (s.length-numRows).coerceAtLeast(0)+1
        }else{
            val rn = s.length%(numRows+extraColumn)
            if (rn == 0) group*(1+extraColumn) else group*(1+extraColumn)+1+(rn-numRows).coerceAtLeast(0)
        }
        val matrix = Array(numRows){CharArray(column)}
        var r = 0
        var c = 0
        val sb = StringBuilder()
        for (i in s.indices){
            matrix[r][c] = s[i]
            if (c%(extraColumn+1) == 0){
                if (r < numRows-1){
                    r++
                }else{
                    r--
                    c++
                }
            }else{
                r--
                c++
            }
        }
        for (m in matrix.indices){
            for (n in matrix[m].indices){
                if (matrix[m][n].toInt() != 0){
                    sb.append(matrix[m][n])
                }
            }
        }
        return sb.toString()
    }

    /**
     * 12. 整数转罗马数字
     */
    fun intToRoman(num: Int): String {
        val sb = StringBuilder()
        val numString = StringBuilder(num.toString())
        when(numString.length){
            1 -> numString.insert(0,"000")
            2 -> numString.insert(0,"00")
            3 -> numString.insert(0,"0")
        }
        for (i in numString.indices){
            when(i){
                //千位
                0 ->{
                    when(numString[i]){
                        '1' -> sb.append("M")
                        '2' -> sb.append("MM")
                        '3' -> sb.append("MMM")
                    }
                }
                //百位
                1 ->charToRoman(numString[i],sb,"C","D","M")
                //十位
                2 ->charToRoman(numString[i],sb,"X","L","C")
                //个位
                3 ->charToRoman(numString[i],sb,"I","V","X")
            }
        }
        return sb.toString()
    }

    private fun charToRoman(c: Char, sb: StringBuilder, b: String, t: String, h: String) {
        when (c) {
            '1' -> sb.append(b)
            '2' -> sb.append("$b$b")
            '3' -> sb.append("$b$b$b")
            '4' -> sb.append("$b$t")
            '5' -> sb.append(t)
            '6' -> sb.append("$t$b")
            '7' -> sb.append("$t$b$b")
            '8' -> sb.append("$t$b$b$b")
            '9' -> sb.append("$b$h")
        }
    }

    /**
     * 17. 电话号码的字母组合
     */
    fun letterCombinations(digits: String): List<String> {
        if(digits.isEmpty()) return emptyList()
        val map = HashMap<Char,String>()
        map['2'] = "abc"
        map['3'] = "def"
        map['4'] = "ghi"
        map['5'] = "jkl"
        map['6'] = "mno"
        map['7'] = "pqrs"
        map['8'] = "tuv"
        map['9'] = "wxyz"
        val result = arrayListOf<String>()
        val currentCombination = StringBuilder()
        backTrace(map,digits,0,result, currentCombination)
        return result
    }

    private fun backTrace(map: HashMap<Char,String>,digits: String,index: Int,result: ArrayList<String>,currentCombination: StringBuilder){
        //临界条件
        if (currentCombination.length == digits.length){
            val subStr = currentCombination.toString()
            result.add(subStr)
        }else {
            for (i in map[digits[index]]!!.indices){
                currentCombination.append(map.getOrDefault(digits[index],"")[i])
                backTrace(map, digits, index+1, result, currentCombination)
                //回溯算法的精髓  在得到一种结果  返回上一层时 数据还原
                currentCombination.deleteCharAt(index)
            }
        }
    }

    /**
     * 37. 解数独
     * 5 3 4 6 7 8 9 9 8        5 3 1 2 7 6 4 9 8
    6 7 7 1 9 5 7 3 2        6 2 4 1 9 5 7 . .
    2 9 8 3 . . . 6 .        . 9 8 . . . . 6 .
    8 . . . 6 . . . 3        8 . . . 6 . . . 3
    4 . . 8 . 3 . . 1        4 . . 8 . 3 . . 1
    7 . . . 2 . . . 6        7 . . . 2 . . . 6
    . 6 . . . . 2 8 .        . 6 . . . . 2 8 .
    . . . 4 1 9 . . 5        . . . 4 1 9 . . 5
    . . . . 8 . . 7 9        . . . . 8 . . 7 9
     */
    fun solveSudoku(board: Array<CharArray>): Array<CharArray>{
        backTraceSudo(board,0,0)
        return board
    }

    private fun backTraceSudo(board: Array<CharArray>, row: Int, column: Int): Boolean{
        if (row == 9) return true
        return if (board[row][column] == '.'){
            val restNums = arrayListOf<Char>()
            for (i in 0 until 9){
                restNums.add((i+49).toChar())
            }
            for (i in 0 until 9){
                if (board[row][i] != '.'){
                    restNums.remove(board[row][i])
                }
                if (board[i][column] != '.'){
                    restNums.remove(board[i][column])
                }
            }
            if (restNums.isEmpty()) return false
            val rowStart = (row/3)*3
            val colStart = (column/3)*3
            for (i in rowStart until rowStart+3){
                for (j in colStart until colStart+3){
                    if (board[i][j] != '.') {
                        restNums.remove(board[i][j])
                    }
                }
            }
            if (restNums.isEmpty()) return false
            for (i in restNums){
                board[row][column] = i
                if (column < 8){
                    if (backTraceSudo(board, row, column+1)){
                        return true
                    }
                    board[row][column] = '.'
                }else{
                    if (backTraceSudo(board,row+1, 0)) {
                        return true
                    }
                    board[row][column] = '.'
                }
            }
            false
        }else{
            if (column < 8) backTraceSudo(board,row, column+1) else backTraceSudo(board,row+1,0)
        }
    }

    /**
     * 45. 跳跃游戏 II
     * 5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5
     */
    fun jump(nums: IntArray): Int {
        var step = 0
        var arrived = 0
        var nextArrived = 0
        for (i in nums.indices){
            //下一步能达到的最远距离
            nextArrived = nextArrived.coerceAtLeast(i+nums[i])
            //当下一步能达到最后一步或者超过最后一个位置时，直接返回。因为没到一个位置都是取得当前位置能到达的最远距离。
            if (nextArrived >= nums.size-1) return step+1
            //当前位置遍历到上一次达到的最远距离时更新下一次要到达的位置，步数增加
            if (arrived == i){
                step++
                arrived = nextArrived
            }
        }
        return step
    }

    /**
     * 47. 全排列 II
     * 1 2 3    2 2 1 1
     */
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val resultSet = HashSet<ArrayList<Int>>()
        nums.sort()
        backTracePermuteUnique(nums,resultSet,0)
        val result = arrayListOf<ArrayList<Int>>()
        resultSet.forEach {
            result.add(it)
        }
        return result
    }

    private fun backTracePermuteUnique(nums: IntArray,result: HashSet<ArrayList<Int>>,i: Int){
        if (i == nums.size){
            val subResult = arrayListOf<Int>()
            nums.forEach {
                subResult.add(it)
            }
            result.add(subResult)
        }else{
            for (m in i until nums.size){
                if (m != i && nums[m] == nums[i]) continue
                if (m != i){
                    swap(nums,m,i)
                }
                backTracePermuteUnique(nums,result,i+1)
                if (m != i){
                    swap(nums,m,i)
                }
            }
        }
    }

    /**
     * 78. 子集
     * 1 2 3 4
     */
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = arrayListOf<ArrayList<Int>>()
        val subList = arrayListOf<Int>()
        backTraceSubsets(nums,0,subList, result)
        return result
    }

    private fun backTraceSubsets(nums: IntArray,i: Int,subList: ArrayList<Int>,result: ArrayList<ArrayList<Int>>){
        result.add(ArrayList(subList))
        for (j in i until nums.size){
            subList.add(nums[j])
            backTraceSubsets(nums, j+1, subList, result)
            subList.removeAt(subList.size-1)
        }
    }

    /**
     * 55. 跳跃游戏
     * 2,3,1,0,4
     */
    fun canJump(nums: IntArray): Boolean {
        var maxPos = 0
        for (i in nums.indices){
            if (i > maxPos) return false
            maxPos = maxPos.coerceAtLeast(nums[i])
        }
        return true
    }

    /**
     * 79. 单词搜索
     *
     * bbbaabbbbbab
     * 'a','a','b','a','a','b'
     * 'a','a','b','b','b','a'
     * 'a','a','a','a','b','a'
     * 'b','a','b','b','a','b'
     * 'a','b','b','a','b','a'
     * 'b','a','a','a','a','b'
     */
    fun exist(board: Array<CharArray>, word: String): Boolean {
        for (i in board.indices){
            if (i != 4) continue
            for (j in board[i].indices){
                if (j != 1) continue
                if (backTraceExist(i,j, Array(board.size){ BooleanArray(board[0].size){false} }, 0,board,word)) return true
            }
        }
        return false
    }

    private fun backTraceExist(row: Int, column: Int, visiteds: Array<BooleanArray>, pos: Int, board: Array<CharArray>, word: String): Boolean{
        if (row < 0 || row > board.size-1 || column < 0 || column > board[row].size-1 || board[row][column] != word[pos]) return false
        if (visiteds[row][column]) return false
        if (pos == word.length-1) return true
        visiteds[row][column] = true
        if (backTraceExist(row-1, column, visiteds, pos+1, board, word) ||
                backTraceExist(row+1, column, visiteds, pos+1, board, word) ||
                backTraceExist(row,column-1,visiteds, pos+1, board, word) ||
                backTraceExist(row,column+1,visiteds, pos+1, board, word)) return true
        visiteds[row][column] = false
        return false
    }

    /**
     * 77. 组合
     */
    fun combine(n: Int, k: Int): List<List<Int>> {
        val result = arrayListOf<ArrayList<Int>>()
        backTraceCombine(n, k,1, arrayListOf(), result)
        return result
    }

    private fun backTraceCombine(n: Int,k: Int,curNum: Int,subList: ArrayList<Int>,result: ArrayList<ArrayList<Int>>){
        if (curNum > n && subList.size < k){
            return
        }
        if (subList.size == k){
            val tmList = ArrayList<Int>(subList)
            result.add(tmList)
            return
        }
        if (curNum <= n && subList.size < k){
            backTraceCombine(n, k, curNum+1, subList, result)
            subList.add(curNum)
            backTraceCombine(n, k, curNum+1, subList, result)
            subList.removeAt(subList.size-1)
        }
    }

    /**
     * 24. 两两交换链表中的节点
     * 1->2->3->4
     */
    fun swapPairs(head: ListNode?): ListNode? {
        return if (head?.next == null) head else swapPairsRec(0,head)
    }

    private fun swapPairsRec(index: Int,head: ListNode?): ListNode?{
        if (head == null) return null
        val node = head
        if (head.next == null) return head
        val nextHead = head.next?.next
        if (index%2 == 0){
            val nextNode = head.next
            nextNode?.next = node
            node.next = swapPairsRec(index+2, nextHead)
            return nextNode
        }else{
            return null
        }
    }

    /**
     * 61. 旋转链表
     */
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null || k == 0) return head
        var newHead = head
        var tmTail = head
        var countNode = head
        var nodeSize = 0
        while (countNode != null) {
            nodeSize += 1
            countNode = countNode.next
        }
        val newK = k % nodeSize
        if (newK == 0) return head
        for (i in 0 until nodeSize - newK) {
            newHead = newHead?.next
            if (i == nodeSize - newK - 1) {
                tmTail?.next = null
            }
            tmTail = tmTail?.next
        }
        var tmHead = newHead
        while (tmHead?.next != null) {
            tmHead = tmHead.next
        }
        tmHead?.next = head
        return newHead
    }

    /**
     * 86. 分隔链表
     *
     * 1->4->3->2->5->2
     */
    fun partition(head: ListNode?, x: Int): ListNode? {
        val small = ListNode(0)
        var st = small
        val noSmall = ListNode(0)
        var nst = noSmall
        var node = head
        var isSmall = false
        while (node != null){
            if (node.n?:0 < x){
                st.next = node
                st = st.next!!
                isSmall = true
            }else{
                nst.next = node
                nst = nst.next!!
                isSmall = false
            }
            node = node.next
        }
        if (isSmall){
            nst.next = null
        }else{
            st.next = null
        }
        st.next = noSmall.next
        return small.next
    }

    /**
     * 92. 反转链表 II
     */
//    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
//
//    }

    /**
     * 704. 二分查找
     */
    fun searchNum(nums: IntArray, target: Int): Int {
        return backTrackSearchNum(nums,0,nums.size-1,target)
    }

    private fun backTrackSearchNum(nums: IntArray,left: Int,right: Int,target: Int): Int{
        if (left == right) return if (nums[left] == target) left else -1
        if (left > right) return -1
        val mid = (left+right)/2
        return when {
            nums[mid] < target -> backTrackSearchNum(nums, mid+1, right, target)
            nums[mid] > target -> backTrackSearchNum(nums, left, mid-1, target)
            else -> mid
        }
    }

    /**
     * 704. 二分查找
     */
    fun searchNum2(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size-1
        while (left <= right){
            val mid = (left+right)/2
            when{
                nums[mid] < target -> left = mid+1
                nums[mid] > target -> right = mid-1
                else -> return mid
            }
        }
        return -1
    }

    fun firstBadVersion(n: Int) : Int {
        var left = 1
        var right = n
        while(left <= right){
            val mid = (left+right)/2
            if(isBadVersion(mid)){
                if(mid > 1){
                    if(!isBadVersion(mid-1)){
                        return mid
                    }else{
                        right = mid-1
                    }
                }else{
                    return mid
                }
            }else{
                if(mid < n){
                    if(isBadVersion(mid+1)){
                        return mid+1
                    }else{
                        left = mid+1
                    }
                }else{
                    return mid
                }
            }
        }
        return n
    }

    private fun isBadVersion(i: Int): Boolean{
        return true
    }

    /**
     * 977. 有序数组的平方
     */
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        when {
            nums[0] >= 0 -> {
                for (i in nums.indices){
                    result[i] = nums[i]*nums[i]
                }
            }
            nums.last() <= 0 -> {
                for (j in nums.size-1 downTo 0){
                    result[nums.size-1-j] = nums[j]*nums[j]
                }
            }
            else -> {
                var left = 0
                var right = nums.size-1
                var index = nums.size-1
                while (left<right){
                    val leftMul = nums[left]*nums[left]
                    val rightMul = nums[right]*nums[right]
                    when{
                        leftMul < rightMul -> {
                            result[index--] = rightMul
                            right--
                        }
                        leftMul > rightMul -> {
                            result[index--] = leftMul
                            left++
                        }
                        else -> {
                            result[index--] = leftMul
                            result[index--] = rightMul
                            left++
                            right--
                        }
                    }
                }
                if (left == right){
                    result[index] = nums[left]*nums[left]
                }
            }
        }
        return result
    }

    /**
     * 509. 斐波那契数
     */
    fun fib(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1
        return fib(n-1)+ fib(n-2)
    }

    fun fib2(n: Int): Int{
        if (n == 0 || n == 1) return n
        var current = 0
        var next = 1
        var tmp = 0
        for (i in 2..n){
            tmp = current+next
            current = next
            next = tmp
        }
        return tmp
    }

    /**
     * 1137. 第 N 个泰波那契数
     */
    fun tribonacci(n: Int): Int {
        if (n < 2) return n
        if (n == 2) return 1
        val nums = intArrayOf(0,1,1,2)
        for (i in 3..n){
            nums[3] = nums[0]+nums[1]+nums[2]
            nums[0] = nums[1]
            nums[1] = nums[2]
            nums[2] = nums[3]
        }
        return nums[3]
    }

    fun minCostClimbingStairs(cost: IntArray): Int {

    }
}