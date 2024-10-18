package com.example.questbasiccomposable_activity2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_activity2.ui.theme.QuestBasicComposable_Activity2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_Activity2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(

                        farras = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(farras: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Login",
            modifier = farras,
            fontSize = 50.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
        )

        Image(
            painter = painterResource(id = R.drawable.logumy),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Nama",
            style = TextStyle(
                fontSize = 15.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
        )




    }


}

