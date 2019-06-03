fun main(args : Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1 .. n) {
        val a=readLine()!!
        val b=readLine()!!
        val c=a.length
        val d=b.length
        var x=0
        var y=0
        while(x < c && y < d){
            if (a[x] == b[y]){
                ++ x
                ++ y
                continue
            }
            if(a[x] == '+'){
                break
            }
            if(x == c - 1 || a[x + 1] != '-'){
                break
            }
            x += 2
            ++ y
        }
        if(x == c && y == d){
            println("YES")
        } else {
            println("NO")
        }
    }
}
