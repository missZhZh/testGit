package com.example.kotlinapp

import org.junit.Test


/**
 * @Description
 * @Author: 张朝
 * @CreateDate: 2020/10/22
 * @UpdateUser
 * @CreateDate
 **/
class TestKot {
    @Test
    fun main(){
        println("a * b = ${addNums(3,4)}")
        //只读变量 类似 final
        val a: Int = 4
        var e: String = "123"
        var f: String = "123"
        val b = 6
        val c: Int = 7;
        //可变变量
        var x = 7;
        x += 6;
        //for 循环
        val items = listOf("afppfa","banana","kiwi")
        for(item in items.indices){

        }
        println("e == f"+(e==f))
    }

    fun addNums(a: Int, b: Int) = a * b
    //类型转换
    fun getStringLength(obj :Any) : Int?{
        // 可返回null
        if (obj !is String)  return  null
        return obj.length;

    }

}