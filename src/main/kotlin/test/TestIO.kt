package test

import arrow.fx.IO
import arrow.fx.extensions.fx

class TestIO {
    fun test1(s: String): IO<String> {
        return IO.fx {
            s
        }
    }
}