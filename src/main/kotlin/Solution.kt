class Solution {
    fun intToRoman(num: Int): String {
        // map integer to romans
        val romans = arrayOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        // make the input number a var
        var n = num
        val result = StringBuilder()

        // go from the biggest numbers to 0
        for ((value, symbol) in romans) {
            while (n >= value) {
                result.append(symbol)
                n -= value
            }
        }

        return result.toString()
    }
}