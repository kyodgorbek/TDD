package com.example.tdd

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class SumsTest{

    @Test
    fun `a greater b return true`() {
    val result = Sums.add(2, 1)
    assertThat(result).isTrue()
    }

    @Test
    fun `b greater a return false`() {
        val result = Sums.add(2, 1)
        assertThat(result).isTrue()
    }
    }