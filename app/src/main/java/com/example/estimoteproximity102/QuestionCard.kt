package com.example.estimoteproximity102

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun QuestionCard(
    question: Question,
    modifier: Modifier = Modifier
) {

        Column {
            Text(text = question.SpørgsmålOverskrift)
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = question.Spørgsmål)
            Spacer(modifier = Modifier.height(4.dp))

            LazyColumn(
                modifier = modifier
            ) {
                items(
                    items = question.valg
                ) { answer ->
                    AnswerCard(
                        answer = answer,
                        false,
                        {}
                    )
                }
            }

            //Text(text = question.DetRigitgeSvarIndex)
            Spacer(modifier = Modifier.height(4.dp))



        }
}