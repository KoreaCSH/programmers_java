package kotlin.Lv1

class 하샤드수 {
    fun solution(x: Int): Boolean {
        var sum: Int = 0;
        val xStr = x.toString()

        for(i:Char in xStr.toCharArray()) {
            sum += (i - '0')
        }

        var answer = (x % sum == 0)
        return answer
    }
}