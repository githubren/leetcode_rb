import Main.backTraceUniquePathsWithObstacles
import com.sun.org.apache.xpath.internal.operations.Bool
import java.lang.StringBuilder
import java.util.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.LinkedBlockingQueue
import java.util.function.IntConsumer
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.concurrent.thread
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

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

//        moveZeroes3(intArrayOf(2,1,3)).forEach {
//            print("$it ")
//        }

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
//        println(maxSubArray2(intArrayOf(-2,-3,-1)))
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
        val tree2 = TreeNode(0)
        val tree3 = TreeNode(0)
        val tree4 = TreeNode(5)
        val tree5 = TreeNode(1)
        val tree6 = TreeNode(6)
        val tree7 = TreeNode(3)
        tree1.left = tree2
//        tree1.right = tree3
//        tree2.left = tree4
//        tree2.right = tree5
//        tree5.right = tree6
//        tree3.left = tree6
//        tree3.right = tree7
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

        val node1 = ListNode(-10)
        val node2 = ListNode(-3)
        val node3 = ListNode(0)
        val node4 = ListNode(5)
        val node5 = ListNode(9)
        val node6 = ListNode(2)
        val node7 = ListNode(5)
        val node8 = ListNode(5)
        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
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

//        print(minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))

//        print(rob2(intArrayOf(1,2,3,1,2,3,6,1,2,7,2)))

//        print(deleteAndEarn(intArrayOf(1,1,1,2,4,5,5,5,6)))

//        print(maxSubarraySumCircular(intArrayOf(5,-3,5)))

//        print(maxProduct(intArrayOf(-4,-3,-2)))

//        print(getMaxLen(intArrayOf(1)))

//        print(maxScoreSightseeingPair(intArrayOf(8,1,5,2,6)))

//        print(maxProfitInFreezing(intArrayOf(1,2,3,0,2)))

//        print(maxProfitInFee(intArrayOf(1, 3, 2, 8, 4, 9),2))

//        print(wordBreak("leetcode", listOf("leet","code")))

//        generateParenthesis(3).forEach {
//            print("$it\n")
//        }

//        print(divide(-100, -1))

//        generateMatrix(2).forEach {
//            it.forEach { n ->
//                print("$n ")
//            }
//            println()
//        }

//        print(uniquePathsWithObstacles2(arrayOf(intArrayOf(0,0,0,0,0,0,0),
//                                               intArrayOf(0,0,0,0,0,0,0),
//                                               intArrayOf(0,0,0,0,0,0,0))))

//        subsetsWithDup(intArrayOf(4,4,4,1,4)).forEach {
//            it.forEach { n ->
//                print("$n ")
//            }
//            println()
//        }

//        var result = buildTree(intArrayOf(9,30,15,20,7), intArrayOf(30,9,20,15,7))
//        var result = buildTreePostorder(intArrayOf(9,30,15,20,7), intArrayOf(30,9,20,15,7))

//        print(minimumTotal(arrayListOf(arrayListOf(-1),
//            arrayListOf(2,3),
//            arrayListOf(1,-1,-3))))

//        print(lengthOfLastWord2("luffy       "))


//        print(longestConsecutive(intArrayOf(100,4,200,1,3,2)))

//        print(uniquePaths2(3,2))

//        print(addBinary("1101001010110101010101010101000101010101010101010101010101010101010010","10101010010101010100101001010010101010010101011"))

//            solve(arrayOf(charArrayOf('X','X','X','X','X'),
//                          charArrayOf('X','O','O','X','X'),
//                          charArrayOf('X','X','O','X','X'),
//                          charArrayOf('X','O','O','O','X'),
//                          charArrayOf('X','X','X','X','X'),))
//        solve(arrayOf(charArrayOf('O')))

//        print(canCompleteCircuit(intArrayOf(2,3,4), intArrayOf(3,4,3)))

//        print(singleNumber2(intArrayOf(0,1,0,1,0,1,99)))

//        print(evalRPN(arrayOf("4","13","5","/","+")))

//        print(findPeakElement(intArrayOf(3,1,2)))

//        print(calculateMinimumHP(arrayOf(intArrayOf(-2,-3,3),
//                                         intArrayOf(-5,-10,1),
//                                         intArrayOf(10,30,-5))))

//        print(calculateMinimumHP(arrayOf(intArrayOf(1,-2,3),
//                                         intArrayOf(2,-2,-2),
//                                         intArrayOf(2,-3,-1))))

//        print(numIslands(arrayOf(charArrayOf('1','1','1','1','0'),
//            charArrayOf('1','1','0','1','0'),
//            charArrayOf('1','1','0','0','0'),
//            charArrayOf('0','0','0','0','0'))))

//        print(countPrimes(10))

//        combinationSum3(2,18).forEach {
//            it.forEach { n ->
//                print("$n ")
//            }
//            println()
//        }

//        print(containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3),2))
//        print(containsNearbyAlmostDuplicate(intArrayOf(Int.MAX_VALUE,-1,Int.MAX_VALUE),1,Int.MAX_VALUE))

//        summaryRanges(intArrayOf(0,1,2,4,5,6,7)).forEach {
//            print("$it ")
//        }

//        print(majorityElement2(intArrayOf(3,2,3)))
//        singleNumber3(intArrayOf(1,2,1,3,2,5)).forEach {
//            print("$it ")
//        }

//        print(missingNumber(intArrayOf(0)))

//        print(hIndex(intArrayOf(0,0,3)))

//        print(hIndex2(intArrayOf(1,1,1,1,3,3,4,4,5,6,7,7,8,9,10)))

//        println(findDuplicate(intArrayOf(1,4,4,2,4)))

//        gameOfLife(arrayOf(intArrayOf(0,1,0),
//                           intArrayOf(0,0,1),
//                           intArrayOf(1,1,1),
//                           intArrayOf(0,0,0)))

//        print(lengthOfLIS(intArrayOf(0,1,0,3,2,3)))

//        tmFun()

//        println(increasingTriplet(intArrayOf(20,20,10,5,4,3)))

//        println(mySqrt(2147395599))

//        println(myPow(2.0, Int.MIN_VALUE))

//        println(search2(intArrayOf(1,0,1,1,1),0))

//        restoreIpAddresses("25525511135").forEach {
//            print("$it ")
//        }

//            println(numTrees(3))

//        println(isInterleave("a","","a"))

//        recoverTree(TreeNode(0))

//        zigzagLevelOrder(tree1).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        levelOrderBottom(tree1).forEach {
//            it.forEach { num ->
//                print("$num ")
//            }
//            println()
//        }

//        var result = sortedListToBST2(node1)
//        while (result != null){
//            print(result.`val`)
//        }

//        minDepth(tree1)


//        print(numDistinct("babgbag","bag"))

        val n1 = Node(1)
        val n2 = Node(2)
        val n3 = Node(3)
        val n4 = Node(4)
        val n5 = Node(5)
        val n6 = Node(6)
        val n7 = Node(7)

        n1.left = n2
        n1.right = n3
        n2.left = n4
        n2.right = n5
//        n3.left = n6
        n3.right = n7
//        connect2(n1)

//        println(sumNumbers2(tree1))

//        sortArray(intArrayOf(-1,2,-8,-10)).forEach {
//            print("$it ")
//        }

//        randPoint()

//        println(isRectangleCover(arrayOf(intArrayOf(1,1,3,3), intArrayOf(3,1,4,2), intArrayOf(1,3,2,4), intArrayOf(2,2,4,4))))
//        println(isRectangleCover(arrayOf(intArrayOf(1,1,2,3), intArrayOf(1,3,2,4), intArrayOf(3,1,4,2), intArrayOf(3,2,4,4))))
//        println(isRectangleCover(arrayOf(intArrayOf(1,1,3,3), intArrayOf(3,1,4,2), intArrayOf(3,2,4,4), intArrayOf(1,3,2,4), intArrayOf(2,3,3,4))))
//        println(isRectangleCover(arrayOf(intArrayOf(0,0,1,1), intArrayOf(0,1,1,2), intArrayOf(0,2,1,3), intArrayOf(1,0,2,1),intArrayOf(1,0,2,1),
//            intArrayOf(1,2,2,3),
//            intArrayOf(2,0,3,1),
//            intArrayOf(2,1,3,2),
//            intArrayOf(2,2,3,3))))

//        println(maximumGap(intArrayOf(100,3,2,1)))

//        topKFrequent2(intArrayOf(1,1,1,2,2,3),2).forEach {
//            print("$it ")
//        }

//        topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"),1).forEach {
//            print("$it ")
//        }

//        testZeroEvenOdd()

//        testFizzBuzz()

