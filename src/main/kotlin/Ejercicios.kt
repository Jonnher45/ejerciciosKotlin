/*Ejercicio: Números pares e impares.
    Solicita al usuario un número entero.
    Imprime todos los números pares desde 2 hasta el número ingresado.
    Imprime todos los números impares desde 1 hasta el número ingresado.*/
fun ejercicio1(){
    println("\n1-Números pares e impares.")
    println("Ingresar un número entero:")
    var num= readLine()?.toIntOrNull() ?: 0
    if(num>0){
        println("Números pares:")
        for(i in 1..num){
            if(i % 2==0){
                println("${i}")
            }
        }
        println("Números impares:")
        for(i in 1..num){
            if(i % 2!=0){
                println("${i}")
            }
        }
    }else{
        println("Ingresar un número correcto")
    }
}


/*Ejercicio: Calculadora simple.
Solicita al usuario dos números enteros y un operador (+, -, *, /).
Realiza la operación y muestra el resultado.*/

fun ejercicio2(){
    println("\n2-Calculadora simple.")
    println("Ingresar el primer número:")
    var num1= readLine()?.toIntOrNull() ?: 0
    println("Ingresar el segundo número:")
    var num2= readLine()?.toIntOrNull() ?: 0
    println("Ingresar el operador (+, -, *, /):")
    var operador= readlnOrNull()
    when(operador){
        "+"->println("Suma: ${num1+num2}")
        "-"->println("Resta: ${num1-num2}")
        "*"->println("Multiplicación: ${num1/num2}")
        "/"->if(num2==0){
            println("El segundo número no debe ser cero")
        }else{
            println("División: ${num1/num2}")
        }
        else-> println("Ingresar valores correctos")
    }
}


/*Ejercicio: Números primos.
Solicita al usuario un número entero.
Determina si el número ingresado es primo o no.*/
fun ejercicio3(){
    println("\n3-Números primos")
    var aux=0
    println("Ingresar un número entero:")
    var num= readLine()?.toIntOrNull() ?: 0
    if(num!=0){
        for(i in 1..num){
            if(num % i==0){
                aux+=1
            }
        }
        if(aux==2){
            println("El número ${num} es primo")
        }else{
            println("El número ${num} no es primo")
        }
    }else{
        println("Ingresar un número correcto")
    }
}

/*Ejercicio: Tabla de multiplicar.
Solicita al usuario un número entero.
Imprime la tabla de multiplicar del número ingresado, desde 1 hasta 10.*/
fun ejercicio4(){
    println("\n4-Tabla de multiplicar")
    println("Ingresar un número entero:")
    var num= readLine()?.toIntOrNull() ?: 0
    if(num!=0){
        for(i in 1..10){
            println("${num} * ${i} = ${num*i}")
        }
    }else{
        println("Ingresar un número correcto")
    }
}


/*Ejercicio: Factorial de un número.
Solicita al usuario un número entero positivo.
Calcula el factorial del número ingresado y muestra el resultado.*/
fun ejercicio5(){
    println("\n5-Factorial de un número")
    var factorial=1
    println("Ingresar un número entero:")
    var num= readLine()?.toIntOrNull() ?: 0
    if(num>0){
        for(i in 1..num){
            factorial*=i
        }
        println("El factorial de ${num} es ${factorial}")
    }else{
        println("Ingresar un número correcto")
    }
}

/*Ejercicio: Suma de números pares.
Solicita al usuario un número entero positivo.
Calcula la suma de todos los números pares desde 1 hasta el número ingresado y muestra el resultado.*/
fun ejercicio6(){
    println("\n6-Suma de números pares")
    var aux=0
    println("Ingresar un número entero:")
    var num= readLine()?.toIntOrNull() ?: 0
    if(num>0){
        for(i in 1..num){
            if(i%2==0){
                aux+=i
            }
        }
        println("La suma de los pares hasta ${num} es ${aux}")
    }else{
        println("Ingresar un número correcto")
    }
}

/*Calcular los primeros n, número de una serie fibonacci: ejemplo los 10 primeros: 1,1,2,3,5,8,13,21,34,55*/
fun ejercicio7(){
    println("Serie de Fibonacci")
    println("Ingresar un número entero de la posicion de fibonacci:")
    var num= readLine()?.toIntOrNull() ?: 0
    var b1=1
    var b2=1
    var aux=0
    if(num>0){
        for (i in 1 .. num){
            print("${b1} ")
            aux=b1+b2
            b1=b2
            b2=aux
        }

    }else{
        println("Ingresar un número correcto")
    }
}
//Resuelto con recursividad
fun ejercicio7b(){

    println("Ingresar un número entero de la posicion de fibonacci:")
    var num= readLine()?.toIntOrNull() ?: 0
    if(num>0){
        for (i in 1 .. num){
            print("${fibonacci(i)}")
        }

    }else{
        println("Ingresar un número correcto")
    }
}
fun fibonacci(n: Int): Int{
    if(n>1) {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }else if(n==1){
        return 1
    }else if(n==0){
        return 0
    }else{
        return -1
    }
}


/*Ejercicio: Números primos en un rango.
Solicita al usuario dos números enteros, inicio y fin, donde inicio es menor que fin.
Imprime todos los números primos en el rango desde inicio hasta fin.*/
fun ejercicio8(){
    println("\n8-Números primos en un rango")
    var aux=0
    //println("Si no se ingresa un número se reemplazará por cero!")
    println("Ingresar el rango inferior:")
    var rInf= readLine()?.toIntOrNull() ?: 0
    println("Ingresar el rango superior:")
    var rSup= readLine()?.toIntOrNull() ?: 0
    if(rInf<rSup){
        println("Números primos entre ${rInf} y ${rSup}")
        for(i in rInf..rSup){
            for(j in 1..i){
                if(i % j==0){
                    aux+=1
                }
            }
            if(aux==2){
                println("${i}")
            }
            aux=0
        }
    }else{
        println("Ingresar un número correcto")
    }
}