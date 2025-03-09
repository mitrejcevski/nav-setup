package nl.jovmit.navsetup.feature.composersettings

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object ComposerSettingsDestination

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