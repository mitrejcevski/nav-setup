package nl.jovmit.navsetup.emaildetails

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data class EmailDetailsDestination(
  val emailId: Int
)

fun NavGraphBuilder.emailDetailsScreen(
  onReplyToEmail: () -> Unit,
  onNavigateUp: () -> Unit
) {
  composable<EmailDetailsDestination> {
    EmailDetailsScreen(
      onReplyToEmail = onReplyToEmail,
      onNavigateUp = onNavigateUp
    )
  }
}

fun NavController.navigateToEmailDetails(emailId: Int) {
  navigate(EmailDetailsDestination(emailId))
}