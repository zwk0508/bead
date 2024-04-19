package com.zwk.compiler

import java.io.ByteArrayOutputStream
import java.io.OutputStream

class CompileContext {
    val magicNumber = 0XBEADAA
    var index = 0
    val stringArray = mutableMapOf<String, Int>()
    val importArray = mutableListOf<Int>()
    val valueArray = mutableListOf<Pair<Int, Int>>()
    val variable = mutableListOf<Pair<Int, Int>>()
    val function = mutableListOf<Pair<Int, MutableList<Triple<Int, Int, Int>>>>()

    fun writeToFile(file: String) {

    }

    fun writeToOutputStream(out: OutputStream) {

    }

    private fun toByteArray(): ByteArray {
        return byteArrayOf(1)
    }
}