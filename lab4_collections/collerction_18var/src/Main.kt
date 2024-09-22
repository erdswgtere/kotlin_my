fun main() {
    print("Введите количество элементов коллекции: ")
    val k = readln().toInt()
    println("Введите диапазон в котором будут генерироваться числа в коллекцию: ")
    print("Введите a: ")
    val a = readln().toInt()
    print("Введите b: ")
    val b = readln().toInt()
    val sol = Solution18Collection(k, a, b)
    sol.findlocalmax()

}
class Solution18Collection(private val k: Int, private val a: Int, private val b: Int){
    fun findlocalmax(){
        val x  = List(k){(a .. b).random()}
        val locals: MutableList<Int> = mutableListOf()

        for (i in 0..< x.count() - 1) {
            if (x[i] > x[i + 1] &&  x[i] > x[i - 1]) {
                locals.add(x[i])
            }
        }
        println("Исходный массив: ")
        println(x)
        println("Массив максимумов: ")
        println(locals)
        println("Количество локальных максимумов равно: ${locals.count()}")
    }
}