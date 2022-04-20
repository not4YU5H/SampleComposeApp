package com.example.samplecomposeapp.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@ExperimentalMaterialApi
@Composable
fun ExpandableCard() {
    var expandedState by remember { mutableStateOf(false) }
     Card (
         modifier = Modifier
             .fillMaxWidth()
             .animateContentSize(
                 animationSpec = tween(
                     delayMillis = 300,
                     easing = LinearOutSlowInEasing
                 )
             )
             ) {}
}