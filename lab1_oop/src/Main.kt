import kotlin.math.PI
import kotlin.math.atan
import kotlin.math.atan2

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
    }
}
class two_begin_vectors