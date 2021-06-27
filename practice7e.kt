fun main() {
    var n = readLine()!!.toInt()
 
    val numbers = readLine()!!.split(" ").map { it.toLong() }
    val numbersMap = mutableMapOf<Long,Long>()
    var tot:Long = 0
    
    for (i in 0..n-1){
        tot = tot + numbers[i].toLong()
        if (numbers[i].toLong() in numbersMap){
            numbersMap[numbers[i].toLong()] = (numbersMap[numbers[i].toLong()]!!).plus(1.toLong())
        } else {
            numbersMap.put(numbers[i].toLong(), 1)
        }
    }
    
    var ans = mutableListOf<Long>()
    var totans = 0
    
    for (i in 0..n-1){
        if ((tot - numbers[i].toLong()) % 2 != 0.toLong()) continue
        val temp:Long = (tot - numbers[i].toLong())/2
        if (temp != numbers[i].toLong()){
            if (!numbersMap.containsKey(temp)) continue
            if ((numbersMap[temp]!!).compareTo(1.toLong()) >= 0){
                ans.add((i+1).toLong())
                totans = totans + 1
            }
        } else {
            if (!numbersMap.containsKey(temp)) continue
            if ((numbersMap[temp]!!).compareTo(2.toLong()) >= 0){
                ans.add((i+1).toLong())
                totans = totans + 1
            }
        }
    }
    println(totans)
    var b = true
    for(element in ans){
        if (b) b = false
        else print(" ")
        print(element)  
    }
    
}
