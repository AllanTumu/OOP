class Laptop (var RAM:Int, var HD:String, var speed:Double, var processor:Int){

}

fun main (args:Array<String>){
    println("------HP Laptop--------")
    val hp = Laptop(8,"1TB",2.7,7)
    println("RAM:" +hp.RAM  )
    println("HARD DISK:" +hp.HD)
    println("Processor Speed:" +hp.speed)
    println("Processor:" +hp.processor)

    println("------Accer Laptop--------")
    val Accer = Laptop(512,"250GB",1.6,2)
    println("RAM:" +Accer.RAM  )
    println("HARD DISK:" +Accer.HD)
    println("Processor Speed:" +Accer.speed)
    println("Processor:" +Accer.processor)
}