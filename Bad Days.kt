fun main(args : Array<String>) {
    readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)
    var b = -1
    var c = -1
    var d = 0
    for (i in a) {
        if (c > i) {
            ++ d
        }
        if (b == -1) {
            b = i
        } else if (c == -1) {
            if (i > b) {
                c = b
                b = i
            } else {
                c = i
            }
        } else if (i > b) {
            c = b
            b = i
        } else if (i > c) {
            c = i
        }
    }
    println(d)
}
