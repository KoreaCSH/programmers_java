package kotlin.Lv1

class 이상한문자만들기 {

    fun solution(s: String): String {
        val sArray = s.split(" ")
        var answer = ""
        var index = 0

        for(str in sArray) {
            answer += createWeirdString(str)
            index++
            if(index != sArray.size) {
                answer += " "
            }
        }

        return answer
    }

    fun createWeirdString(str: String): String {
        val weirdString = StringBuilder()
        var index = 0
        for(ch in str) {
            if(index % 2 == 0) {
                weirdString.append(ch.uppercaseChar())
            } else {
                weirdString.append(ch.lowercaseChar())
            }
            index++
        }
        return weirdString.toString()
    }

}