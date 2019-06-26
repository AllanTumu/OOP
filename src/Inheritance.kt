open class Oprations(){
    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    class Operand():Oprations(){
        fun mul(n1:Int,n2:Int):Int{
            return n1*n2
        }
        fun div(n1:Double,n2:Double):Double{
            return n1/n2
        }
    }
}

fun main (args:Array<String>){
    var op=Oprations()
    var sum=op.sum(30,50)
    var sub=op.sub(60,40)
    println("sum:" +sum)
    println("sub:" +sub)
    var op1=Oprations.Operand()
}