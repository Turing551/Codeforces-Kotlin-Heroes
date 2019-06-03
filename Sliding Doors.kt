import java.util.*;

fun main(args: Array<String>?){
	val sc=Scanner(System.`in`)
	val a=sc.nextInt()
	val b=sc.nextInt()
	val arr=IntArray(a)
	for(i in arr.indices){
		arr[i]=sc.nextInt()
	}
	val c=IntArray(arr.size)
	var d=0
	for(i in c.indices){
		d += arr[i]
		c[i]=d
	}
	val x=sc.nextInt()
	val y=StringBuilder()
	for(j in 0 until x){
		val n=sc.nextInt()
		val arr1=IntArray(n)
		for(i in arr1.indices){
			arr1[i]=sc.nextInt()
		}
		y.append(if (solve1(c, b, arr1)) "YES" else "NO").append("\n")
	}
	System.out.print(y)
	sc.close()
}

private fun solve1(c: IntArray?, b: Int, arr1: IntArray?): Boolean {
	val list=ArrayList<Int>()
	list.add(0)
	for(s in arr1!!){
		list.add(s)
	}
	list.add(b+1)
	val arr2=IntArray(list.size - 1)
	for(i in arr2.indices) {
		arr2[i] = list.get(i + 1) - list.get(i) - 1
	}
	var m = -1
	for(k in arr2){
		val temp = (if ((m == -1)) 0 else c!![m]) + k
		m=solve2(c,temp)
	}
	return m == c!!.size - 1
}

private fun solve2(c: IntArray?, temp: Int): Int {
	var ans=-1
	var p=0
	var q=c!!.size - 1
	while(p <= q) {
		val r = (p + q) / 2
		if(c[r] <= temp) {
			ans=r
			p=r+1
		}else{
			q=r-1
		}
	}
	return ans
}
