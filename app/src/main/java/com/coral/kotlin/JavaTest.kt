package com.coral.kotlin

/**
 * Created by xss on 2017/7/19.
 */

class JavaTest {

    private var i: Int = 0

    private var j: Int = 0

    fun setI(i: Int) {
        this.i += i
    }

    fun reVal(a: Int) {
        i += a
        j += a
    }
}
