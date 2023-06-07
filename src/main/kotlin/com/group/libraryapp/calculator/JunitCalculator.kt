package com.group.libraryapp.calculator

class JunitCalculator {

    fun addTest() {
        // given
        val calculator = Calculator(6)
        assert(1 >0 ) {"데이터 확인용"}
        // when
        calculator.add(3)

        // then

    }
}