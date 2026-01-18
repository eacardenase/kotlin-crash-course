fun main() {
    var x = 17
    val y = 10

    val areBothNumbersEven = x % 2 == 0 && y % 2 == 0
    val isOneNumberEven = x % 2 == 0 || y % 2 == 0
    var shortcircuitExample = x % 2 == 0 || y % 2 == 0 && x + y == 30

    println("areBothNumbersEven: $areBothNumbersEven")
    println("isOneNumberEven: $isOneNumberEven")
    println("shortcircuitExample: $shortcircuitExample")
}