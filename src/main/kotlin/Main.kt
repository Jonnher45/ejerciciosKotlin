import java.lang.ArithmeticException
import java.lang.Exception

fun main(args: Array<String>) {
    /*
    //Declarar variables
    var nombre:String = "Juan"
    println(nombre)
    nombre="Lucas"
    println(nombre)
    //Declarar constantes
    val name="Tony"
    var num1=5
    var num2=6
    var suma=num1+num2
    //+ - * /
    println("La suma es: ${suma}")
    var resta=num1-num2
    var multiplicacion=num1*num2
    var division=num1/num2
    var residuo=num1%num2
    println("Resta: ${resta}  ${num1-num2}")
    println("Multiplicación: ${multiplicacion}")
    println("División: ${division}  Módulo: ${residuo}")

    //Operaciones de asignación
    var x=10
    x+=5 //Equivalente a x=x+5
    x-=5 //Equivalente a x=x-5
    x/=5 //Equivalente a x=x/5
    x*=5 //Equivalente a x=x*5
    x%=5 //Equivalente a x=x%5

    //Operaores de comparación
    var a=5
    var b=3

    var igual = a==b


    //Opreadores Lógicos
    val z=true
    val y=false

    val and= z && y //ambas verdaderas
    val or = z || y //al menos una verdadera
    val not= !z     //negación

    //Operaciones con cadenas
    val cad1="Hola como"
    val cad2=" cadenas"

    val concatenacion=cad1+cad2        //Concatenar cadenas "+"
    val longitudCadena=cad1.length     //Longitud de la cadena
    val subcadena=cad1.substring(0,3)  //posición de inicio, posición final -1
    val esVacio =cad1.isEmpty()        //Verificar si una cadena está vacía

    //Condicionales
    /*if (condicion){
        contenido
    }*/
    //Se puede usar else if, if dentro de otros.
    if (y==true && z==false){
        println("Se cumple la condición")
    }else{
        println("No se cumple la condición")
    }

    //Bucle repetitivo
    //Bucle for
    for (i in 1 .. 10){
        println(i)
    }
    //Ingresar un rango de números y definir si es par o impar
    val rangoInicio=1
    val rangoFinal=5
    for (i in rangoInicio .. rangoFinal){
        if ((i%2)==0){
            println("${i} es un número par")
        }else{
            println("${i} es un número impar")
        }
    }
    //Definir un algoritmo que calcule el factorial de un número.
    var num=3
    var factorial=1
    if (num>1){
        for (i in 1 .. num){
            factorial*=i
        }
    }
    println("Factorial es: ${factorial}")

    println("Ingresar el rango superior")
    var rInf= readLine()?.toIntOrNull() ?: 1
    //var rInf1= readLine().toString().toInt()
    println("Ingresar el rango inferior")
    val rSup=10
    for(i in rInf..rSup){
        if(i % 2==0){
            println("${i} --> Par")
        }else{
            println("${i} --> Impar")
        }
    }
*/
/*
    fun factorial(num: Int):Int{
        var aux = 1
        for(i in 1 .. num){
            aux*=i
        }
        return aux
    }
    println("El factorial es ${factorial(3)}")

    fun primo(n:Int):String{
        var aux=0
        for(i in 1..n){
            if(n%i==0){
                aux+=1
            }
        }
        if (aux==2){
            return "${n} Es primo"
        }else{
            return "${n} No es primo"
        }
    }
    println( primo(12))
*/
    //EMPIEZA TAREA

    var salir=false
    println("Menú: \n1-Números pares e impares. \n2-Calculadora simple. \n3-Números primos \n4-Tabla de multiplicar. \n5-Factorial de un número \n6-Suma de números pares \n7-Ej7 \n8-Números primos en un rango \n9-Salir")
    do {
        println("\nElija una opción del menú:")
        var opcion= readLine()?.toIntOrNull() ?: 0
        when(opcion){
            1->ejercicio1()
            2->ejercicio2()
            3->ejercicio3()
            4->ejercicio4()
            5->ejercicio5()
            6->ejercicio6()
            7->ejercicio7()
            8->ejercicio8()
            9->{salir=true
                println("Saliendo...")}
            else-> println("Seleccione una opcion")
        }
    }while (salir==false)




    //Comentario de una línea
    /*
    * Varias líneas de comentarios
    * */

/*
    println("Ingresar dos numeros")
    var n1= readLine()?.toIntOrNull() ?:0
    var n2= readLine()?.toIntOrNull() ?:0
    try {
        var r=n1/n2
        println(r)
    }/*catch (e: ArithmeticException){
        println("Error: No existen divisiones para cero")
    }*/
    catch (e: Exception){
        println("Error: ${e.message}")
    }finally {
        println("Operación terminada")
    }

*/

/*    val miArray= arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    /*for (i in miArray){
        println(i)
    }*/
    println( miArray.size)
    for (i in miArray.slice(1..5)){
        println(i)
    }
    var miArray2= arrayOf(1,2,3,4,5,6)
    var sumatoria=0
    miArray2[2]=10
    for (i in miArray2){
        sumatoria+=i
    }
    println(sumatoria)
    println("${miArray2[4]}")
    var x=miArray2 + 4
    println("${miArray2.joinToString()}")
    println(x.joinToString())*/
}