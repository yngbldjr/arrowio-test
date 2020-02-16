package test

import io.kotlintest.IsolationMode
import io.kotlintest.specs.StringSpec
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestIOTest : StringSpec() {

    override fun isolationMode() = IsolationMode.InstancePerTest

    init {
        "TC 1" {
            val t = TestIO()
            assertTrue(t.test1("asd").attempt().unsafeRunSync().isRight())
        }

    }
}