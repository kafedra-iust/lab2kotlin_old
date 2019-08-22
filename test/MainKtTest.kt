import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import kotlin.math.PI

class MainKtTest {
    val EPS = 0.000001

    @Test
    @Tag("demo")
    fun testMain() {
        main()
    }

    @Test
    @Tag("demo")
    fun testF() {
        assertEquals(-1.0, f(PI), EPS)
        assertEquals(1.0, f(PI/2), EPS)
        assertEquals(1.0, f(0.0), EPS)
    }

    @Test
    @Tag("var1")
    fun testVar1calcR() {
        assertEquals(6.631303,  var1calcR(0.7,0.05,0.5), EPS)
    }

    @Test
    @Tag("var1")
    fun testVar1calcS() {
        assertEquals(1.161556,  var1calcS(0.7,0.05,0.5), EPS)
    }

    @Test
    @Tag("var2")
    fun testVar2calcF() {
        assertEquals(1.824795,  var2calcF(2,-1,1.2), EPS)
    }

    @Test
    @Tag("var2")
    fun testVar2calcZ() {
        assertEquals(0.417724,  var2calcZ(2,-1,1.2, 0.7), EPS)
    }

    @Test
    @Tag("var3")
    fun testVar3calcY() {
        assertEquals(2265.051304,  var3calcY(3.2,17.5,-4.8), EPS)
    }

    @Test
    @Tag("var3")
    fun testVar3calcD() {
        assertEquals(0.234358,  var3calcD(3.2,17.5,-4.8), EPS)
    }

    @Test
    @Tag("var4")
    fun testVar4calcS() {
        assertEquals(1.397903, var4calcS(0.335), EPS)
    }

    @Test
    @Tag("var4")
    fun testVar4calcF() {
        assertEquals(0.347382, var4calcF(0.335, 0.025), EPS)
    }

    @Test
    @Tag("var5")
    fun testVar5calcS() {
        assertEquals(8.274287, var5calcS(0.61, 16.5, 3.4), EPS)
    }

    @Test
    @Tag("var5")
    fun testVar5calcQ() {
        assertEquals(-0.000648, var5calcQ(0.61, 16.5, 3.4), EPS)
    }

    @Test
    @Tag("var6")
    fun testVar6calcY() {
        assertEquals(-0.0266333, var6calcY(-0.5, 1.7, 0.44), EPS)
    }

    @Test
    @Tag("var6")
    fun testVar6calcS() {
        assertEquals(-1.104783, var6calcS(-0.5, 1.7, 0.44), EPS)
    }

    @Test
    @Tag("var7")
    fun testVar7calcY() {
        assertEquals(-6.176755, var7calcY(1.1, 0.004, 0.2), EPS)
    }

    @Test
    @Tag("var7")
    fun testVar7calcZ() {
        assertEquals(1.016430, var7calcZ(1.1, 0.004, 0.2), EPS)
    }

    @Test
    @Tag("var8")
    fun testVar8calcA() {
        assertEquals(0.896915, var8calcA(1.426, -1.22, 3.5), EPS)
    }

    @Test
    @Tag("var8")
    fun testVar8calcB() {
        assertEquals(3.247706, var8calcB(1.426, -1.22, 3.5), EPS)
    }

    @Test
    @Tag("var9")
    fun testVar9calcW() {
        assertEquals(-71.929599, var9calcW(-2.8, 1.5, 15.5), EPS)
    }

    @Test
    @Tag("var9")
    fun testVar9calcY() {
        assertEquals(1.178273, var9calcY(-2.8, 1.5, 15.5), EPS)
    }

    @Test
    @Tag("var10")
    fun testVar10calcC() {
        assertEquals(404.336435, var10calcC(1.825, 18.225, -3.298), EPS)
    }

    @Test
    @Tag("var10")
    fun testVar10calcF() {
        assertEquals(1.119380, var10calcF(1.825, 18.225, -3.298), EPS)
    }


}