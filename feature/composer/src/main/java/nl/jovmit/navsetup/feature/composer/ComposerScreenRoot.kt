package nl.jovmit.navsetup.feature.composer

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import nl.jovmit.navsetup.feature.composersettings.composerSettingsScreen
import nl.jovmit.navsetup.feature.composersettings.navigateToComposerSettings
import nl.jovmit.navsetup.shared.ui.theme.NavSetupTheme

@Serializable
private data object ComposerDestination

@Composable
internal fun ComposerScreenRoot(
  onNavigateUp: () -> Unit
) {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = ComposerDestination
  ) {

    composable<ComposerDestination> {
      ComposerScreen(
        onNavigateUp = onNavigateUp,
        onOpenSettings = { navController.navigateToComposerSettings() }
      )
    }

    composerSettingsScreen(
      onNavigateUp = { navController.navigateUp() }
    )
  }
}

@Preview
@Composable
private fun PreviewComposer() {
  NavSetupTheme {
    ComposerScreenRoot(
      onNavigateUp = {}
    )
  }
}