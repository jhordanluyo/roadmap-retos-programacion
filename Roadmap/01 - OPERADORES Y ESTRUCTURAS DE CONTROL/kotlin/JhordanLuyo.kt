//operadores en kotlin

fun main(){
    //operador de signo
    val positivo = +3
    val negativo = -4


    //Operadores Artimeticos
    //operador Suma 
    val suma = 3 + 4
    //operador Resta
    val resta = 4 - 5
    //operador multiplicacion
    val multiplicacion = 3*2
    //operador division
    val division = 3 / 3 //entraga un valor entero
    val division2 = 20 / 3 //redondea el valor al entero
    //operador MOD
    val mod = 30 % 2
    
    //Operadores de asignacion compuesta 
    var a = 1
    a += 1      // es igual a = a + 1
    a -= 1      // es igual a = a -1
    a *= 2      // es igual a = a * 2
    a /= 2      // es igual a = a / 2
    a %= 2      // es igual a = a % 2
    
    //Operadores de pre y post Incremento y Decremento
    ++a         // aumenta su valor en esta linea 
    --a         // disminuye su valor en esta linea
    a--         // disminuye su valor en al siguiente linea
    a++         // aumenta su valor en la siguiente linea

    //operador asignacion
    val name = "jhordan"

    //Operadores Relacionales
    val c = 1
    val b = 2
    val igualdad = a == b
    val diferente = a != b
    val mayor = a > b
    val menor = a < b
    val mayorIgual = a >= b
    val menoIgual = a <= b
    
    //Operadores Logicos

    val and = true && true
    val or = false || true
    val not = !true

    //Operadores a nivel de bits

    val andBit = c and b  // 111 and 101 = 101 
    val orBit = c or b    // 111 and 101 = 111    
    val xorBit = c xor b  // 111 and 101 = 010   
    c.inv()     // 111.inv() = 000
    c shr b     // desplazamiento de bits a la derecha 
    c ushr b   //desplazamiento de bits a la izquierda

    //Estrucuturas de control en kotlin

    //Estructuras condicionales

    //expresion if
    if(a == b){
        println("Son iguales")
    } else {
        println("no son iguales")
    }

    //expresion when
    when(a){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else ->{ println("x no es ni 1 ni 2")}
    }

    //Estructuras repetitivas

    //bucle for
    for(i in 2..3){

        println(i)
    }

    //bucle while
    while(a<23){
        println(a)
        ++a
    }

    //bucle do-while
    do {
        println(a)

    }while(a>23)

    /*
    DIFICULTAD EXTRA (opcional):
    Crea un programa que imprima por consola todos los números comprendidos
    entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
    */
    println("""
    DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3 1.
    """)
    for (i in 10..55){
        if((i != 16 && i%3 != 0) && i%2 == 0){
            println(i)
        }
    }





}   







