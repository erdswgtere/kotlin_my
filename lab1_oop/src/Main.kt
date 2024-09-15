import kotlin.math.*


fun main() {
    println("Введите координаты произвольного вектора на плоскости: ")
    print("Введите x1: ")
    val x1 = readln().toFloat()
    print("Введите y1: ")
    val y1 = readln().toFloat()
    print("Введите x2: ")
    val x2 = readln().toFloat()
    print("Введите y2: ")
    val y2 = readln().toFloat()
    val vectorPlaneCord = VectorOnPlane(x1, y1, x2, y2)
    vectorPlaneCord.middleVectorCord()
    vectorPlaneCord.definition45degree()
    println("Введите величины x3 и y3 для создания второго вектора: ")
    print("Введите x3: ")
    val a = readln().toFloat()
    print("Введите y3: ")
    val b = readln().toFloat()
    val twoVec =  twoBeginVectors(x1, y1, x2, y2, a, b)
    twoVec.parallelogram_square();
}
open class VectorOnPlane(val x1: Float, val y1: Float, val x2: Float, val y2: Float){
   open fun middleVectorCord(){
        val nX = (x1 + x2) / 2
        val nY = (y1 + y2) / 23
        println("Кординаты середины вектора равны: $nX, $nY")
    }
    open fun definition45degree(){
        val angel = atan((y2-y1)/(x2-x1))
        val u = angel * 180 / PI
        if(u.roundToInt() == 45){
            println("Угол наклона вектора равен ${u.roundToInt()} градусам!")
        }
        else{
            println("Угол наклона вектора не равен 45 градусам, а равен ${u.roundToInt()} градусов!")
        }
    }
}
class twoBeginVectors(x1: Float, y1: Float, x2: Float, y2: Float, val x3: Float, val y3: Float):VectorOnPlane(x1, y1, x2, y2){
    fun parallelogram_square(){
        val proiz = x1 * x1 + y1 * y1 + x2 * x3 + y2 * y3
        val len1 = sqrt(x1.pow(2)+y1.pow(2)+x2.pow(2)+y2.pow(2))
        val len2 = sqrt(x1.pow(2)+ y1.pow(2)+x3.pow(2)+ y3.pow(2))
        val cosines = proiz / (len1 * len2)
        val sinus = 1 - cosines.pow(2)
        val s = len1 * len2 * sinus
        println("Площадь параллелограмма равна: $s")
    }
}