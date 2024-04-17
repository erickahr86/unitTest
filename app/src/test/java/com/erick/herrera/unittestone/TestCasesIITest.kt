package com.erick.herrera.unittestone

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class TestCasesIITest {

    /**
     * Fibonacci tests
     */
    @Test
    fun `n is equals 0 returns 0`() {
        val result = TestCasesII.fib(n = 0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `n is equals to 1 returns 1`() {
        val result = TestCasesII.fib(n = 1)
        assertThat(result).isEqualTo(1)
    }


    /**
     * CheckBraces tests
     */
    @Test
    fun `braces are set correctly returns false`() {
        val result = TestCasesII.checkBraces(string = "(a*b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `braces are set correctly returns true`() {
        val result = TestCasesII.checkBraces(string = "(a*b)")
        assertThat(result).isTrue()
    }

    @Test
    fun `braces are incorrectly ordered returns false`() {
        val result = TestCasesII.checkBraces(string = ")(")
        assertThat(result).isFalse()
    }

}