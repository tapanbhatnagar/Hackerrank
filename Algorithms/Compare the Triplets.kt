import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var numOfPos = 0
    var numOfNeg = 0
    var size = arr.size

    arr.forEach { i ->
        run {
            if (i > 0) {
                numOfPos++
            }
            if (i < 0) {
                numOfNeg++
            }
        }
    }

    var rem = size - numOfNeg - numOfPos
    println(String.format("%.6f",(numOfPos.toDouble()/size)))
    println(String.format("%.6f",(numOfNeg.toDouble()/size)))
    print(String.format("%.6f",(rem.toDouble()/size)))

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
