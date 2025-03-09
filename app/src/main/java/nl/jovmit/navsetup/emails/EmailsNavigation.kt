package nl.jovmit.navsetup.emails

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object EmailsListDestination

fun NavGraphBuilder.emailsListScreen(
  onOpenEmailDetails: (id: Int) -> Unit,
  onComposeNewEmail: () -> Unit
) {
  composable<EmailsListDestination> {
    EmailsListScreen(
      onOpenEmailDetails = onOpenEmailDetails,
      onComposeNewEmail = onComposeNewEmail
    )
  }
}

fun NavController.navigateToEmailsList() {
  navigate(EmailsListDestination)
}