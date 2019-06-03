import java.util.ArrayList

fun main(args : Array<String>) {
    val x=readLine()!!.toInt()
    val y=readLine()!!.split(" ").map(String::toInt)
    var z=0
    for(i in y){
        if(i == -1) {
            ++ z
        }
    }
    val arr=Array(z){ArrayList<Int>()}
    val a=IntArray(z)
    val b=IntArray(z)
    for(j in 0 .. z - 1){
        a[j]=j+1
        b[j]=j-1
    }
    a[z-1]=0
    b[0]=z-1
    var temp=0
    for(j in 0 .. x - 1){
        if(y[j] == -1){
            val p=a[temp]
            if(b[temp] != -1){
                a[b[temp]]=a[temp]
            }
            if(a[temp] != z){
                b[a[temp]]=b[temp]
            }
            temp=p
        }else{
            arr[temp].add(y[j])
            temp=a[temp]
        }
    }
    println(z)
    for(j in 0 .. z - 1){
        val n=arr[j].size
        print(n)
        if(n>0){
            print(" ")
            print(arr[j].joinToString(" "))
        }
        println()
    }
}
