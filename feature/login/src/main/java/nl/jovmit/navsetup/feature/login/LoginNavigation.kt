package nl.jovmit.navsetup.feature.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

/**
 * We need to keep this public so we can "see" it from the app module,
 * and use it as a starting point/destination.
 */
@Serializable
data object LoginDestination

fun NavGraphBuilder.loginScreen(
  onNavigateToMain: () -> Unit,
  onNavigateToSignUp: () -> Unit
) {
  composable<LoginDestination> {
    LoginScreen(
      onNavigateToMain = onNavigateToMain,
      onNavigateToSignUp = onNavigateToSignUp
    )
  }
}