package com.erick.herrera.unittestone

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest {

    @Test
    fun `empty userName returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid userName and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Cristopher",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `userName already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Erick",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Cristopher",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }
    
    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Cristopher",
            password = "123",
            confirmedPassword = "456"
        )
        assertThat(result).isFalse()
    }
    
    @Test
    fun `password contains less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Cristopher",
            password = "ABCDE1",
            confirmedPassword = "ABCD1"
        )
        assertThat(result).isFalse()
    }
    
}