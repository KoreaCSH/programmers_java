package kotlin.Lv1

class 크기가작은부분문자열 {

    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val pLength = p.length
        val tLength = t.length

        for (i in 0..tLength - pLength) {
            if (t.substring(i, i + pLength).toLong() <= p.toLong()) {
                answer++
            }
        }
        return answer
    }

}