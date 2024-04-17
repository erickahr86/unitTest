package com.erick.herrera.unittestone

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class ResourceComparerTest {

    private lateinit var resourcesComparer: ResourceComparer

    @Before
    fun setup() {
        resourcesComparer = ResourceComparer()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourcesComparer.isEqual(context, R.string.app_name, "UnitTestOne")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourcesComparer.isEqual(context, R.string.app_name, "Anything")
        assertThat(result).isFalse()
    }
}