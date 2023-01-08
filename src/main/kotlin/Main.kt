fun main() {
    print("How many numbers: ")
    val count = readln().toInt()
    var sum = 0
    repeat(count) { index ->
        print("#${index + 1}: ")
        sum += readln().toInt()
    }

    println("Sum of these numbers is: $sum")
}