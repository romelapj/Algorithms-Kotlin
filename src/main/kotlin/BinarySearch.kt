class BinarySearch {
    fun binarySearch(list: List<Int>, num: Int): Int {
        var low = 0
        var high = list.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            val guess = list[mid]
            if (guess == num) {
                return mid
            }
            if (guess < num) {
                low = mid + 1
            } else {
                high = mid - 1
            }

        }
        return -1
    }
}