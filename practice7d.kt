fun main() {
    var n = readLine()!!.toInt()
 
    val numbers = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var ans = 0
    for (i in 0..n-1) {
        if (i%2 != 0) continue
        ans = ans + numbers[i + 1] - numbers[i]
    }
    println(ans)
}
