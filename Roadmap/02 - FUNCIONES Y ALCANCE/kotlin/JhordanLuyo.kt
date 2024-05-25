// funciones basicas en kotlin


//variables globales
var global = 2
// funciones ya creadas ejemplo con variables globales
val name = "Jhordan"
fun main(){
    sumas()
    resta()
    suma1()
    println(resta1())
    println(suma2(4,55))
    nombrado("gisvel",30)
    valorPorDefecto()
    println(factorial(3))

    pruebaVariableGlobal()
    // funciones ya creadas ejemplo con variables globales
    println(global.toFloat())
    println(global.toString())
    println(name.length)
    print(extra("primero", "segundo"))



}

// funcion publica sin parametros y sin retorno(se reemplaza el Void por Unit)
// agregando el hecho que regrese Unit hace referencia a que nos puede devolver otra funcion
fun sumas(): Unit{
        //variable local

        val a = 1 
        val b = 2
    println("${a+b}")
}

//funcion publica sin parametros con retorno
fun resta():Int{
    val a = 2
    val b = 3
    return a+b
}

//funcion privada sin retorno y sin parametros
private fun suma1():Unit{
    println("funcion privada sin retorno y sin parametros")
}
//funcion privada con retorno y sin parametros
private fun resta1():String{
    return "funcion privada con retorno y con parametros"
}

// funcion con parametro y con retorno para hacer privada solo hace falta agrega la palabra "Private"
fun suma2(a:Int, b:Int):Int{
    return a + b
}

// funcion con argumentos nombrados
fun nombrado(name:String, age:Int){
    println("mi nombre es $name y mi edad es $age")
}

// funcion con argumentos nombrados con valor por defecto
fun valorPorDefecto( name:String = "jhordan",  age:Int = 31 ){
    return println("mi nombre es $name y mi edad es $age")
}


//funcion recurso si es posible utilizar un funcion dentro de otro 
//usando para obtener el factorial de un numero
fun factorial(numero:Int):Int{
    if(numero > 1){
        return numero*factorial(numero-1)
    }
    else   {
        return numero
    }
}

//prueba variable global

fun pruebaVariableGlobal(){
    println(global*2)
}

/* DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
  */



fun extra(text1:String, text2:String):Int{
    var contador=0
    for(i in 1..100){
        if(i % 3 == 0 && i%5 == 0){
            println(text1+text2)
        }else if(i % 3 == 0){
            println(text1)
        }else if(i%5 == 0){
            println(text2)
        }else{
            println(i)
            ++contador
        }
    }
    return "el numero de veces que ha sido impres el numero en lugar del contador $contador"
}







    