//        testCombinationIterator()

        println(findKthLargest(intArrayOf(3,2,3,1,2,4,5,5,6),4))
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
            println("????????????")
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
     * 75.????????????
     * ?????????
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
     * ???????????????
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
     * ???????????????
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
                ???????????????i2++?????? ??????????????????if?????? ??????????????????????????????i2=nums.size-1
                ??????????????????????????????if?????????????????? ???????????????????????????????????????>=target??????
                ????????????????????????????????? ?????????++i2 ?????????i2????????????-1 ?????????????????????????????????
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
     * ???????????????
     * ??????????????????
     *
     * 1???????????????
     * 2???????????????????????????
     * 3????????????????????????????????????
     * 4???????????????
     *
     * ????????????dp?????????dp[i]?????????i+1?????????????????????????????????i???0?????????
     * ?????????dp[i]??????????????????dp[i-1]?????????????????????
     * ???dp[i-1]??????0??????dp[i] = dp[i-1]+nums[i];???dp[i-1]??????0???,??????dp[i-1]???????????????dp[i]????????????????????????dp[i-1]?????????i???????????????????????????????????????0???????????????????????????????????????
     * ?????????????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????0?????????????????????????????????????????????????????????????????????
     * ?????????????????????????????????dp[i] = nums[i]+max(dp[i-1],0)
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
     * 9???9???9???9
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
     * 4. ????????????????????????????????????
     * ????????????
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
     * 15. ????????????
     * [2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4]
     */
    fun threeSum(nums: IntArray): List<List<Int>> {
        //?????????
//        val nums = quickSort(nums,0,nums.size-1)
        nums.sort()
        nums.forEach {
            print("$it ")
        }
        val resultArray = arrayListOf<List<Int>>()
        for (i1 in 0 until nums.size - 2) {
            //???????????? ?????????????????????0??? ????????????????????????
            if (nums[i1] > 0) break
            //????????????????????????????????????????????? ?????????????????????
            if (i1 > 0 && nums[i1] == nums[i1 - 1]) continue
            val twoSum = 0 - nums[i1]
            //?????????  ??????????????????????????? ?????????sum>target??? ?????????1 ???sum<target??? ?????????1
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
     * ????????????
     */
    private fun quickSort(array: IntArray, l: Int, r: Int): IntArray {
        if (l < r) {
            var i = l
            //????????????????????????????????? ?????????????????????????????????????????????
            var j = r - 1
            //???
            val node = array[r]
            while (i <= j) {
                //???????????? ???????????????????????????
                while (i <= j && array[i] < node) i++
                //???????????? ???????????????????????????
                while (i <= j && array[j] >= node) j--
                //???????????????
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
     * 16. ????????????????????????
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
     * 18. ????????????
     * [-2,-1,-1,1,1,2,2]
     */
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if (nums.isEmpty()) return emptyList()
        //??????
        nums.sort()
        val resultArray = arrayListOf<List<Int>>()
        for (i in 0 until nums.size - 3) {
            //??????
            if (i > 0 && nums[i] == nums[i - 1]) continue
            //?????????????????? ???i???????????????????????????target ???????????????????????????
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[3] > target) break
            //???i???????????????????????????????????????target ?????????????????????
            if (nums[i] + nums[nums.size - 3] + nums[nums.size - 2] + nums[nums.size - 1] < target) continue
            for (j in i + 1 until nums.size - 2) {
                //??????
                if (j > i + 1 && nums[j] == nums[j - 1]) continue
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break
                if (nums[i] + nums[j] + nums[nums.size - 2] + nums[nums.size - 1] < target) continue
                var l = j + 1
                var r = nums.size - 1
                while (l < r) {
                    //??????????????????
                    if (l > j + 1 && nums[l] == nums[l - 1]) {
                        l++
                        continue
                    }
                    //??????????????????
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
     * 31. ???????????????
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
     * 33. ????????????????????????
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
     * 81. ???????????????????????? II
     * 2,5,6,0,0,1,2  3     1 0 1 1 1    0
     * 5 6 7 7 1 2 2  1
     */
    fun search2(nums: IntArray, target: Int): Boolean {
        when{
            nums[0] < nums[nums.size-1] -> return binarySearch(nums, target)
            nums[0] >= nums[nums.size-1] ->{
                var left = 0
                var right = nums.size-1
                while (left <= right){
                    val mid = (left+right)/2
                    when{
                        nums[mid] > target ->{
                            when {
                                nums[mid] > nums[left] -> { //??????????????????
                                    when {
                                        nums[left] > target -> left = mid+1
                                        nums[left] < target -> right = mid-1
                                        else -> return true
                                    }
                                }
                                nums[mid] < nums[left] -> right = mid-1
                                else -> {
                                    for (i in left .. right){
                                        if (nums[i] == target){
                                            return true
                                        }
                                    }
                                    return false
                                }
                            }
                        }
                        nums[mid] < target ->{
                            if (nums[mid] > nums[left]){
                                left = mid+1
                            }else if (nums[mid] == nums[left]){
                                for (i in left .. right){
                                    if (nums[i] == target){
                                        return true
                                    }
                                }
                                return false
                            } else{
                                when {
                                    nums[right] > target -> left = mid+1
                                    nums[right] < target -> right = mid-1
                                    else -> return true
                                }
                            }
                        }
                        else -> return true
                    }
                }
            }
        }
        return false
    }

    private fun binarySearch(nums: IntArray,target: Int): Boolean{
        var left = 0
        var right = nums.size-1
        while (left <= right){
            val mid = (left+right)/2
            when{
                nums[mid] > target -> right = mid-1
                nums[mid] < target -> left = mid+1
                else -> return true
            }
        }
        return false
    }

    /**
     * 34. ???????????????????????????????????????????????????????????????
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
     * 39. ????????????
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
            //????????????????????????????????????subArray??????????????????subArray??????????????????????????????
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
     * 189. ????????????
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
     * 217. ??????????????????
     * ??????
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
     * 217. ??????????????????
     * ?????????
     */
    fun containsDuplicate2(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        nums.forEach {
            if (!set.add(it)) return true
        }
        return false
    }

    /**
     * ????????????????????????
     *
     * ???????????????
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
     * ????????????????????????
     *
     * ???????????????
     */
    fun singleNumber1(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }

    /**
     * ????????????????????? II  nums1 = [1,2,2,1], nums2 = [2,2]
     * 4,5,9   4,4,8,9,9
     * ??????+???????????????
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
     * ????????????????????? II
     * ???????????????
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
     * ???????????????
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
     * ????????????
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
     * ???????????????
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
     * ????????????????????????????????????
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
     * ????????????????????????
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
     * ????????????????????? (atoi)  0 91283472332
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
     * ?????? strStr()
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
     * ????????????
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
     * ????????????????????????
     */
    fun deleteNode(node: ListNode) {
        node.n = node.next?.n
        node.next = node.next?.next
    }

    /**
     * ????????????????????????N?????????
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
     * ????????????
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
     * ????????????????????????
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
     * ????????????
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
     * ????????????
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
     * ????????????
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
     * ????????????????????????
     */
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return leftDepth.coerceAtLeast(rightDepth) + 1
    }

    /**
     * ?????????????????????
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
     * ???????????????
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
     * ????????????????????????
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
     * ???????????????????????????????????????
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
     * ?????????
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
     * ???????????????????????????
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
     * ???????????????????????????
     * ???????????????
     * dp[i]?????????i??????????????????
     * base  case: dp[0] = prices[0]
     * ?????????????????????dp[i] = min{dp[i-1],prices[i]}
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

    fun maxProfit3(prices: IntArray): Int{
        var minValue = prices[0]
        var max = 0
        for (i in 1 until prices.size){
            minValue = minValue.coerceAtMost(prices[i])
            max = max.coerceAtLeast(prices[i]-minValue)
        }
        return max
    }

    /**
     * ????????????
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
     * 40. ???????????? II
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
     * 41. ????????????????????????
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
     * 42. ?????????
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
     * 118. ????????????
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
     * 119. ???????????? II
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
     * 54. ????????????
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
     * 56. ????????????
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
     * 57. ????????????
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
     * 73. ????????????
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
        //?????????
        for (k in rowMap.keys){
            for (m in matrix.indices){
                for (n in matrix[m].indices){
                    if (n == k){
                        matrix[m][n] = 0
                    }
                }
            }
        }
        //?????????
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
     * 74. ??????????????????
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
     * 240. ?????????????????? II
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
     * ????????? 01.01. ????????????????????????
     */
    fun isUnique(astr: String): Boolean {
        val set = HashSet<Char>()
        astr.forEach {
            if (!set.add(it)) return false
        }
        return true
    }

    /**
     * ????????? 01.02. ??????????????????????????????
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
     * 605. ????????????
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
     * 452. ?????????????????????????????????
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
//     * 77. ??????
//     */
//    fun combine(n: Int, k: Int): List<List<Int>> {
//        for (i in 1..n){
//
//        }
//    }

    /**
     * 566. ????????????
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
     * 383. ?????????
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
     * 203. ??????????????????
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
     * 83. ????????????????????????????????????
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
     * 144. ????????????????????????
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
     * 226. ???????????????
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
     * 112. ????????????
     */
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null){
            return root.`val` == targetSum
        }
        return hasPathSum(root.left,targetSum - root.`val`) || hasPathSum(root.right,targetSum - root.`val`)
    }

    /**
     * 700. ???????????????????????????
     */
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == `val`) return root
        return if (root.`val` > `val`) searchBST(root.left,`val`) else searchBST(root.right,`val`)
    }

    /**
     * 701. ?????????????????????????????????
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
     * 169. ????????????
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
     * 290. ????????????
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
     * 49. ?????????????????????
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
     * 49. ?????????????????????
     * ??????
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
     * 43. ???????????????
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
     * 415. ???????????????
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
     * 724. ???????????????????????????  1,-1,3,-3,5,-5,2
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
     * 498. ???????????????
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
     * ??????????????????
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
     * ???????????????????????????
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
     * ???????????? I
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
     * ????????????1?????????
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
     * ??????????????????????????? II
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
     * ???????????????????????????????????????
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
     * 64. ???????????????
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
     * 46. ?????????
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
            //?????? ???????????????????????????????????????
            swap(nums, j, i)
        }

    }

    /**
     * 3. ??????????????????????????????
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
     * 3. ??????????????????????????????
     * ??????????????????
     * abcabcbb
     */
    fun lengthOfLongestSubstring2(s: String): Int{
        var start = 0
        var end = 0
        var maxLength = 0
        var map = HashMap<Char,Int>()
        while(end < s.length){
            //???????????????????????????start????????????????????????????????????
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
     * 2. ????????????
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
     * 6. Z ????????????
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
     * 12. ?????????????????????
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
                //??????
                0 ->{
                    when(numString[i]){
                        '1' -> sb.append("M")
                        '2' -> sb.append("MM")
                        '3' -> sb.append("MMM")
                    }
                }
                //??????
                1 ->charToRoman(numString[i],sb,"C","D","M")
                //??????
                2 ->charToRoman(numString[i],sb,"X","L","C")
                //??????
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
     * 17. ???????????????????????????
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
        //????????????
        if (currentCombination.length == digits.length){
            val subStr = currentCombination.toString()
            result.add(subStr)
        }else {
            for (i in map[digits[index]]!!.indices){
                currentCombination.append(map.getOrDefault(digits[index],"")[i])
                backTrace(map, digits, index+1, result, currentCombination)
                //?????????????????????  ?????????????????????  ?????????????????? ????????????
                currentCombination.deleteCharAt(index)
            }
        }
    }

    /**
     * 37. ?????????
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
     * 45. ???????????? II
     * 5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5
     */
    fun jump(nums: IntArray): Int {
        var step = 0
        var arrived = 0
        var nextArrived = 0
        for (i in nums.indices){
            //?????????????????????????????????
            nextArrived = nextArrived.coerceAtLeast(i+nums[i])
            //???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
            if (nextArrived >= nums.size-1) return step+1
            //??????????????????????????????????????????????????????????????????????????????????????????????????????
            if (arrived == i){
                step++
                arrived = nextArrived
            }
        }
        return step
    }

    /**
     * 47. ????????? II
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
     * 78. ??????
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
     * 55. ????????????
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
     * 79. ????????????
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
     * 77. ??????
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
     * 24. ??????????????????????????????
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
     * 61. ????????????
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
     * 86. ????????????
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
     * 92. ???????????? II
     */
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        var count = 0
        var node = head
        var isReverse = false
        val stack = Stack<ListNode>()
        var leftHead = ListNode(0)
        leftHead.next = head
        while (node != null){
            count++
            when {
                count < left -> {
                    leftHead = leftHead.next!!
                }
                count > right -> {
                    if (!isReverse){
                        while (stack.isNotEmpty()){
                            leftHead.next = stack.pop()
                            leftHead = leftHead.next!!
                        }
                        isReverse = true
                    }
                    leftHead.next = node
                    leftHead = leftHead.next!!
                }
                else -> {
                    stack.push(node)
                }
            }
            node = node.next
        }
        if (!isReverse){
            while (stack.isNotEmpty()){
                leftHead.next = stack.pop()
                leftHead.next?.next = null
            }
        }
        return head
    }

    /**
     * 704. ????????????
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
     * 704. ????????????
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
     * 977. ?????????????????????
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
     * 509. ???????????????
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
     * 1137. ??? N ??????????????????
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

    /**
     * 746. ???????????????????????????
     * 1, 100, 1, 1, 1, 100, 1, 1, 100, 1
     */
    fun minCostClimbingStairs(cost: IntArray): Int {
        val newCost = IntArray(2+cost.size)
        System.arraycopy(cost,0,newCost,1,cost.size)
        val dp = IntArray(3)
        dp[0] = newCost[0]
        dp[1] = newCost[1]
        for (i in 2 until newCost.size){
            dp[2] = dp[0].coerceAtMost(dp[1])+newCost[i]
            dp[0] = dp[1]
            dp[1] = dp[2]
        }
        return dp[2]
    }

    /**
     * 213. ???????????? II
     * 2 3 2
     */
    fun rob2(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        val subNums = IntArray(nums.size-1)
        System.arraycopy(nums,1,subNums,0,subNums.size)
        val res1 = rob(subNums)
        System.arraycopy(nums,0,subNums,0,subNums.size)
        val res2 = rob(subNums)
        return res1.coerceAtLeast(res2)
    }

    fun rob3(nums: IntArray): Int{
        val dp = IntArray(2)
        dp[0] = 0
        dp[1] = nums[0]
        for (i in 1 until nums.size){
            val tm = dp[0]+nums[i]
            dp[0] = dp[1]
            dp[1] = tm
        }
        return dp[0].coerceAtLeast(dp[1])
    }

    /**
     * 740. ?????????????????????
     * 2,2,3,3,3,4             1,1,1,2,4,5,5,5,6
     */
    fun deleteAndEarn(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        var maxVal = 0
        for (i in nums){
            map[i] = map.getOrDefault(i,0)+1
            maxVal = maxVal.coerceAtLeast(i)
        }
        val keys = IntArray(maxVal+1)
        for (i in map.keys){
            keys[i] =  map[i]!!*i
        }
        return rob(keys)
    }

    /**
     * 918. ???????????????????????????
     * 5,-3,5
     */
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var tmp = nums[0]
        var max = tmp
        var sum = tmp
        var min = 0
        for (i in 1 until nums.size){
            tmp = nums[i]+tmp.coerceAtLeast(0)
            max = max.coerceAtLeast(tmp)
            sum += nums[i]
        }
        var minTmp = nums[0]
        for (j in 1 until nums.size-1){
            minTmp = nums[j] + minTmp.coerceAtMost(0)
            min = min.coerceAtMost(minTmp)
        }
        return max.coerceAtLeast(sum-min)
    }

    /**
     * 152. ?????????????????????
     * 2,-3,0,-2,4,4,0
     */
    fun maxProduct(nums: IntArray): Int {
        var tmMax = nums[0]
        var tmMin = nums[0]
        var max = tmMax
        var min = tmMin
        for (i in 1 until nums.size){
            val tmx = tmMax
            tmMax = ((nums[i] * tmMax).coerceAtLeast(nums[i]*tmMin)).coerceAtLeast(nums[i])
            tmMin = ((nums[i] * tmMin).coerceAtMost(nums[i]*tmx)).coerceAtMost(nums[i])
            max = max.coerceAtLeast(tmMax)
            min = min.coerceAtMost(tmMin)
        }
        return max.coerceAtLeast(min)
    }

    /**
     * 1567. ???????????????????????????????????????
     * 1,2,3,5,-6,4,0,10      -1,-2,-3,0,1
     */
    fun getMaxLen(nums: IntArray): Int {
        var maxLength = 0
        var positive = if (nums[0] > 0) 1 else 0
        var negative = if (nums[0] < 0) 1 else 0
        for (i in 1 until nums.size){
            when{
                nums[i] < 0 ->{
                    val newP = if (negative > 0) negative+1 else 0
                    val newN = positive+1
                    positive = newP
                    negative = newN
                }
                nums[i] > 0 ->{
                    positive += 1
                    negative = if (negative > 0) negative+1 else 0
                }
                else ->{
                    positive = 0
                    negative = 0
                }
            }
            maxLength = maxLength.coerceAtLeast(positive)
        }
        return maxLength.coerceAtLeast(positive)
    }

    /**
     * 1014. ??????????????????
     * 8,1,5,2,6
     */
    fun maxScoreSightseeingPair(values: IntArray): Int {
        var max = values[0]+0
        var ans = 0
        for (i in 1 until values.size){
            ans = (max+values[i]-i).coerceAtLeast(ans)
            max = max.coerceAtLeast(values[i]+i)
        }
        return ans
    }

    /**
     * 309. ????????????????????????????????????
     * 1,2,3,0,2
     *
     * ??????????????????dp?????????dp[i][0]?????????i?????????????????????dp[i][1]?????????i??????????????????
     * ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
     *
     * ???????????????????????????3??????????????????
     * dp[i][0]?????????i?????????????????????   dp[i][1]?????????i????????????????????????????????????   dp[i][2]?????????i???????????????????????????????????????
     *
     */
    fun maxProfitInFreezing(prices: IntArray): Int {
        val dp = Array(prices.size){IntArray(3)}
        val lastIndex = prices.size-1
        dp[0][0] = -prices[0]
        dp[0][1] = 0
        dp[0][2] = 0
        for (i in 1 until  prices.size){
            dp[i][0] = dp[i-1][0].coerceAtLeast(dp[i-1][2]-prices[i])
            dp[i][1] = dp[i-1][0]+prices[i]
            dp[i][2] = dp[i-1][2].coerceAtLeast(dp[i-1][1])
        }
        return dp[lastIndex][1].coerceAtLeast(dp[lastIndex][2])
    }

    /**
     * 714. ???????????????????????????????????????
     * 1, 3, 2, 8, 4, 9    2
     *
     * dp[i][0]?????????i????????????????????????dp[i][1]?????????i??????????????????
     */
    fun maxProfitInFee(prices: IntArray, fee: Int): Int {
        val dp = Array(prices.size){IntArray(2)}
        val size = prices.size
        dp[0][0] = 0
        dp[0][1] = -prices[0]
        for (i in 1 until size){
            dp[i][0] = dp[i-1][0].coerceAtLeast(dp[i-1][1]+prices[i]-fee)
            dp[i][1] = dp[i-1][1].coerceAtLeast(dp[i-1][0]-prices[i])
        }
        return dp[size-1][0].coerceAtLeast(dp[size-1][1])
    }

    fun maxProfitInFee2(prices: IntArray, fee: Int): Int {
        var sell = 0
        var hold = -prices[0]
        for (i in 1 until prices.size){
            val tmSell = sell
            sell = sell.coerceAtLeast(hold+prices[i]-fee)
            hold = hold.coerceAtLeast(tmSell-prices[i])
        }
        return sell
    }

    /**
     * 139. ????????????
     */
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val result = BooleanArray(s.length+1)
        result[0] = true
        for (i in 1 until s.length+1){
            for (j in 0 until i){
                if (result[j] && wordDict.contains(s.substring(j,i))){
                    result[i] = true
                    break
                }
            }
        }
        return result[s.length]
    }

    /**
     * 22. ????????????
     */
    fun generateParenthesis(n: Int): List<String> {
        val result = arrayListOf<String>()
        val subString = StringBuilder();
        backTraceParenthesis(subString,result,0,0,n)
        return result
    }

    private fun backTraceParenthesis(subString: StringBuilder,result: ArrayList<String>,open: Int,close: Int,max: Int){
        if (subString.length == max*2){
            val tm = subString.toString()
            result.add(tm)
            return
        }
        if (open < max){
            subString.append("(")
            backTraceParenthesis(subString, result, open+1, close, max)
            subString.deleteCharAt(subString.lastIndex)
        }
        if (close < open){
            subString.append(")")
            backTraceParenthesis(subString, result, open, close+1, max)
            subString.deleteCharAt(subString.lastIndex)
        }
    }

    /**
     * 29. ????????????
     */
    fun divide(dividend: Int, divisor: Int): Int {
        return 0
    }

    /**
     * ?????? ?????????
     */
    fun subtraction(num1: Int,num2: Int): Int{
        var a = num1.xor(num2)
        var b = a.and(num2)
        while (b != 0){
            b = b.shl(1)
            a = a.xor(b)
            b = a.and(b)
        }
        return a
    }

    /**
     * ?????? ?????????
     */
    fun addition(num1: Int,num2: Int): Int{
        var a = num1
        var b = num2
        while (b != 0){
            val num = a.xor(b)
            val carry = a.and(b).shl(1)
            a = num
            b = carry
        }
        return a
    }

    /**
     * 59. ???????????? II
     */
    fun generateMatrix(n: Int): Array<IntArray> {
        val resultMatrix = Array(n){IntArray(n){-1}}
        generateMatrixProcess(n,1,resultMatrix,0,0,3)
        return resultMatrix
    }

    private fun generateMatrixProcess(n: Int,currentNum: Int,resultMatrix: Array<IntArray>,i: Int,j: Int,direction: Int): Boolean{
        if (i == n || j == n || i < 0 || j < 0) return false
        if (resultMatrix[i][j] != -1) return false
        if (currentNum > n*n) return true
        resultMatrix[i][j] = currentNum
        when(direction){
            0 -> {
                return if (!generateMatrixProcess(n, currentNum+1, resultMatrix, i-1, j, direction)){
                    generateMatrixProcess(n, currentNum+1, resultMatrix, i, j+1, 3)
                }else{
                    true
                }
            }
            1 -> {
                return if (!generateMatrixProcess(n, currentNum+1, resultMatrix, i+1, j, direction)){
                    generateMatrixProcess(n, currentNum+1, resultMatrix, i, j-1, 2)
                }else{
                    true
                }
            }
            2 -> {
                return if (!generateMatrixProcess(n, currentNum+1, resultMatrix, i, j-1, direction)){
                    generateMatrixProcess(n, currentNum+1, resultMatrix, i-1, j, 0)
                }else{
                    true
                }
            }
            3 -> {
                return if (!generateMatrixProcess(n, currentNum+1, resultMatrix, i, j+1, direction)){
                    generateMatrixProcess(n, currentNum+1, resultMatrix, i+1, j, 1)
                }else{
                    true
                }
            }
        }
        return true
    }

    /**
     * 63. ???????????? II
     * ????????????
     */
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val column = obstacleGrid[0].size
        val raw = obstacleGrid.size
        return backTraceUniquePathsWithObstacles(raw, column, obstacleGrid, 0, 0)
    }

    private fun backTraceUniquePathsWithObstacles(raw: Int, column: Int, matrix: Array<IntArray>, i: Int, j: Int): Int{
        if (i == raw || j == column) return 0
        if (matrix[i][j] == 1 || matrix[i][j] == 2) return 0
        if (i == raw-1 && j == column-1) return 1
        matrix[i][j] = 2
        val n1 = backTraceUniquePathsWithObstacles(raw, column, matrix, i, j+1)
        val n2 = backTraceUniquePathsWithObstacles(raw, column, matrix, i+1, j)
        matrix[i][j] = 0
        return n1+n2
    }

    /**
     * 63. ???????????? II
     * ??????????????????
     */
    fun uniquePathsWithObstacles2(obstacleGrid: Array<IntArray>): Int {
        if (obstacleGrid[0][0] == 1 || obstacleGrid[obstacleGrid.size-1][obstacleGrid[0].size-1] == 1) return 0
        val dp = Array(obstacleGrid.size){IntArray(obstacleGrid[0].size)}
        dp[0][0] = if (obstacleGrid[0][0] == 0) 1 else 0
        for (i in obstacleGrid.indices){
            for (j in obstacleGrid[0].indices){
                if (i == 0 && j == 0) continue
                if (i == 0){
                    dp[i][j] = if (dp[i][j-1] == 1 && obstacleGrid[i][j] != 1) 1 else 0
                    continue
                }
                if (j == 0){
                    dp[i][j] = if (dp[i-1][j] == 1 && obstacleGrid[i][j] != 1) 1 else 0
                    continue
                }
                dp[i][j] = if (obstacleGrid[i][j] != 1) dp[i-1][j]+dp[i][j-1] else 0
            }
        }
        return dp[obstacleGrid.size-1][obstacleGrid[0].size-1]
    }

    /**
     * 90. ?????? II
     *
     * 1 2 2
     * 4 4 4 1 4
     */
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val subList = arrayListOf<Int>()
        val resList = arrayListOf<List<Int>>()
        nums.sort()
        backTraceSubsetsWithDup(nums,subList,resList,0)
        return resList
    }


    private fun backTraceSubsetsWithDup(nums: IntArray, subList: ArrayList<Int>, resList: ArrayList<List<Int>>, index: Int){
        if (resList.contains(subList)) return
        resList.add(ArrayList(subList))
        for (j in index until nums.size){
            subList.add(nums[j])
            backTraceSubsetsWithDup(nums,subList,resList,j+1)
            subList.removeAt(subList.size-1)
        }
    }

    /**
     * 105. ?????????????????????????????????????????????
     */
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty() || inorder.isEmpty()) return null
        val headTree = TreeNode(preorder[0])
        val inorderIndex = inorder.indexOf(preorder[0])
        val newLeftPreorder = IntArray(inorderIndex)
        val newLeftInorder = IntArray(inorderIndex)
        val newRightPreorder = IntArray(preorder.size-newLeftInorder.size-1)
        val newRightInorder = IntArray(preorder.size-newLeftInorder.size-1)
        System.arraycopy(preorder,1,newLeftPreorder,0,inorderIndex)
        System.arraycopy(preorder,1+inorderIndex,newRightPreorder,0,preorder.size-inorderIndex-1)
        System.arraycopy(inorder,0,newLeftInorder,0,inorderIndex)
        System.arraycopy(inorder,1+inorderIndex,newRightInorder,0,preorder.size-inorderIndex-1)
        headTree.left = buildTree(newLeftPreorder,newLeftInorder)
        headTree.right = buildTree(newRightPreorder,newRightInorder)
        return headTree
    }

    /**
     * 106. ?????????????????????????????????????????????
     */
    fun buildTreePostorder(inorder: IntArray, postorder: IntArray): TreeNode? {
        if (inorder.isEmpty() || postorder.isEmpty()) return null
        val headTree = TreeNode(postorder[postorder.size-1])
        val inorderIndex = inorder.indexOf(postorder[postorder.size-1])
        val newLeftPostorder = IntArray(inorderIndex)
        val newLeftInorder = IntArray(inorderIndex)
        val newRightPostorder = IntArray(postorder.size-newLeftInorder.size-1)
        val newRightInorder = IntArray(postorder.size-newLeftInorder.size-1)
        System.arraycopy(postorder,0,newLeftPostorder,0,inorderIndex)
        System.arraycopy(postorder,inorderIndex,newRightPostorder,0,postorder.size-inorderIndex-1)
        System.arraycopy(inorder,0,newLeftInorder,0,inorderIndex)
        System.arraycopy(inorder,1+inorderIndex,newRightInorder,0,postorder.size-inorderIndex-1)
        headTree.left = buildTree(newLeftInorder,newLeftPostorder)
        headTree.right = buildTree(newRightInorder,newRightPostorder)
        return headTree
    }

    /**
     * 120. ????????????????????????
     *      -1
     *    2   3
     *  1  -1  -3
     *1   1   1   1
     */
    fun minimumTotal(triangle: List<List<Int>>): Int {
        if (triangle.size == 1) return triangle[0][0]
        val dp = Array(triangle.size){IntArray(triangle.size)}
        dp[0][0] = triangle[0][0]
        var min = Int.MAX_VALUE
        for (i in 1 until triangle.size){
            dp[i][0] = dp[i-1][0]+triangle[i][0]
            if (i == triangle.size-1){
                min = min.coerceAtMost(dp[i][0])
            }
            for (j in 1 until i){
                dp[i][j] = dp[i-1][j-1].coerceAtMost(dp[i-1][j])+triangle[i][j]
                if (i == triangle.size-1){
                    min = min.coerceAtMost(dp[i][j])
                }
            }
            dp[i][i] = dp[i-1][i-1]+triangle[i][i]
            if (i == triangle.size-1){
                min = min.coerceAtMost(dp[i][i])
            }
        }
        return min
    }

    /**
     * ??????????????????O(n)?????????  ?????????O(n*n)
     */
    fun minimumTotal2(triangle: List<List<Int>>): Int {
        if (triangle.size == 1) return triangle[0][0]
        val dp = IntArray(triangle.size)
        dp[0] = triangle[0][0]
        var min = Int.MAX_VALUE
        for (i in 1 until triangle.size){
            dp[i] = dp[i-1]+triangle[i][i]
            if (i == triangle.size-1){
                min = min.coerceAtMost(dp[i])
            }
            for (j in i-1 downTo 1){
                dp[j] = dp[j-1].coerceAtMost(dp[j])+triangle[i][j]
                if (i == triangle.size-1){
                    min = min.coerceAtMost(dp[j])
                }
            }
            dp[0] = dp[0]+triangle[i][0]
            if (i == triangle.size-1){
                min = min.coerceAtMost(dp[0])
            }
        }
        return min
    }

    /**
     * 58. ???????????????????????????
     */
    fun lengthOfLastWord(s: String): Int {
        val words = s.split(" ")
        var lastLength = 0
        for (i in words.indices){
            if (words[i].isEmpty()) continue
            lastLength = words[i].length
        }
        return lastLength
    }

    fun lengthOfLastWord2(s: String): Int {
        var end = -1
        var start = 0
        for (i in s.length-1 downTo 0){
            if (s[i] != ' '){
                if (end == -1){
                    end = i
                }
            }else{
                if (end != -1){
                    start = i+1
                    break
                }
            }
        }
        return end-start+1
    }

    /**
     * 128. ??????????????????
     *
     * 100,4,200,1,3,2
     */
    fun longestConsecutive(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        var maxLength = 0
        for (i in nums.indices){
            if (!map.containsKey(nums[i])){
                val left = map[nums[i]-1]?:0
                val right = map[nums[i]+1]?:0

                map[nums[i]] = 1
                val length = left+right+1
                maxLength = maxLength.coerceAtLeast(length)

                map[nums[i]-left] = length
                map[nums[i]+right] = length
            }
        }
        return maxLength
    }

    /**
     * 62. ????????????
     */
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m){IntArray(n)}
        for (i in 0 until m){
            for (j in 0 until n){
                if (i == 0){
                    dp[0][j] = 1
                    continue
                }
                if (j == 0){
                    dp[i][0] = 1
                    continue
                }
                dp[i][j] = dp[i-1][j]+dp[i][j-1]
            }
        }
        return dp[m-1][n-1]
    }

    /**
     * 62. ????????????
     * ????????????
     */
    fun uniquePaths2(m: Int, n: Int): Int {
        val dp = IntArray(n)
        for (i in 0 until m){
            for (j in 0 until n){
                if (i == 0){
                    dp[j] = 1
                    continue
                }
                if (j == 0){
                    dp[j] = 1
                    continue
                }
                dp[j] += dp[j-1]
            }
        }
        return dp[n-1]
    }

    /**
     * 67. ???????????????
     * 11 01
     */
    fun addBinary(a: String, b: String): String {
        if (a == "0") return b
        if (b == "0") return a
        val maxLength = a.length.coerceAtLeast(b.length)
        val aArray = IntArray(maxLength+1)
        val bArray = IntArray(maxLength+1)
        val sbResult = StringBuilder()
        var isNeedCarry = false
        for (i in a.indices){
            aArray[aArray.size-a.length+i] = a[i]-'0'
        }
        for (j in b.indices){
            bArray[bArray.size-b.length+j] = b[j]-'0'
        }
        val lastIndex = aArray.size-1

        for (m in lastIndex downTo 0){
            if (!isNeedCarry){
                if (aArray[m]==1 && bArray[m]==1){
                    sbResult.insert(0,"0")
                    isNeedCarry = true
                    continue
                }
                if (aArray[m]==0 && bArray[m]==0){
                    sbResult.insert(0,"0")
                    isNeedCarry = false
                    continue
                }
                sbResult.insert(0,"1")
                isNeedCarry = false
            }else{
                if (aArray[m]==1 && bArray[m]==1){
                    sbResult.insert(0,"1")
                    isNeedCarry = true
                    continue
                }
                if (aArray[m]==0 && bArray[m]==0){
                    sbResult.insert(0,"1")
                    isNeedCarry = false
                    continue
                }
                sbResult.insert(0,"0")
                isNeedCarry = true
            }
        }
        val result = sbResult.toString()
        var end = 0
        for (i in result.indices){
            if (result[i] == '1') break
            end++
        }
        return result.substring(end)
    }

    /**
     * 130. ??????????????????
     * x x x x
     * x o o x
     * x x o x
     * x o o o
     */
    fun solve(board: Array<CharArray>): Unit {
        if (board.size == 1) return
        if (board[0].size == 1) return
        val visitedArray = Array(board.size){ BooleanArray(board[0].size) }
        val dp = Array(board.size){ BooleanArray(board[0].size) }

        for (i in board.indices){
            if (board[i][0] == 'O' && !visitedArray[i][0]){
                bfsSolve(dp, i, 0,visitedArray, board)
            }
            if (board[i][board[i].size-1] == 'O' && !visitedArray[i][board[i].size-1]){
                bfsSolve(dp,i,board[i].size-1,visitedArray, board)
            }
        }

        for (j in board[0].indices){
            if (board[0][j] == 'O' && !visitedArray[0][j]){
                bfsSolve(dp,0,j,visitedArray, board)
            }
            if (board[board.size-1][j] == 'O' && !visitedArray[board.size-1][j]){
                bfsSolve(dp,board.size-1,j, visitedArray, board)
            }
        }

        for (i in dp.indices){
            for (j in dp[i].indices){
                if (board[i][j] == 'O' && !dp[i][j]){
                    board[i][j] = 'X'
                }
            }
        }

        board.forEach {
            it.forEach { c ->
                print("$c ")
            }
            println()
        }
    }

    private fun bfsSolve(dp: Array<BooleanArray>, i: Int, j: Int, visitedArray: Array<BooleanArray>, board: Array<CharArray>) {
        dp[i][j] = true
        visitedArray[i][j] = true
        val queue = LinkedBlockingQueue<IntArray>()
        val array = intArrayOf(i, j)
        queue.put(array)
        while (queue.isNotEmpty()) {
            val topArray = queue.poll()
            val a = topArray[0]
            val b = topArray[1]
            if (a > 0){
                checkAdjoin(visitedArray, a-1, b, board, dp, queue)
            }
            if (a < board.size-1){
                checkAdjoin(visitedArray, a+1, b, board, dp, queue)
            }
            if (b > 0){
                checkAdjoin(visitedArray, a, b-1, board, dp, queue)
            }
            if (b < board[0].size-1){
                checkAdjoin(visitedArray, a, b+1, board, dp, queue)
            }

            if (a==0 && b==0){
                checkAdjoin(visitedArray, a+1, b, board, dp, queue)
                checkAdjoin(visitedArray, a, b+1, board, dp, queue)
            }
            if (a==board.size-1 && b==0){
                checkAdjoin(visitedArray, a-1, b, board, dp, queue)
                checkAdjoin(visitedArray, a, b+1, board, dp, queue)
            }
            if (a==0 && b==board[0].size-1){
                checkAdjoin(visitedArray, a+1, b, board, dp, queue)
                checkAdjoin(visitedArray, a, b-1, board, dp, queue)
            }
            if (a==board.size-1 && b==board[0].size-1){
                checkAdjoin(visitedArray, a-1, b, board, dp, queue)
                checkAdjoin(visitedArray, a, b-1, board, dp, queue)
            }
        }
    }

    private fun checkAdjoin(
        visitedArray: Array<BooleanArray>,
        a: Int,
        b: Int,
        board: Array<CharArray>,
        dp: Array<BooleanArray>,
        queue: LinkedBlockingQueue<IntArray>
    ) {
        if (!visitedArray[a][b] && board[a][b] == 'O') {
            dp[a][b] = true
            visitedArray[a][b] = true
            queue.put(intArrayOf(a, b))
        }
    }

    /**
     * 134. ?????????
     * gas   1,2,3,4,5     2,3,4
     * cost  3,4,5,1,2     3,4,3
     */
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var maxGas = 0
        var maxCost = 0
        for (i in gas.indices){
            maxGas += gas[i]
            maxCost += cost[i]
        }
        if (maxCost>maxGas) return -1
        var currentGas = 0
        val length = gas.size
        var isEnd = false
        for (i in gas.indices){
            if (gas[i] < cost[i] || (gas[i] == 0 && cost[i] == 0)) continue
            for (j in i until i+length){
                currentGas += gas[j%length]
                if (currentGas < cost[j%length]) {
                    currentGas = 0
                    break
                }
                currentGas -= cost[j%length]
                if (j == i+length-1){
                    isEnd = true
                }
            }
            if (isEnd) return i
        }
        return -1
    }

    fun canCompleteCircuit2(gas: IntArray, cost: IntArray): Int {
        var currentGas = 0
        val length = gas.size
        for (i in gas.indices){
            if ((gas[i] == 0 && cost[i] == 0) || gas[i] < cost[i]) continue
            currentGas += gas[i]
        }
        return -1
    }

    /**
     * 137. ???????????????????????? II
     */
    fun singleNumber2(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        var result = 0
        for (i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }
        for (key in map.keys){
            if (map[key] == 1){
                result = key
                break
            }
        }
        return result
    }

    /**
     * 150. ????????????????????????
     */
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<String>()
        for (i in tokens.indices){
            when (tokens[i]){
                "+" ->{
                    val a = stack.pop().toInt()
                    val b = stack.pop().toInt()
                    stack.push((a+b).toString())
                }
                "-" ->{
                    val a = stack.pop().toInt()
                    val b = stack.pop().toInt()
                    stack.push((b-a).toString())
                }
                "*" ->{
                    val a = stack.pop().toInt()
                    val b = stack.pop().toInt()
                    stack.push((a*b).toString())
                }
                "/" ->{
                    val a = stack.pop().toInt()
                    val b = stack.pop().toInt()
                    stack.push((b/a).toString())
                }
                else ->{
                    stack.push(tokens[i])
                }
            }
        }
        return stack.peek().toInt()
    }

    /**
     * 162. ????????????
     */
    fun findPeakElement(nums: IntArray): Int {
        if (nums.size == 1) return 0
        var left = 0
        var right = nums.size-1
        var mid: Int
        while (left < right){
            if (left == right-1){
                return if (nums[left] > nums[right]) left else right
            }
            mid = (left+right)/2
            if (mid == 0){
                return if (nums[mid] > nums[mid+1]) mid else mid+1
            }
            if (mid == nums.size-1){
                return if (nums[mid] > nums[mid-1]) mid else mid-1
            }
            if (nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                left = mid+1
                continue
            }
            if (nums[mid-1] > nums[mid] && nums[mid] > nums[mid+1]){
                right = mid-1
                continue
            }
            if (nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid
            }
            if (nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]){
                left = mid
                continue
            }
        }
        return left
    }

    /**
     * 174. ???????????????
     * -2   -3   3
     * -5  -10   1
     * 10   30  -5
     *
     * 1 -2 3
     * 2 -2 -2
     */
    fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        val dp = Array(dungeon.size){IntArray(dungeon[0].size)}
        dp[dungeon.size-1][dungeon[0].size-1] = (1-dungeon[dungeon.size-1][dungeon[0].size-1]).coerceAtLeast(1)
        for (i in dungeon.size-1 downTo 0){
            for (j in dungeon[0].size-1 downTo 0){
                if (i == dungeon.size-1 && j == dungeon[i].size-1) continue
                if (i == dungeon.size-1){
                    dp[i][j] = (dp[i][j+1]-dungeon[i][j]).coerceAtLeast(1)
                    continue
                }
                if (j == dungeon[i].size-1){
                    dp[i][j] = (dp[i+1][j]-dungeon[i][j]).coerceAtLeast(1)
                    continue
                }
                dp[i][j] = (dp[i+1][j].coerceAtMost(dp[i][j+1])-dungeon[i][j]).coerceAtLeast(1)
            }
        }
        return dp[0][0].coerceAtLeast(1)
    }

    /**
     * 200. ????????????
     */
    fun numIslands(grid: Array<CharArray>): Int {
        var lands = 0
        val isVisited = Array(grid.size){BooleanArray(grid[0].size)}
        for (i in grid.indices){
            for (j in grid[i].indices){
                if (isVisited[i][j]) continue
                if (grid[i][j] == '0') continue
                lands+=1
                bfsNumIslands(grid, isVisited, i, j)
            }
        }
        return lands
    }

    private fun bfsNumIslands(grid: Array<CharArray>, isVisited: Array<BooleanArray>, i: Int, j: Int){
        if (i < 0 || i > grid.size-1) return
        if (j < 0 || j > grid[0].size-1) return
        if (isVisited[i][j]) return
        if (grid[i][j] == '0') return
        isVisited[i][j] = true
        bfsNumIslands(grid, isVisited, i, j-1)
        bfsNumIslands(grid, isVisited, i-1, j)
        bfsNumIslands(grid, isVisited, i, j+1)
        bfsNumIslands(grid, isVisited, i+1, j)
    }

