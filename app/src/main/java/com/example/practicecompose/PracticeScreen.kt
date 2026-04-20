package com.example.practicecompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Ex(){
    Column(modifier = Modifier.fillMaxSize()) {
    Box(modifier = Modifier.fillMaxWidth()
        .weight(1f).background(Color.Black))
        Box(modifier = Modifier.fillMaxWidth()
            .weight(1f).background(Color.Red))

}}