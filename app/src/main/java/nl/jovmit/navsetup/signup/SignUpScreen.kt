package nl.jovmit.navsetup.signup

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import nl.jovmit.navsetup.ui.theme.NavSetupTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
  onNavigateToMain: () -> Unit,
  onNavigateUp: () -> Unit
) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        navigationIcon = {
          IconButton(onClick = onNavigateUp) {
            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, "Navigate Up")
          }
        },
        title = { Text(text = "Sign Up") }
      )
    }
  ) { paddingValues ->
    Box(
      modifier = Modifier.fillMaxSize().padding(paddingValues),
      contentAlignment = Alignment.Center
    ) {
      Button(onClick = onNavigateToMain) {
        Text(text = "Sign Up")
      }
    }
  }
}


@Preview
@Composable
private fun PreviewSignUpScreen() {
  NavSetupTheme {
    SignUpScreen(
      onNavigateToMain = {},
      onNavigateUp = {}
    )
  }
}