//    /**
//     * 204. ????????????
//     */
//    fun countPrimes(n: Int): Int {
//        if (n == 0 || n == 1) return 0
//        var count = 0
//        for (i in 2 until n){
//            count += if (isPrimes(i)) 1 else 0
//        }
//        return count
//    }
//
//    private fun isPrimes(x: Int): Boolean{
//        var i = 2
//        while (i*i<=x){
//            if (x%i == 0){
//                return false
//            }
//            i++
//        }
//        return true
//    }

    /**
     * 216. ???????????? III
     */
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val subList = arrayListOf<Int>()
        val result = arrayListOf<ArrayList<Int>>()
        backTraceCombinationSum3(subList, result,0, k, n,0)
        return result
    }

    private fun backTraceCombinationSum3(subList: ArrayList<Int>, result: ArrayList<ArrayList<Int>>,currentSum: Int, k: Int, n: Int,i: Int){
        if (currentSum > n) return
        if (subList.size == k && currentSum == n){
            val tmpList = ArrayList(subList)
            result.add(tmpList)
            return
        }
        if (subList.size == k && currentSum < n) return
        for (j in i+1 .. 9){
            subList.add(j)
            backTraceCombinationSum3(subList, result,currentSum+j, k, n, j)
            subList.removeAt(subList.size-1)
        }
    }

    /**
     * 219. ?????????????????? II
     * 1,2,3,1,2,3   2
     */
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        for (i in 0 until nums.size-1){
            for (j in i+1 .. (nums.size-1).coerceAtMost(i+k)){
                if (nums[i] == nums[j]) return true
            }
        }
        return false
    }

    /**
     * 219. ?????????????????? II
     * ????????????
     */
    fun containsNearbyDuplicate2(nums: IntArray, k: Int): Boolean {
        val set = HashSet<Int>(k+1)
        for (i in nums.indices){
            if (set.contains(nums[i])){
                return true
            }
            set.add(nums[i])
            if (set.size == k+1){
                set.remove(nums[i-k])
            }
        }
        return false
    }

    /**
     * 220. ?????????????????? III
     */
    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {

        return false
    }


    /**
     * 221. ???????????????
     */
