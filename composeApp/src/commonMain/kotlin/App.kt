import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {

        val colors = getColorsTheme()

        AppTheme {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "Bem-vindos", color = colors.textColor)
                Text(text = "Curso Kotlin Multiplataforma com Compose")
                Text(text = "Curso Kotlin Multiplataforma com Compose")
                Text(text = "Curso Kotlin Multiplataforma com Compose")
            }
        }

    }
}
