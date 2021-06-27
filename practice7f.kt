fun main() {
    var n = readLine()!!.toInt()
 
    var ans = mutableListOf<String>()
    val smap = mutableMapOf<String, Long>()
    var input = mutableListOf<String>()
    
    var p1 = ""
    var p2 = ""
    var s1 = ""
   	var s2 = ""
    
    for (i in 0..2*n-3){
        
        var x = readLine()!!
        input.add(x)
        if (smap.containsKey(x)){
            smap[x] = (smap[x]!!).plus(1)
        } else {
            smap[x] = 1
        }
        
        if (x.length == n - 1){
            if (p1.equals("")){
                p1 = x
            } else {
                p2 = x
            }
        }
    }
    
    s1 = p1 + p2.substring(p2.length - 1, p2.length)
    s2 = p2 + p1.substring(p1.length - 1, p1.length)
    
    //try s1 first
    val smap1 = mutableMapOf<String, Long>()
    for (i in 1..s1.length-1){
        var temp = s1.substring(0, i)
        if (smap1.containsKey(temp)){
            smap1[temp] = (smap1[temp]!!).plus(1)
        } else {
            smap1[temp] = 1
        }
    }
    for (i in 1..s1.length-1){
        var temp = s1.substring(i, s1.length)
        if (smap1.containsKey(temp)){
            smap1[temp] = (smap1[temp]!!).plus(1)
        } else {
            smap1[temp] = 1
        }
    }
    var b = true
    for ((k, v) in smap1){
        if (!smap.contains(k)){
            b = false
            break
        }
        if (smap[k] != v){
            b = false
            break
        }
        
    }
    
    val prefixmap = mutableMapOf<String, Long>()
    val suffixmap = mutableMapOf<String, Long>()
    
    if (b){
        for (i in 1..s1.length-1){
            var temp = s1.substring(0, i)
            if (prefixmap.containsKey(temp)){
                prefixmap[temp] = (prefixmap[temp]!!).plus(1)
            } else {
                prefixmap[temp] = 1
            }
        }
        for (i in 1..s1.length-1){
            var temp = s1.substring(i, s1.length)
            if (suffixmap.containsKey(temp)){
                suffixmap[temp] = (suffixmap[temp]!!).plus(1)
            } else {
                suffixmap[temp] = 1
            }
        }
        for (xx in input){
            if (prefixmap.containsKey(xx) && (prefixmap[xx]!!) != 0.toLong()){
                ans.add("P")
                prefixmap[xx] = (prefixmap[xx]!!).plus(-1)
            } else {
                ans.add("S")
            }
        }
        for (xx in ans){
            print(xx)
        }
        print("\n")
    } else {
        for (i in 1..s2.length-1){
            var temp = s2.substring(0, i)
            if (prefixmap.containsKey(temp)){
                prefixmap[temp] = (prefixmap[temp]!!).plus(1)
            } else {
                prefixmap[temp] = 1
            }
        }
        for (i in 1..s2.length-1){
            var temp = s2.substring(i, s2.length)
            if (suffixmap.containsKey(temp)){
                suffixmap[temp] = (suffixmap[temp]!!).plus(1)
            } else {
                suffixmap[temp] = 1
            }
        }
        for (xx in input){
            if (prefixmap.containsKey(xx) && (prefixmap[xx]!!) != 0.toLong()){
                ans.add("P")
                prefixmap[xx] = (prefixmap[xx]!!).plus(-1)
            } else {
                ans.add("S")
            }
        }
        for (xx in ans){
            print(xx)
        }
        print("\n")
    }
    
}