//    fun maximalSquare(matrix: Array<CharArray>): Int {
//        val dp = Array(matrix.size){IntArray(matrix[0].size)}
//        dp[0][0] = if (matrix[0][0] == '1') 1 else 0
//        for (i in matrix.indices){
//            for (j in matrix[i].indices){
//                if (i == 0 && j == 0)continue
//
//            }
//        }
//    }

    /**
     * 228. ????????????
     * 0,1,2,4,5,7
     */
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()
        if (nums.size == 1) return arrayListOf("${nums[0]}")
        val result = arrayListOf<String>()
        var start = 0
        var end = 1
        while (end <= nums.size-1){
            if (nums[end] != nums[end-1]+1){
                if (end == start+1){
                    result.add("${nums[start]}")
                }else{
                    result.add("${nums[start]}->${nums[end-1]}")
                }
                start = end
            }
            end++
        }
        if (start == nums.size-1){
            result.add("${nums[start]}")
        }else{
            result.add("${nums[start]}->${nums[nums.size-1]}")
        }
        return result
    }

//    /**
//     * 91. ????????????
//     */
//    fun numDecodings(s: String): Int {
//        if (s[0] == '0') return 0
//
//    }

    /**
     * 229. ????????? II
     */
    fun majorityElement2(nums: IntArray): List<Int> {
        val result = arrayListOf<Int>()
        val map = HashMap<Int,Int>()
        val n = nums.size/3
        if (nums.size == 1){
            result.add(nums[0])
            return result
        }
        if (nums.size == 2){
            if (nums[0] == nums[1]){
                result.add(nums[0])
            }else{
                result.add(nums[0])
                result.add(nums[1])
            }
            return result
        }
        nums.forEach {
            map[it] = map.getOrDefault(it,0)+1
        }
        map.keys.forEach {
            if (map[it]!! > n){
                result.add(it)
            }
        }
        return result
    }

    /**
     * 260. ???????????????????????? III
     */
    fun singleNumber3(nums: IntArray): IntArray {
        if (nums.size == 2) return nums
        var xorResult = 0
        val result = IntArray(2)
        for (i in nums.indices){
            xorResult = xorResult.xor(nums[i])
        }
        for (j in nums.indices){
            if (nums.contains(xorResult.xor(nums[j]))){
                result[0] = nums[j]
                result[1] = xorResult.xor(nums[j])
            }
        }
        return result
    }

    /**
     * 268. ???????????????
     */
    fun missingNumber(nums: IntArray): Int {
        var result = -1
        for (i in nums.indices){
            result = result.xor(i).xor(nums[i])
        }
        result = result.xor(nums.size).xor(-1)
        return result
    }

    /**
     * 274. H ??????
     * 0 1 3 5 6
     */
    fun hIndex(citations: IntArray): Int {
        val sortArray = countSort(citations)
        var h = 0
        for (i in sortArray.indices){
            if (sortArray[i] == 0) continue
            h = h.coerceAtLeast(sortArray[i].coerceAtMost(sortArray.size-i))
        }
        return h
    }

    /**
     * 274. H ??????
     * 1????????????????????????????????????????????????????????????????????????????????????????????????size??????????????????
     * 2???????????????????????????????????????????????????????????????????????????
     * 3?????????h????????????????????????????????????index??????????????????????????????????????????????????????????????????index????????????????????????
     *   ????????????????????????????????????h?????????min{index,countArray(index)},??????countArray???index???6???????????????????????????5???????????????6???????????????5????????????h?????????????????????h=5?????????????????????????????????h???????????????????????????????????????h???????????????h?????????????????????
     * 4??????????????????????????????????????????????????????0?????????????????????????????????????????????????????????????????????????????????????????????????????????index??????????????????????????????????????????????????????min??????????????????????????????????????????
     */
    fun hIndex3(citations: IntArray): Int{
        //??????
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        citations.forEach {
            min = min.coerceAtMost(it)
            max = max.coerceAtLeast(it)
        }
        //????????????
        val countArray = IntArray(max-min+1)
        citations.forEach {
            countArray[it-min] = countArray[it-min]+1
        }
        var count = 0
        var h = Int.MIN_VALUE
        for (i in countArray.size-1 downTo 0){
            count += countArray[i]
            //h=max{h,min{????????????i+min?????????????????????i+min}}
            h = h.coerceAtLeast(count.coerceAtMost(i+min))
        }
        return h
    }

    /**
     * ????????????
     */
    private fun countSort(nums: IntArray): IntArray{
        var max = nums[0]
        var min = nums[0]
        for (i in nums.indices){
            max = max.coerceAtLeast(nums[i])
            min = min.coerceAtMost(nums[i])
        }
        val countArray = IntArray(max - min+1)
        for (j in nums.indices){
            countArray[nums[j]-min] += 1
        }
        val resultArray = IntArray(nums.size)
        var index = 0
        for (m in countArray.indices){
            while (countArray[m] != 0){
                resultArray[index] = m+min
                countArray[m] -= 1
                index++
            }
        }
        return resultArray
    }

    /**
     * 275. H ?????? II
     * 2 4 7 7 7   0 1 2 5 6
     */
    fun hIndex2(citations: IntArray): Int {
        var left = 0
        var right = citations.size-1
        var result = 0
        while (left <= right){
            val mid = (left+right)/2
            if (citations[mid] == 0){
                left = mid+1
                continue
            }
            var tm: Int
            if (citations[mid] > citations.size-mid){
                tm = citations.size-mid
                right = mid-1
            }else{
                tm = citations[mid]
                left = mid+1
            }
            result = result.coerceAtLeast(tm)
        }
        return result
    }

    /**
     * 287. ???????????????
     * 1 4 4 2 4  10  15
     */
    fun findDuplicate(nums: IntArray): Int{
        for (i in nums.indices){
            for (j in i+1 until nums.size){
                if (nums[i] == nums[j]) return nums[i]
            }
        }
        return 0
    }

    /**
     * 289. ????????????
     * 0 1 0
     * 0 0 1
     * 1 1 1
     * 0 0 0
     */
    fun gameOfLife(board: Array<IntArray>): Unit {
        var liveCount = 0
        a@ for (i in board.indices){
            b@ for (j in board[i].indices){
                c@ for (k in (i-1).coerceAtLeast(0) .. (i+1).coerceAtMost(board.size-1)){
                    d@ for (m in (j-1).coerceAtLeast(0) .. (j+1).coerceAtMost(board[i].size-1)){
                        if (liveCount > 3) break@c
                        if (k == i && m == j) continue@d
                        if (board[k][m] == 1 || board[k][m] == 2){
                            liveCount+=1
                            continue@d
                        }
                    }
                }
                when(board[i][j]){
                    0 ->{//?????????
                        if (liveCount == 3) board[i][j] = 3
                    }
                    1 ->{//?????????
                        if (liveCount < 2 || liveCount > 3) board[i][j] = 2
                    }
                }
                liveCount = 0
            }
        }
        for (i in board.indices){
            for (j in board[i].indices){
                if (board[i][j] == 2) {
                    board[i][j] = 0
                }else if (board[i][j] == 3){
                    board[i][j] = 1
                }
            }
        }
    }

    /**
     * 300. ?????????????????????
     * 10,9,2,5,3,7,101,18
     * 0,1,0,3,2,3
     */
    fun lengthOfLIS(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        var maxLength = 1
        dp[0] = 1
        for (i in 1 until nums.size){
             for (j in 0 until i){
                 if (nums[i] > nums[j]){
                     dp[i] = (dp[j]+1).coerceAtLeast(dp[i])
                     maxLength = maxLength.coerceAtLeast(dp[i])
                 }
             }
            dp[i] = dp[i].coerceAtLeast(1)
        }
        dp.forEach {
            print("$it ")
        }
        println()
        return maxLength
    }

    /**
     * 303. ??????????????? - ???????????????
     */
    class NumArray(val nums: IntArray) {

        private val sums = IntArray(nums.size)

        init {
            sums[0] = nums[0]
            for (i in 1 until nums.size){
                sums[i]  = sums[i-1]+nums[i]
            }
        }

        fun sumRange(left: Int, right: Int): Int {
            return if (left == 0){
                sums[right]
            }else{
                sums[right] - sums[left-1]
            }
        }

    }

    /**
     * 304. ????????????????????? - ???????????????
     */
    class NumMatrix(matrix: Array<IntArray>) {
        private val sums = Array(matrix.size){IntArray(matrix[0].size)}

        init {
            sums[0][0] = matrix[0][0]
            for (i in matrix.indices){
                for (j in matrix[0].indices){
                    if (i == 0 && j ==0)continue
                    if (i == 0){
                        sums[i][j] = sums[i][j-1]+matrix[i][j]
                        continue
                    }
                    if (j == 0){
                        sums[i][j] = sums[i-1][j]+matrix[i][j]
                        continue
                    }
                    sums[i][j] = sums[i][j-1]+sums[i-1][j]+matrix[i][j]-sums[i-1][j-1]
                }
            }
        }

        fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
            sums.forEach {
                it.forEach { n ->
                    print("$n ")
                }
                println()
            }
            return when{
                row1 > 0 && col1 > 0 -> sums[row2][col2]-sums[row2][col1-1]-sums[row1-1][col2]+sums[row1-1][col1-1]
                row1 == 0 && col1 > 0 -> sums[row2][col2]-sums[row2][col1-1]
                row1 > 0 && col1 == 0 -> sums[row2][col2]-sums[row1-1][col2]
                else -> sums[row2][col2]
            }
        }
    }

    private fun tmFun(){
//        val matrix = NumMatrix(arrayOf(intArrayOf(3,0,1,4,2),
//                                       intArrayOf(5,6,3,2,1),
//                                       intArrayOf(1,2,0,1,5),
//                                       intArrayOf(4,1,0,1,7),
//                                       intArrayOf(1,0,3,0,5)))
//
//        println(matrix.sumRegion(2,1,4,3))

//        val array = NumArray3(nums = intArrayOf(7,2,7,2,0))
//        array.update(4,6)
//        array.update(0,2)
//        array.update(0,9)
//        println(array.sumRange(4,4))
//        array.update(3,8)
//        println(array.sumRange(0,4))
//        array.update(4,1)
//        println(array.sumRange(0,3))
//        println(array.sumRange(0,4))

        val a = 0x1b
        val b = 0x0f
        val a1 = a.toByte()
        println(a)
        println(a1)
        println(a.shr(4))
        val c = a.shr(4).and(b)
        println(c)
        val d = c+0x30
        println(d)
        println(0x01+0x30)

        println("------------------------")

        val e = 48
        val f = 0x0f
        val f1 = 15
        val g = e.and(f)
        val g1 = e.and(f1)
        println("g:$g")
        println("g1:$g1")
        val h = g.shl(4)
        println(h)

        println("------------------------")

        val i = 63
        val j = i.and(f)
        println(j)
        val l = j.shl(4)
        println(l)

        val m = 257
        println("Byte max:${Byte.MAX_VALUE}")
        println("Byte min:${Byte.MIN_VALUE}")
        println(m.toByte())


        println(f.toByte())
    }

    /**
     * 179. ?????????
     * 3,30,34,5,9
     */
    fun largestNumber(nums: IntArray): String {
        val sb = StringBuilder()
//        val sortList = arrayListOf<Int>()
//        for (i in nums.indices){
//            if (i == 0){
//                sortList.add(nums[i])
//                continue
//            }
//            when{
//                nums[i].toString()[0] < sortList[i-1].toString()[0] -> sortList.add(nums[i])
//                nums[i].toString()[0] > sortList[i-1].toString()[0] -> {
//                    for (j in )
//                }
//            }
//        }
        return sb.toString()
    }

    /**
     * 307. ??????????????? - ???????????????
     */
    class NumArray3(val nums: IntArray) {

        private val sums = IntArray(nums.size)

        init {
            print("???????????????")
            nums.forEach {
                print("$it ")
            }
            sums[0] = nums[0]
            for (i in 1 until nums.size){
                sums[i]  = sums[i-1]+nums[i]
            }
            println()
            print("??????????????????")
            sums.forEach {
                print("$it ")
            }
            println()
        }

        fun update(index: Int, `val`: Int) {
            println("update:index->$index  `val`->$`val`")
            for (i in index until nums.size){
                sums[i] += `val`-nums[index]
            }
            nums[index] = `val`
            sums.forEach {
                print("$it ")
            }
            println()
        }

        fun sumRange(left: Int, right: Int): Int {
            println("sumRange:left->$left   right->$right")
            return if (left == 0){
                sums[right]
            }else{
                sums[right] - sums[left-1]
            }
        }

    }

    /**
     * 334. ????????????????????????
     * 20,100,10,12,5,13
     */
    fun increasingTriplet(nums: IntArray): Boolean {
        if (nums.size < 3) return false
        var iV = Int.MAX_VALUE
        var jV = Int.MAX_VALUE
        for (k in nums.indices){
            when {
                nums[k] <= iV -> iV = nums[k]
                nums[k] <= jV -> jV = nums[k]
                else -> return true
            }
        }
        return false
    }

    /**
     * 69. x ????????????
     */
    fun mySqrt(x: Int): Int {
        if (x == 1) return 1
        var result = 0
        var left = 0
        var right = x
        while (left < right){
            if (left == right-1)return left
            val mid = ((left+right)/2).toLong()
            val midMul = mid*mid
            when{
                midMul > x -> right = mid.toInt()
                midMul < x -> left = mid.toInt()
                else -> return mid.toInt()
            }
        }
        return if (left == right) left else result
    }

    /**
     * 50. Pow(x, n)
     * 2.0   10
     */
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) return 1.0
        if (n == 1) return x
        if (n == -1) return 1/x
        return if (n < 0){
            if (n%2 == 0) subTrackMyPow(1/x,n) else subTrackMyPow(1/x,n+1)*(1/x)
        }else{
            if (n%2 == 0) subTrackMyPow(x,n) else subTrackMyPow(x,n-1)*x
        }
    }

    private fun subTrackMyPow(x: Double,n: Int): Double{
        return when{
            n > 1 -> if (n%2 == 0) subTrackMyPow(x*x,n/2) else subTrackMyPow(x*x,(n-1)/2)*x
            n < -1 -> if (n%2 == 0) subTrackMyPow(x*x,n/2) else subTrackMyPow(x*x,(n+1)/2)*x
            else -> x
        }
    }

    /**
     * 93. ?????? IP ??????
     * 25525511135   255.255.11.135   255.255.111.35
     */
    fun restoreIpAddresses(s: String): List<String> {
        val result = arrayListOf<String>()
        backTrackRestoreIpAddresses(s,0,0,result)
        return result
    }

    /**
     * ??????
     * @param index ????????????????????????  ?????????.?????????????????????????????????????????????
     * @param point ???.????????????  ??????ip?????????????????????  ?????????.???????????????????????????result??? ??????????????????????????????
     */
    private fun backTrackRestoreIpAddresses(s: String, index: Int, point:Int, result: ArrayList<String>){
        //????????????
        if (point == 3){
            //????????????index???s????????????????????????ip?????????
            if (isValidIp(s,index,s.length-1)){
                result.add(s)
            }
            return
        }
        //??????????????????????????????  ?????????
        var newP = point
        //?????????????????????s  ?????????
        val sb = StringBuilder()
        for (i in index until s.length){
            //??????????????? ??????StringBuilder??????
            sb.clear()
            if (isValidIp(s,index,i)){
                //????????????
                sb.append(s.substring(0,i+1)).append(".").append(s.substring(i+1))
                newP++
                //???????????????????????????????????????  ?????????????????????????????????index??????2
                backTrackRestoreIpAddresses(sb.toString(),i+2,newP,result)
                //??????
                newP--
                sb.deleteCharAt(i+1)
            }
        }
    }

    /**
     * ???????????????ip??????????????????
     * ???????????????
     * 1???0??????????????????0?????????
     * 2????????????????????????
     * 3????????????????????????255
     */
    private fun isValidIp(s: String,startIndex: Int,endIndex: Int): Boolean{
        if (startIndex > endIndex) return false
        if (s[startIndex] == '0' && startIndex != endIndex) return false
        var tm = 0
        for (i in startIndex .. endIndex){
            if (s[i] < '0' || s[i] > '9') return false
            tm = (tm*10).plus(s[i]-'0')
            if (tm > 255) return false
        }
        return true
    }

    /**
     * 95. ???????????????????????? II
     * ????????????????????????
     *      ?????? ?????????????????????????????????????????????????????????????????????????????????
     *      ?????? ?????????????????????????????????????????????
     */
    fun generateTrees(n: Int): List<TreeNode?> {
        return backTrackGenerateTrees(0,n)
    }

    private fun backTrackGenerateTrees(start: Int,end: Int): ArrayList<TreeNode?>{
        val result = arrayListOf<TreeNode?>()
        if (start > end){
            result.add(null)
            return result
        }
        //?????????????????????
        for (i in start .. end){
            val subLeftTree = backTrackGenerateTrees(start,i-1)
            val subRightTree = backTrackGenerateTrees(i+1,end)
            subLeftTree.forEach { l ->
                subRightTree.forEach { r ->
                    val subHeadTree = TreeNode(i)
                    subHeadTree.left = l
                    subHeadTree.right = r
                    result.add(subHeadTree)
                }
            }
        }
        return result
    }

    /**
     * 96. ????????????????????????
     */
