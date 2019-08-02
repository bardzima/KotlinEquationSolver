package com.temobard.equationsolver.tokens

class Operator(val type: Type) : Token {
    enum class Type(val value: String, val rank: Int, val rightAssociative: Boolean) {
        SUBTRACT("-", 2, false),
        ADD("+", 2, false),
        DIVIDE("/", 3, false),
        MULTIPLY("*", 3, false),
        POWER("^", 4, true),
        SINE("sin", 3, true),
        COSINE("cos", 3, false),
        PAR_LEFT("(", 1, false),
        PAR_RIGHT(")", 1, false)
    }
}