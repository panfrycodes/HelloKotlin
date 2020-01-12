fun main() {
    var number = 100
    var i = 0

    while (number > 1) {
        println("$number / 2 = ${number / 2}")
        number /= 2
        i++
    }

    println("It takes $i times")
}
