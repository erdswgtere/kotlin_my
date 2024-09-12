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
    println("Введите величины a и b для создания второго вектора со смещение по OX и OY: ")
    print("Введите a: ")
    val a = readln().toFloat()
    print("Введите b: ")
    val b = readln().toFloat()
    val twoVec =  TwoBeginVectors(x1, y1, x2, y2, a, b)
    twoVec.parallelogramSquare()
    println("Координаты середины двух векторов: ")
    twoVec.middleVectorCord()
}
open class VectorOnPlane(val x1: Float, val y1: Float, val x2: Float, val y2: Float){
   open fun middleVectorCord(){
        val nX = (x1 + x2) / 2
        val nY = (y1 + y2) / 2
        println("Координаты середины вектора равны: $nX, $nY")
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
class TwoBeginVectors(x1: Float, y1: Float, x2: Float, y2: Float, val a: Float, val b: Float):VectorOnPlane(x1, y1, x2, y2){
    fun parallelogramSquare(){
        val proiz = x1 * a * x1 + y1 * b * y1 + x2 * a * x2 + y2 * b * x2
        val len1 = sqrt(x1.pow(2)+y1.pow(2)+x2.pow(2)+y2.pow(2))
        val len2 = sqrt( a * x1.pow(2)+ b * y1.pow(2)+a * x2.pow(2)+ b * y2.pow(2))
        val cosines = proiz / (len1 * len2)
        val sinus = 1 - cosines.pow(2)
        val s = len1 * len2 * sinus
        println("Площадь параллелограмма равна: $s")
    }

    override fun middleVectorCord() {
        super.middleVectorCord()
        val nX2 = (a*x1 + a * x2) / 2
        val nY2 = (b*y1 + b * y2) / 2
        println("Координаты середины второго вектора равны: $nX2, $nY2")
    }
}