import kotlin.math.*


fun main() {
    println("Hello World!")
}
open class Vector_on_plane(val x1: Float, val y1: Float, val x2: Float, val y2: Float){
    open fun middle_vector_cord(){
        val n_x = x1 + x2 / 2
        val n_y = y1 + y2 / 2
        println("Кординаты середины вектора равны: $n_x,$n_y")
    }
    open fun definition_45degree(){
        val angel = atan((y2-y1)/(x2-x1))
        val u = angel * 180 / PI
        if(u.roundToInt() == 45){
            println("Угол наклона вектора равен $u градусам!")
        }
        else{
            println("Угол наклона вектора не равен 45 градусам!")
        }
    }
}
class two_begin_vectors(x1: Float, y1: Float, x2: Float, y2: Float, val a: Float, val b: Float):Vector_on_plane(x1, y1, x2, y2){
    fun parallelogram_square(){
        val proiz = x1 * a * x1 + y1 * a * y1 + x2 * a * x2 + y2 * a * x2
        val len1 = sqrt(x1.pow(2)+y1.pow(2)+x2.pow(2)+y2.pow(2))
        val len2 = sqrt(a * x1.pow(2)+ b * y1.pow(2)+a * x2.pow(2)+ b* y2.pow(2))
        val cosines = proiz / (len1 * len2)
        val sinus = 1 - cosines.pow(2)
        val S = len1 * len2 * sinus
        println("Площадь параллелограмма равна: $S")
    }
}