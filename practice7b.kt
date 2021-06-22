fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (a, b, k) = readLine()!!.split(" ").map { it.toLong() }
        if (k%2==0.toLong()){
            println("${(a - b)*(k/2)}")
        } else {
            println("${(a - b)*(k/2) + a}")
        }
    }
}
