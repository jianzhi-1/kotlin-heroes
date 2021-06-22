fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        var (n, k) = readLine()!!.split(" ").map { it.toInt() }
        loop@ while (n > 0) {
            for (i in 1..k) {
                print((i + 96).toChar())
                n = n - 1
                if (n == 0) break@loop
            }
        }
        print("\n")
    }
}
