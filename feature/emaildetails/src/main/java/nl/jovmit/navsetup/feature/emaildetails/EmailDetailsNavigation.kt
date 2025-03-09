package nl.jovmit.navsetup.feature.emaildetails

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data class EmailDetailsDestination(
  val emailId: Int
)

fun NavGraphBuilder.emailDetailsScreen(
  onNavigateUp: () -> Unit,
  onReplyToEmail: () -> Unit
) {
  composable<EmailDetailsDestination> {
    EmailDetailsScreen(
      onReplyToEmail = onReplyToEmail,
      onNavigateUp = onNavigateUp,
    )
  }
}

fun NavController.navigateToEmailDetails(emailId: Int) {
  navigate(EmailDetailsDestination(emailId = emailId))
}