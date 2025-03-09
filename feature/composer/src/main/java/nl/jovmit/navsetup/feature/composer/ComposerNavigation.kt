package nl.jovmit.navsetup.feature.composer

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data object ComposerDestination

fun NavGraphBuilder.composerScreen(
  onNavigateUp: () -> Unit
) {
  composable<ComposerDestination> {
    ComposerScreenRoot(
      onNavigateUp = onNavigateUp
    )
  }
}

fun NavController.navigateToComposer() {
  navigate(ComposerDestination)
}