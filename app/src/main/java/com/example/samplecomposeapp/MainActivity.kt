package com.example.samplecomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplecomposeapp.ui.theme.SampleComposeAppTheme
import com.example.samplecomposeapp.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background)
                {
//                    Row (modifier = Modifier
//                        .height(500.dp)
//                        .width(500.dp)
//                        .background(Color.LightGray),
//                        horizontalArrangement = Arrangement.Start){
//                        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
//                        CustomItem(weight = 1f)
//                    }

//                    Greeting()



                }
            }
        }
    }
}

//@Composable
//fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
//    Surface(modifier = Modifier
//        .width(50.dp)
//        .height(50.dp)
//        .weight(weight),
//        color = color
//    ) { }
//}


//@Composable
//fun Greeting() {
//    Box(modifier = Modifier.fillMaxSize(),
//    contentAlignment = Alignment.Center) {
//        Box(modifier = Modifier
//            .background(Color.Blue), contentAlignment = Alignment.Center
////            .width(100.dp)
////            .height(100.dp)
////            .verticalScroll(rememberScrollState())
//            )
//        {
//            Box(modifier = Modifier.height(50.dp).width(50.dp).background(Color.Green))
//            Text(text = "I Love Android!", fontSize = 40.sp)
//        }
//    }
//}


@Composable
fun CustomText() {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colors.primary)
            .padding(16.dp)
            .width(200.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.h6.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}


@Composable
fun CustomText2() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.primary,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }
        }, modifier = Modifier.width(200.dp)
    )
}


@Composable
fun CustomText3() {
    Text(text = "Hello World!".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleComposeAppTheme {
//        Row (modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Start,
//        verticalAlignment = Alignment.CenterVertically ){
//            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
//            CustomItem(weight = 1f)
//        }

//        Greeting()

        
        Column(modifier = Modifier.fillMaxSize()) {
            CustomText3()
        }
        
    }
}