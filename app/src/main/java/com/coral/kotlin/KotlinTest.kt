package com.coral.kotlin

/**
 * Created by xss on 2017/7/19.
 */
class KotlinTest {

    // val 和 var 的区别：val修饰一次赋值（只读）的变量，相当于final类型，之后值不能改变；var 修饰普通变量，也即可变变量

    val a: Int = 1  // 立即赋值，没有赋值会报错
    val b = 2       // 自动推断 Int 类型
    var c: Int = 2

    var x = 5

    var d = "xss"
    val e = "name is $d"

    var d0 = "coral"
    // 模板中的任意表达式
    val f = "${e.replace("is", "was")}, but now is d"

    fun setCVal(c: Int) {
        this.c = c
    }

    fun setI(i: Int) {

    }
}