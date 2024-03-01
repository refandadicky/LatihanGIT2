import kotlin.math.sqrt

class Triangle(val a: Double, val b: Double, val c: Double) {
    fun keliling(): Double {
        return a + b + c
    }
}

class TriangleArea(val a: Double, val t: Double) {
    fun luas(): Double {
        return 0.5 * a * t
    }
}

    class App {

    fun getAroundCircle(radius : Int){
        val myResult = 2*3.14*radius
        println("Around of circle is: $myResult")
    }

    fun getAreaCircle(radius : Int){
        val myResult = 3.14 * radius *radius
        println("Area of circle is: $myResult")
    }
    fun run(){
        val radius = 7
        getAreaCircle(radius)
        getAroundCircle(radius)
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        val segitiga = Triangle(3.0, 4.0, 5.0)
        val segitigaLuas = TriangleArea(3.0, 4.0)

        println("Keliling Segitiga: ${segitiga.keliling()}")
        println("Luas Segitiga: ${segitigaLuas.luas()}")
    }
    }
}