package com.group.libraryapp.calculator

fun main () {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
}

class CalculatorTest {
    private val num1 = 6
    private val num2 = 3
    fun addTest() {
        // given TODO("테스트 대상을 만들어 준비하는 과정")
        val calculator = Calculator(num1)

        // when TODO("실제 우리가 테스트하고 싶은 기능을 호출하는 과정")
        calculator.add(num2)

        // then TODO("호출 이후 의도한대로 결과가 나왔는지 확인하는 과정")
        if (calculator.number != num1+num2) {
            throw IllegalArgumentException()
        }
    }

    fun minusTest() {
        // given TODO("테스트 대상을 만들어 준비하는 과정")
        val calculator = Calculator(num1)

        // when TODO("실제 우리가 테스트하고 싶은 기능을 호출하는 과정")
        calculator.minus(num2)

        // then TODO("호출 이후 의도한대로 결과가 나왔는지 확인하는 과정")
        if (calculator.number != num1-num2) {
            throw IllegalArgumentException()
        }
    }

    fun multiplyTest() {
        // given TODO("테스트 대상을 만들어 준비하는 과정")
        val calculator = Calculator(num1)

        // when TODO("실제 우리가 테스트하고 싶은 기능을 호출하는 과정")
        calculator.multiply(num2)

        // then TODO("호출 이후 의도한대로 결과가 나왔는지 확인하는 과정")
        if (calculator.number != num1*num2) {
            throw IllegalArgumentException()
        }
    }

    fun divideTest() {
        // given TODO("테스트 대상을 만들어 준비하는 과정")
        val calculator = Calculator(num1)

        // when TODO("실제 우리가 테스트하고 싶은 기능을 호출하는 과정")
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다.") {
                throw IllegalArgumentException("메세지가 다릅니다.")
            }
            return
        } catch (e: Exception) {
            throw IllegalArgumentException()
        }

        // then TODO("호출 이후 의도한대로 결과가 나왔는지 확인하는 과정")
        if (calculator.number != num1/num2) {
            throw IllegalArgumentException()
        }
    }
}