//    fun numTrees(n: Int): Int {
//        return backTrackNumTrees(1,n)
//    }
//
//    private fun backTrackNumTrees(start: Int,end: Int): Int{
//        if (start > end){
//            return 1
//        }
//        for (i in start .. end){
//            return backTrackNumTrees(start,i-1) + backTrackNumTrees(i+1,end)
//        }
//        return 1
//    }

    /**
     * 97. ???????????????
     */
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s3.length != s1.length+s2.length) return false
        val l1 = s1.length
        val l2 = s2.length
        val dp = Array(l1+1){ BooleanArray(l2+1) }
        dp[0][0] = true
        //s2??????????????????
        for (i in 1 .. l1){
            dp[i][0] = dp[i-1][0] && s1[i-1] == s3[i-1]
        }
        //s1??????????????????
        for (j in 1 .. l2){
            dp[0][j] = dp[0][j-1] && s2[j-1] == s3[j-1]
        }

        for (m in 1 .. l1){
            for (n in 1 .. l2){
                dp[m][n] = (dp[m-1][n] && s1[m-1] == s3[m-1+n]) || (dp[m][n-1] && s2[n-1] == s3[n-1+m])
            }
        }
        return dp[l1][l2]
    }

    /**
     * 99. ?????????????????????
     */
    fun recoverTree(root: TreeNode?): Unit {
        val root1 = TreeNode(1)
        val node1 = TreeNode(3)
        val node2 = TreeNode(2)
        root1.left = node1
        root1.right = null
        node1.left = null
        node1.right = node2
        val middleOrderResult = middleOrder4Tree(root1)
        middleOrderResult.forEach {
            print("$it ")
        }
    }

    fun middleOrder4Tree(root: TreeNode?): List<Int?>{
        val result = arrayListOf<Int?>()
        if (root == null){
            result.add(null)
        }else{
            result.add(root.`val`)
            result.addAll(middleOrder4Tree(root.left))
            result.addAll(middleOrder4Tree(root.right))
        }
        return result
    }

    private fun dfsRecoverTree(head: TreeNode?,){

    }

    /**
     * 103. ?????????????????????????????????
     */
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val result = ArrayList<ArrayList<Int>>()
        val subList = ArrayList<Int>()
        val queue = LinkedBlockingQueue<TreeNode?>()
        var levelCount = 0
        var levelIndex = 0
        queue.put(root)
        levelCount = queue.size
        while (queue.isNotEmpty()){
            if (levelCount != 0){
                levelCount--
                val node = queue.poll()
                if (node != null){
                    subList.add(node.`val`)
                }
                if (node?.left != null){
                    queue.put(node.left)
                }
                if (node?.right != null){
                    queue.put(node.right)
                }
            }else{
                levelCount = queue.size
                levelIndex++
                val tmList = ArrayList<Int>()
                tmList.addAll(subList)
                if (levelIndex%2 == 0){
                    tmList.reverse()
                }
                result.add(tmList)
                subList.clear()
            }
        }
        if (subList.size != 0){
            if (levelIndex%2 == 0){
                subList.reverse()
            }
            result.add(subList)
        }
        return result
    }

    /**
     * 107. ???????????????????????? II
     */
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val result = ArrayList<ArrayList<Int>>()
        val subList = ArrayList<Int>()
        val queue = LinkedBlockingQueue<TreeNode>()
        queue.put(root)
        while (queue.isNotEmpty()){
            var levelCount = queue.size
            while (levelCount > 0){
                levelCount--
                val node = queue.poll()
                subList.add(node.`val`)
                if (node?.left != null){
                    queue.put(node.left)
                }
                if (node?.right != null){
                    queue.put(node.right)
                }
            }
            val tm = ArrayList<Int>()
            tm.addAll(subList)
            subList.clear()
            result.add(0,tm)
        }
        return result
    }

    /**
     * 109. ?????????????????????????????????
     * ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
     */
    fun sortedListToBST(head: ListNode?): TreeNode? {
        if (head == null) return null
        var node = head
        val nodeList = arrayListOf<Int?>()
        while (node != null){
            nodeList.add(node.n)
            node = node.next
        }
        return recursionSortedListToBST(nodeList,0,nodeList.size-1)
    }

    private fun recursionSortedListToBST(nodeList: ArrayList<Int?>,start: Int,end: Int): TreeNode?{
        val midIndex = (start+end)/2
        val midValue = nodeList[midIndex]
        val head = if (midValue != null) TreeNode(midValue) else null
        if (midIndex > 0 && midIndex-1 >= start){
            head?.left = recursionSortedListToBST(nodeList,start,midIndex-1)
        }
        if (midIndex < nodeList.size-1 && midIndex+1 <= end){
            head?.right = recursionSortedListToBST(nodeList,midIndex+1,end)
        }
        return head
    }

    /**
     * 109. ?????????????????????????????????
     * ??????????????????????????????????????????????????????????????????????????????????????????2??????????????????1????????????????????????????????????????????????????????????????????????
     * ???????????????????????????????????????????????????????????????
     */
    fun sortedListToBST2(head: ListNode?): TreeNode? {
        if (head == null) return null
        var fast = head
        val newHead = head
        var slow = head
        var pre = newHead
        while (fast?.next != null){
            fast = fast.next?.next
            pre = slow
            slow = slow?.next
        }
        if (fast == slow) return TreeNode(head.n!!)
        val headTree = if (slow != null) TreeNode(slow.n!!) else null
        if (headTree != null){
            headTree.right = sortedListToBST2(slow?.next)
            pre?.next = null
            headTree.left = sortedListToBST2(newHead)
        }
        return headTree
    }

    /**
     * 110. ???????????????
     */
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        val leftHeight = dfsIsBalanced(root.left)
        val rightHeight = dfsIsBalanced(root.right)
        return if (Math.abs(leftHeight - rightHeight) > 1) false
        else isBalanced(root.left) && isBalanced(root.right)//???????????????????????? ?????????????????????????????????????????????????????? ????????????????????? ?????????????????????????????????
    }

    /**
     * ??????????????????????????????????????????
     */
    private fun dfsIsBalanced(root: TreeNode?): Int{
        if (root == null) return 0
        return dfsIsBalanced(root.left).coerceAtLeast(dfsIsBalanced(root.right))+1
    }

    /**
     * 111. ????????????????????????
     */
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null) return 1
        if (root.left == null && root.right != null) return minDepth(root.right)+1
        if (root.left != null && root.right == null) return minDepth(root.left)+1
        return minDepth(root.left).coerceAtMost(minDepth(root.right))+1
    }

    /**
     * 113. ???????????? II
     */
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        if (root == null) return emptyList()
        val result = arrayListOf<ArrayList<Int>>()
        val subList = arrayListOf<Int>()
        dfsPathSum(root, targetSum, subList, result)
        return result
    }

    /**
     * ??????????????????
     * @param root ????????????????????????
     * @param targetSum ??????????????????????????????  ?????????????????????????????????????????????
     * @param subList ???????????????????????????  ???????????????????????????????????????
     * @param result ????????????????????????
     */
    private fun dfsPathSum(root: TreeNode?,targetSum: Int,subList: ArrayList<Int>,result: ArrayList<ArrayList<Int>>){
        if (root == null) return
        if (targetSum == root.`val` && root.left == null && root.right == null){
            subList.add(root.`val`)
            val tm = arrayListOf<Int>()
            tm.addAll(subList)
            //?????????????????????????????????????????????????????????????????????????????????
            if (subList.size > 1){
                subList.removeAt(subList.size-1)
            }
            result.add(tm)
        }else {
            subList.add(root.`val`)
            dfsPathSum(root.left,targetSum-root.`val`,subList, result)
            dfsPathSum(root.right,targetSum-root.`val`,subList, result)
            //????????????????????????????????????????????????
            if (subList.size > 1){
                subList.removeAt(subList.size-1)
            }
        }
    }

    /**
     * 100. ????????????
     */
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p != null && q == null) return false
        if (p == null && q != null) return false
        if (p?.`val` != q?.`val`) return false
        return isSameTree(p?.left,q?.left) && isSameTree(p?.right,q?.right)
    }

    /**
     * 114. ????????????????????????
     */
    fun flatten(root: TreeNode?): Unit {
        if (root == null) return
        val stack = Stack<TreeNode>()
        stack.push(root)
        dfsForFillStack(root.left,stack)
        dfsForFillStack(root.right,stack)
        var tailNode = stack.pop()
        while (!stack.isEmpty()){
            val tm = stack.pop()
            tm.left = null
            tm.right = tailNode
            tailNode = tm
        }
        root.right = tailNode.right
    }

    private fun dfsForFillStack(root: TreeNode?,stack: Stack<TreeNode>){
        if (root == null) return
        stack.push(root)
        dfsForFillStack(root.left,stack)
        dfsForFillStack(root.right,stack)
    }

    /**
     * 115. ??????????????????
     */
    fun numDistinct(s: String, t: String): Int {
        val result = arrayListOf<ArrayList<String>>()
        backtraceNumDistinct(s,0, arrayListOf(),result)
        var count = 0
        result.forEach { arr ->
            val sb = StringBuilder()
            arr.forEach {
                sb.append(it)
            }
            if (sb.toString() == t){
                count+=1
            }

        }
        return count
    }

    private fun backtraceNumDistinct(s: String,index: Int,subList: ArrayList<String>,result: ArrayList<ArrayList<String>>){
        result.add(ArrayList(subList))
        for (i in index until s.length){
            subList.add(s[i].toString())
            backtraceNumDistinct(s, i+1, subList, result)
            subList.removeAt(subList.size-1)
        }
    }

    class Node(var `val`: Int){
        var left: Node? = null
        var right: Node? = null
        var next: Node? = null
    }

    /**
     * 116. ????????????????????????????????????????????????
     */
    fun connect(root: Node?): Node? {
        if (root?.left == null) return root
        root.left?.next = root.right
        root.right?.next = root.next?.left
        connect(root.left)
        connect(root.right)
        return root
    }

    /**
     * 117. ???????????????????????????????????????????????? II
     */
    fun connect2(root: Node?): Node? {
        if (root == null) return null
        reverseConnect2(root,null)
        //???????????????????????????root??????????????????????????????root.left???root.right??????
        connect2(root.left)
        connect2(root.right)
        return root
    }

    /**
     * ??????????????????????????????
     * @param root ????????????????????? ????????????????????????????????? ?????????????????????next??????????????? ?????????null
     * @param lastNode ??????????????????next????????????????????? ????????????????????????????????? ????????????????????????????????? ?????????null
     */
    private fun reverseConnect2(root: Node?,lastNode: Node?){
        if (root == null) return
        if (root.left != null){
            //???????????????????????????null????????????????????????next?????????????????????????????????
            lastNode?.next = root.left
            if (root.right != null){
                //??????????????????null????????????next?????????????????????
                root.left?.next = root.right
                //???????????????????????????root.next?????????????????????????????????????????????next????????????????????????root.right
                reverseConnect2(root.next,root.right)
            }else{
                //????????????null???????????????????????????(root.next)???????????????next????????????????????????root.left
                reverseConnect2(root.next,root.left)
            }
        }else{
            if (root.right != null){
                //????????????????????????null?????????????????????null????????????????????????next?????????????????????(lastNode)????????????
                lastNode?.next = root.right
                //???????????????????????????????????????????????????next????????????????????????root.right
                reverseConnect2(root.next,root.right)
            }else{
                //??????????????????????????????null????????????????????????lastNode?????????
                reverseConnect2(root.next,lastNode)
            }
        }

    }

    /**
     * 129. ????????????????????????????????????
     */
    fun sumNumbers(root: TreeNode?): Int {
        val strList = arrayListOf<String>()
        backTraceSumNumbers(root,StringBuilder(),strList)
        var result = "0"
        strList.forEach {
            result = addStrings(result,it)
        }
        return result.toInt()
    }

    private fun backTraceSumNumbers(root: TreeNode?,str: StringBuilder,strList: ArrayList<String>){
        if (root == null) return
        if (root.left == null && root.right == null){
            val s = str.append(root.`val`)
            strList.add(s.toString())
            str.deleteCharAt(str.length-1)
            return
        }
        backTraceSumNumbers(root.left,str.append(root.`val`),strList)
        str.deleteCharAt(str.length-1)
        backTraceSumNumbers(root.right,str.append(root.`val`),strList)
        str.deleteCharAt(str.length-1)
     }

    fun sumNumbers2(root: TreeNode?): Int {
        return reverseSumNumbers(0,root)
    }

    private fun reverseSumNumbers(result: Int,root: TreeNode?): Int{
        if (root == null) return 0
        val tm = result*10+root.`val`
        if (root.left == null && root.right == null) return tm
        return reverseSumNumbers(tm,root.left)+reverseSumNumbers(tm,root.right)
    }

    /**
     * 912. ????????????
     * ???????????????
     * 73,22,93,43,55,14,28,65,39,181
     */
    fun sortArray(nums: IntArray): IntArray {
        val bucket = Array(21){IntArray(nums.size)}//?????????????????? ???????????????21  ???10????????????9-0????????? ???11????????????20????????????0-9????????? ??????????????????????????????????????????????????????
        val counts = IntArray(21)//????????????????????????????????????????????????  ?????????????????????????????????????????????????????????
        var maxLength = 0 //????????????????????????????????????
        var index = 0 //???????????????????????????????????????????????????0?????????
        /*
         * ???????????????????????????????????? maxLength ????????????????????????????????????????????????????????????
         * bucket??????????????? ???bucket????????????????????????????????????????????????
         */
        for (i in nums.indices){
            maxLength = maxLength.coerceAtLeast(if (nums[i] >= 0) nums[i].toString().length else nums[i].toString().length-1)
            bucket.last()[i] = nums[i]
        }
        //???????????? ??????????????????????????????????????????????????????
        for (i in 0 until maxLength){
            //???????????? ????????????????????????
            for (j in bucket.last().indices){
                //????????????????????????????????????????????? ??????????????????bucket????????????????????? ????????????????????????????????? ??????????????????????????? ??????????????????????????????bucket???????????????
                if ((if (bucket.last()[j] < 0) bucket.last()[j].toString().length-1 else bucket.last()[j].toString().length) < i+1){
                    if (bucket.last()[j] < 0){
                        bucket[9][counts[9]] = bucket.last()[j]
                        //??????????????????
                        counts[9]+=1
                    }else{
                        bucket[10][counts[10]] = bucket.last()[j]
                        //??????????????????
                        counts[10]+=1
                    }
                }else{//?????????????????????????????????????????????????????????????????? ???????????????0???9??????????????? ?????????????????????0-9?????????
                    val tmIndex = bucket.last()[j].toString().length - i - 1
                    val numBit = bucket.last()[j].toString()[tmIndex]-'0'
                    if (bucket.last()[j] < 0){
                        bucket[9-numBit][counts[9-numBit]] = bucket.last()[j]
                        //????????????????????????
                        counts[9-numBit]+=1
                    }else{
                        bucket[10+numBit][counts[10+numBit]] = bucket.last()[j]
                        //????????????????????????
                        counts[10+numBit]+=1
                    }
                }
            }
            //?????????????????????
            index = 0
            //???????????????????????????????????????????????????????????????  ????????????????????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????
            for (m in counts.indices){
                for (n in 0 until counts[m]){
                    bucket.last()[index] = bucket[m][n]
                    index++
                }
                counts[m] = 0
            }
            bucket.forEach {
                it.forEach { num ->
                    print("$num ")
                }
                println()
            }
            println("----------------------")
        }
        return bucket.last()
    }
    fun randPoint(): DoubleArray {
//        val a = getRandom(x_center-radius,x_center+radius)
//        val b = getRandom(y_center-radius,y_center+radius)
//        return if(a*a+b*b <= radius*radius) doubleArrayOf(a,b) else randPoint()
        for (i in 0 until 10){
            println(Math.random()*3)
        }
        return doubleArrayOf()
    }

    private fun getRandom(min: Double,max: Double): Double{
        val random = Random.Default
        random.nextInt()
        return random.nextDouble(max)%(max-min+1)+min
    }

    /**
     * 391. ????????????
     * ??????????????????????????????????????????
     * ??????????????????
     * 1????????????????????????????????????????????????????????????????????????????????????
     * 2?????????????????????????????????????????????????????????????????????
     * 3?????????????????????????????????????????????????????????????????????
     * ????????????????????????????????????????????????????????????X???Y???????????????????????????????????????????????????????????????????????????X???Y?????????????????????
     * ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
     */
    fun isRectangleCover(rectangles: Array<IntArray>): Boolean {
        //???????????????
        val vertexArray = arrayListOf<IntArray>()
        //?????????????????????
        var subS = 0
        //?????????????????? ????????????X???Y????????????????????? ?????????????????????Int.MAX_VALUE
        val lb = IntArray(2){Int.MAX_VALUE}
        //?????????????????? ????????????X???Y????????????????????? ?????????????????????Int.MIN_VALUE
        val rt = IntArray(2){Int.MIN_VALUE}
        //??????????????????????????????????????????????????????????????????
        val lt = IntArray(2)
        //??????????????????????????????????????????????????????????????????
        val rb = IntArray(2)
        //??????????????????  1??????????????????????????????  2??????????????????????????????  3????????????????????????????????????
        rectangles.forEach {
            val p1 = intArrayOf(it[0],it[1])
            val p2 = intArrayOf(it[2],it[3])
            val p3 = intArrayOf(it[0],it[3])
            val p4 = intArrayOf(it[2],it[1])

            val tmArray = arrayListOf(p1,p2,p3,p4)
            //1??????????????????????????????
            tmArray.forEach { p ->
                val indexArray = arrayListOf<Int>()
                //?????????????????????????????????????????????????????? ???????????????????????????????????????index
                for (i in vertexArray.indices){
                    if (vertexArray[i][0] == p[0] && vertexArray[i][1] == p[1]){
                        indexArray.add(i)
                    }
                }
                //????????????????????????vertexArray????????????????????????vertexArray????????? ????????????????????????
                if (indexArray.isEmpty()){
                    vertexArray.add(p)
                }else{
                    indexArray.forEach { index ->
                        vertexArray.removeAt(index)
                    }
                }
            }
            //2??????????????????????????????
            subS+=(it[3]-it[1])*(it[2]-it[0])
            //3????????????????????????????????????
            lb[0] = lb[0].coerceAtMost(it[0])
            lb[1] = lb[1].coerceAtMost(it[1])
            rt[0] = rt[0].coerceAtLeast(it[2])
            rt[1] = rt[1].coerceAtLeast(it[3])
        }
        val theoryW = rt[1]-lb[1]
        val theoryL = rt[0]-lb[0]
        val theoryS = theoryL*theoryW
        //1????????????????????????????????????????????????????????????????????????????????????
        if (theoryS != subS) return false
        //2?????????????????????????????????????????????????????????????????????
        if (vertexArray.size != 4) return false
        //3?????????????????????????????????????????????????????????????????????
        lt[0] = lb[0]
        lt[1] = rt[1]
        rb[0] = rt[0]
        rb[1] = lb[1]
        val theoryArray = arrayListOf(lb,rt,lt,rb)
        a@for (i in vertexArray.indices){
            b@for (j in theoryArray.indices){
                if (vertexArray[i][0] == theoryArray[j][0] && vertexArray[i][1] == theoryArray[j][1]){
                    continue@a
                }
            }
            return false
        }
        //????????????????????????????????????????????????????????????????????????
        return true
    }

    /**
     * 1051. ???????????????
     */
    fun heightChecker(heights: IntArray): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        heights.forEach {
            min = min.coerceAtMost(it)
            max = max.coerceAtLeast(it)
        }
        val countArray = IntArray(max-min+1)
        heights.forEach {
            countArray[it-min] = countArray[it-min]+1
        }
        var start = 0
        var result = 0
        for (i in countArray.indices) {
            for (j in start until start + countArray[i]) {
                if (i+min != heights[j]){
                    result+=1
                }
            }
            start += countArray[i]

        }
        return result
    }

    /**
     * 1122. ?????????????????????
     */
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        arr1.forEach {
            min = min.coerceAtMost(it)
            max = max.coerceAtLeast(it)
        }
        val countArray = IntArray(max-min+1)
        arr1.forEach {
            countArray[it-min]+=1
        }
        val result = IntArray(arr1.size)
        var index = 0
        arr2.forEach {
            for (i in 0 until countArray[it-min]){
                result[index] = it
                index++
            }
            countArray[it-min] = 0
        }
        for (i in countArray.indices){
            for (j in 0 until countArray[i]){
                result[index] = i+min
                index++
            }
        }
        return result
    }

    /**
     * 164. ????????????
     * 3,36,49,51,3,2,222,45,21,63
     */
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) return 0
        var maxLength = 1
        nums.forEach {
            if (it >= Math.pow(10.0,maxLength.toDouble())){
                maxLength = it.toString().length
            }
        }
        val bucket = Array(11){IntArray(nums.size)}
        val count = IntArray(11)
        for (i in nums.indices){
            bucket[10][i] = nums[i]
        }
        for (i in maxLength-1 downTo 0){
            for (m in count.indices){
                count[m] = 0
            }
            for (j in bucket[10].indices){
                val tm = if (i + bucket[10][j].toString().length >= maxLength) bucket[10][j].toString()[i-maxLength+bucket[10][j].toString().length]-'0' else 0
                bucket[tm][count[tm]] = bucket[10][j]
                count[tm]+=1
            }
            for (a in 0 until count.size-1){
                for (b in 0 until count[a]){
                    bucket[10][count[10]] = bucket[a][b]
                    count[10]+=1
                }
            }
        }
        var result = 0
        for (i in bucket[10].indices){
            if (i == 0) continue
            result = result.coerceAtLeast(bucket[10][i]-bucket[10][i-1])
        }
        return result
    }

    /**
     * 347. ??? K ???????????????
     */
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int,Int>()
        val result = IntArray(k)
        var index = 0
        for (i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
        }
        if (k > map.size/2){
            var min = Int.MAX_VALUE
            var minIndex = 0
            for (m in 0 until map.size-k) {
                map.keys.forEach {
                    if (map[it]!! <= min) {
                        min = map[it] ?: 0
                        minIndex = it
                    }
                }
                map.remove(minIndex)
                min = Int.MAX_VALUE
            }
            map.keys.forEach {
                result[index++] = it
            }
        }else{
            var max = Int.MIN_VALUE
            var maxIndex = 0
            for (n in 0 until k){
                map.keys.forEach {
                    if (map[it]!! >= max){
                        max = map[it]?:0
                        maxIndex = it
                    }
                }
                map.remove(maxIndex)
                result[index++] = maxIndex
                max = Int.MIN_VALUE
            }
        }
        return result
    }

    /**
     * 347. ??? K ???????????????
     * ?????????
     */
    fun topKFrequent2(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int,Int>()
        val result = IntArray(k)
        var index = 0
        var maxCount = 0
        for (i in nums.indices){
            map[nums[i]] = map.getOrDefault(nums[i],0)+1
            maxCount = maxCount.coerceAtLeast(map[nums[i]]!!)
        }
        val buckets = Array(maxCount){ arrayListOf<Int>() }
        map.keys.forEach {
            buckets[map[it]!!-1].add(it)
        }
        for (i in buckets.size-1 downTo 0){
            for (j in buckets[i].indices){
                result[index++] = buckets[i][j]
                if (index == k) break
            }
            if (index == k) break
        }
        return result
    }

    /**
     * 451. ??????????????????????????????
     */
    fun frequencySort(s: String): String {
        val map = HashMap<Char,Int>()
        val sb = StringBuilder()
        s.forEach {
            map[it] = map.getOrDefault(it,0)+1
        }
        var maxCount = 0
        var maxChar = '0'
        for (i in map.keys.indices){
            map.keys.forEach {
                if (maxCount < map[it]!!){
                    maxCount = map[it]!!
                    maxChar = it
                }
            }
            for (j in 0 until maxCount){
                sb.append(maxChar)
            }
            maxCount = 0
            map.remove(maxChar)
        }
        return sb.toString()
    }

    /**
     * 451. ??????????????????????????????
     * ?????????
     */
    fun frequencySort2(s: String): String {
        val map = HashMap<Char,Int>()
        val sb = StringBuilder()
        var maxCount = 0
        s.forEach {
            map[it] = map.getOrDefault(it,0)+1
            maxCount = maxCount.coerceAtLeast(map[it]?:0)
        }
        val buckets = Array(maxCount){ArrayList<Char>()}
        map.keys.forEach {
            buckets[map[it]!!-1].add(it)
        }
        for (i in buckets.size-1 downTo 0){
            if (buckets[i].isNotEmpty()){
                buckets[i].forEach {
                    for (j in 0 until i+1){
                        sb.append(it)
                    }
                }
            }
        }
        return sb.toString()
    }

    /**
     * 692. ???K???????????????
     */
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = HashMap<String,Int>()
        var maxCount = 0
        words.forEach {
            map[it] = map.getOrDefault(it,0)+1
            maxCount = maxCount.coerceAtLeast(map[it]!!)
        }
        val buckets = Array(maxCount){ arrayListOf<String>()}
        map.keys.forEach {
            buckets[map[it]!!-1].add(it)
        }
        var count = 0
        val result = arrayListOf<String>()
        for (i in buckets.size-1 downTo 0){
            buckets[i].sort()
            for (j in buckets[i].indices){
                result.add(buckets[i][j])
                count++
                if (count == k) break
            }
            if (count == k) break
        }
        return result
    }

    fun testZeroEvenOdd(){
        val zeroEvenOdd = ZeroEvenOdd(3)
        thread { zeroEvenOdd.zero() }
        thread { zeroEvenOdd.even() }
        thread { zeroEvenOdd.odd() }
    }

    fun testFizzBuzz(){
        val fizzBuzz = FizzBuzz(15)
        thread { fizzBuzz.fizz {  } }
        thread { fizzBuzz.buzz {  } }
        thread { fizzBuzz.fizzbuzz {  } }
        thread { fizzBuzz.number {  } }
    }

    fun testCombinationIterator(){
        val iterator = CombinationIterator("abc",2)
        println(iterator.next())
        println(iterator.hasNext())
        println(iterator.next())
        println(iterator.hasNext())
        println(iterator.next())
        println(iterator.hasNext())
    }


    /**
     * 215. ???????????????K???????????????
     */
    fun findKthLargest(nums: IntArray, k: Int): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        nums.forEach {
            min = min.coerceAtMost(it)
            max = max.coerceAtLeast(it)
        }
        val countArray = IntArray(max-min+1)
        nums.forEach {
            countArray[it-min] += 1
        }

        if (nums.size/2 > k){//k???nums????????? ??????????????????
            var index = k
            for (i in countArray.size-1 downTo 0){
                index -= countArray[i]
                if (index <= 0) return i+min
            }
        }else{//k???nums?????????  ????????????
            var index = nums.size-k
            for (i in countArray.indices){
                index -= countArray[i]
                if (index < 0) return i+min
            }
        }
        return 0
    }
}