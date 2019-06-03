import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    repeat(n) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = minOf(a, b)
        val d = maxOf(a, b)
        println("${c - 1} ${d - c + 1} 1")
    }
}
