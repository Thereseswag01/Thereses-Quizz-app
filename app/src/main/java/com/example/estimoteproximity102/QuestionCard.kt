package com.example.estimoteproximity102

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun QuestionCard(
    questions: Question,
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Column {
            Text(text = questions.ID)
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = questions.Spørgsmål)
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = questions.valg)
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = questions.DetRigitgeSvarIndex)
            Spacer(modifier = Modifier.height(4.dp))



        }
    }
}