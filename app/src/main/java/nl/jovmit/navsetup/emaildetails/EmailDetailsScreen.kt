package nl.jovmit.navsetup.emaildetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
fun EmailDetailsScreen(
  onNavigateUp: () -> Unit,
  onReplyToEmail: () -> Unit
) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        navigationIcon = {
          IconButton(onClick = onNavigateUp) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, "Navigate Up")
          }
        },
        title = { Text("Email Details") }
      )
    }
  ) { paddingValues ->
    Box(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues),
      contentAlignment = Alignment.Center
    ) {
      Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Email Details")
        Button(onClick = onReplyToEmail) {
          Text("Reply To Email")
        }
      }
    }
  }
}

@Composable
@Preview
private fun EmailDetailsScreenPreview() {
  NavSetupTheme {
    EmailDetailsScreen(
      onNavigateUp = {},
      onReplyToEmail = {}
    )
  }
}