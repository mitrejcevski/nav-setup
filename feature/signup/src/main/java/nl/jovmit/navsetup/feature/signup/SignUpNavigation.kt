package nl.jovmit.navsetup.feature.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data object SignUpDestination

fun NavGraphBuilder.signUpScreen(
  onNavigateToMain: () -> Unit,
  onNavigateUp: () -> Unit
) {
  composable<SignUpDestination> {
    SignUpScreen(
      onNavigateToMain = onNavigateToMain,
      onNavigateUp = onNavigateUp
    )
  }
}

fun NavController.navigateToSignUp() {
  navigate(SignUpDestination)
}