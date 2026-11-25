package com.example.mysports

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class FragmentFactoryTest {

    @Test
    fun testSimpleFragmentsNewInstance() {
        val fragment = SimpleFragments.newInstance("Account")
        assertNotNull(fragment.arguments)
        assertEquals("Account", fragment.pageName)
    }

    @Test
    fun testSportDetailFragmentNewInstance() {
        val fragment = SportDetailFragment.newInstance("Basketball")
        assertNotNull(fragment.arguments)
        assertEquals("Basketball", fragment.sportName)
    }
}

