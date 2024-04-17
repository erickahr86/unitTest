package com.erick.herrera.unittestone

object TestCasesII {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) return n.toLong()

        var a = 0L
        var b = 1L
        var c = 1L
        (1..n - 1).forEach { _ ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     * another fib function
     */
//    fun fibonacci(n: Int): String {
//        if (n == 0 || n == 1) return n.toString()
//
//        val result = StringBuilder()
//        var a = 0L
//        var b = 1L
//        var c = 1L
//        (1..n - 1).forEach { _ ->
//            c = a + b
//            a = b
//            b = c
//
//            result.append("${c.toString()}\r\n")
//        }
//        return result.toString()
//    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
        val openBrace = string.indexOf('(')
        val closeBrace = string.indexOf(')')
        if (openBrace > closeBrace) return false

        return string.count { it == '(' } == string.count { it == ')' }
    }
}