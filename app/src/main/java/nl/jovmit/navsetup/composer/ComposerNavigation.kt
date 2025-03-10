package nl.jovmit.navsetup.composer

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data object ComposerRootDestination

fun NavGraphBuilder.composerScreenRoot(
  onNavigateUp: () -> Unit
) {
  composable<ComposerRootDestination> {
    ComposerScreenRoot(
      onNavigateUp = onNavigateUp
    )
  }
}

fun NavController.navigateToComposer() {
  navigate(ComposerRootDestination) {
    popUpTo<ComposerRootDestination> {
      inclusive = true
    }
  }
}