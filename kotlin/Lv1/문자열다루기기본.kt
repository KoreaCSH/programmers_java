package kotlin.Lv1

class 문자열다루기기본 {

    fun solution(s: String): Boolean {
        val sDigit = s.filter {it.isDigit()}
        return sDigit.length == s.length && (s.length == 4 || s.length == 6)
    }

}