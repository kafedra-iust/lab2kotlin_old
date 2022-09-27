import kotlin.math.*

/* Пример "главной функции программы
 * Сейчас она печатает сообщение Hello, World!
 */
fun main() {
    println("Hello, World!")
    var a:Int = 2
    var res = 3.7
    a = (a * res).toInt()
}

/* Пример написания функции, состоящей из одного выражения
 * В этом случае, указывать тип функции необязательно, Kotlin сам "выведет" его
 */
fun f(x:Double) = sin(x) + cos(x)

fun var1calcR(a: Double, b: Double, x: Double) : Double = x*x*(x+1)/b

fun var1calcS(a: Double, b: Double, x: Double) : Double = TODO()

fun var2calcF(m: Int, c: Int, t: Double) : Double = TODO()

fun var2calcZ(m: Int, c: Int, t: Double, b: Double) : Double = TODO()

fun var3calcY(a: Double, b: Double, x: Double) : Double = TODO()

fun var3calcD(a: Double, b: Double, x: Double) : Double = TODO()

fun var4calcS(x: Double) : Double = TODO()

fun var4calcF(x: Double, y: Double) : Double = TODO()

fun var5calcS(x:Double, a:Double, b: Double) : Double = TODO()

fun var5calcQ(x: Double, a:Double, b:Double) : Double = TODO()

fun var6calcY(a: Double, b:Double, t:Double) : Double = TODO()

fun var6calcS(a: Double, b:Double, t:Double) : Double = TODO()

fun var7calcY(a:Double, b: Double, x:Double) : Double = TODO()

fun var7calcZ(a:Double, b: Double, x:Double) : Double = TODO()

fun var8calcA(x: Double, y: Double, z: Double) : Double = TODO()

fun var8calcB(x: Double, y: Double, z: Double) : Double = TODO()

fun var9calcW(x: Double, a: Double, b: Double) : Double = TODO()

fun var9calcY(x: Double, a: Double, b: Double) : Double = TODO()

fun var10calcC(x: Double, y: Double, z: Double) : Double = TODO()

fun var10calcF(x: Double, y:Double, z:Double) : Double = TODO()