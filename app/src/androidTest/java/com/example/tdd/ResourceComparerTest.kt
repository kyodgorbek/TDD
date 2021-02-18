package com.example.tdd

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{
   private  lateinit var   resourceComparer : ResourceComparer


   @Before
    fun setUp(){
       resourceComparer = ResourceComparer()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun stringResourceSameAsGivingString_returnsTrue(){
    val context = ApplicationProvider.getApplicationContext<Context>()
    val result = resourceComparer.isEqual(context, R.string.app_name, "TDD")
    assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivingString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }
}