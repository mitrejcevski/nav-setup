package nl.jovmit.navsetup.composer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
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
fun ComposerScreen(
  onNavigateUp: () -> Unit,
  onOpenSettings: () -> Unit
) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        navigationIcon = {
          IconButton(onClick = onNavigateUp) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, "Navigate Up")
          }
        },
        title = { Text(text = "New Email") },
        actions = {
          IconButton(onClick = onOpenSettings) {
            Icon(Icons.Default.Settings, "Settings")
          }
        }
      )
    }
  ) { paddingValues ->
    Box(
      modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues),
      contentAlignment = Alignment.Center
    ) {
      Text(text = "Compose New Email Here")
    }
  }
}

@Preview
@Composable
private fun PreviewComposerScreen() {
  NavSetupTheme {
    ComposerScreen(
      onNavigateUp = {},
      onOpenSettings = {}
    )
  }
}
