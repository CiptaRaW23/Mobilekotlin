
fun main(args: Array<String>) {
    biodata("Cipta Rangga Wijaya", 18)
    hobby("Mancing", "Saya lakukan pada saat liburan kuliah, hal yang paling seru saat memancing yaitu menunggu sambaran ikan")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("=====================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("=====================")
}

fun hobby(nama:String, desc:String){
    println("Hobby saya $nama")
    println("Hobby tersebut $desc")
}