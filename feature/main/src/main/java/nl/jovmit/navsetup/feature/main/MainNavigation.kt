package nl.jovmit.navsetup.feature.main

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data object MainDestination

fun NavGraphBuilder.mainScreen(
  onOpenEmailDetails: (emailId: Int) -> Unit,
  onComposeNewEmail: () -> Unit
) {
  composable<MainDestination> {
    MainScreen(
      onOpenEmailDetails = onOpenEmailDetails,
      onComposeNewEmail = onComposeNewEmail
    )
  }
}

fun NavController.navigateToMain() {
  navigate(MainDestination)
}