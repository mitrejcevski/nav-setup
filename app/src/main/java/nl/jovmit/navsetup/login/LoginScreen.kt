package nl.jovmit.navsetup.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import nl.jovmit.navsetup.ui.theme.NavSetupTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
  onNavigateToMain: () -> Unit,
  onNavigateToSignUp: () -> Unit
) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        title = { Text(text = "Login") }
      )
    }
  ) { paddingValues ->
    Box(
      modifier = Modifier.fillMaxSize().padding(paddingValues),
      contentAlignment = Alignment.Center
    ) {
      Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = onNavigateToMain) {
          Text(text = "Login")
        }
        Button(onClick = onNavigateToSignUp) {
          Text(text = "Go To Sign Up")
        }
      }
    }
  }
}

@Preview
@Composable
private fun PreviewLoginScreen() {
  NavSetupTheme {
    LoginScreen(
      onNavigateToSignUp = {},
      onNavigateToMain = {}
    )
  }
}