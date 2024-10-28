package kotlin.Lv1

class 가운데글자가져오기 {
    fun solution(s: String): String {
        val answer = if(s.length % 2 == 0) {
            s.substring(s.length / 2 - 1, s.length / 2 + 1)
        } else {
            s.substring(s.length / 2, s.length / 2 + 1)
        }
        return answer
    }
}