package com.example.estimoteproximity102

data class Question(
    var SpørgsmålOverskrift: String,
    var Spørgsmål:String,
    var valg: List<String>,
    var DetRigitgeSvarIndex: Int
)
