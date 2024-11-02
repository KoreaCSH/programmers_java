package kotlin.Lv1

class 짝수와훌수 {

    fun solution(num: Int): String {
        var answer = if (num % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
        return answer
    }

}