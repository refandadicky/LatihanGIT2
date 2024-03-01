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
        }
    }
}