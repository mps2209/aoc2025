package main.day2


class IdRangeChecker {
    @OptIn(ExperimentalUnsignedTypes::class)
    fun checkRange(start: Long, end: Long, part2: Boolean): LongArray {
        var result = longArrayOf();
        for (i in start..end) {
            if(if(part2)checkAdvancedNumber(i) else checkNumber(i)){
                result = longArrayOf(*result,i)
            }
        }
        return result;
    }

    fun checkNumber(number: Long): Boolean {
        val stringNumber = number.toString()
        if (stringNumber.length % 2 != 0) {
            return false;
        }
        if (stringNumber.subSequence(0, stringNumber.length / 2) == (stringNumber.subSequence(stringNumber.length / 2 ,stringNumber.length))
        ) {
            return true;
        }
        return false;
    }
    fun checkAdvancedNumber(number: Long): Boolean {
        val stringNumber = number.toString()
        for (i in 1..stringNumber.length) {
            if (i*2>stringNumber.length){
                return false;
            }
            if (stringNumber.subSequence(0,i).repeat(stringNumber.length/i) == stringNumber){
                return true;
            }
        }
        return false;
    }
}