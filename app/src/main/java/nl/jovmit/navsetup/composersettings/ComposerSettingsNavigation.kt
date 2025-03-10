package nl.jovmit.navsetup.composersettings

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data object ComposerSettingsDestination

fun NavGraphBuilder.composerSettingsScreen(
  onNavigateUp: () -> Unit
) {
  composable<ComposerSettingsDestination> {
    ComposerSettingsScreen(
      onNavigateUp = onNavigateUp
    )
  }
}

fun NavController.navigateToComposerSettings() {
  navigate(ComposerSettingsDestination)
}