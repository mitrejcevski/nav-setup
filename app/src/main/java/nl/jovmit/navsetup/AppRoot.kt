package nl.jovmit.navsetup

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import nl.jovmit.navsetup.feature.composer.composerScreenRoot
import nl.jovmit.navsetup.feature.composer.navigateToComposer
import nl.jovmit.navsetup.feature.emaildetails.emailDetailsScreen
import nl.jovmit.navsetup.feature.emaildetails.navigateToEmailDetails
import nl.jovmit.navsetup.feature.login.LoginDestination
import nl.jovmit.navsetup.feature.login.loginScreen
import nl.jovmit.navsetup.feature.main.mainScreen
import nl.jovmit.navsetup.feature.main.navigateToMain
import nl.jovmit.navsetup.feature.signup.navigateToSignUp
import nl.jovmit.navsetup.feature.signup.signUpScreen

@Composable
fun AppRoot() {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = LoginDestination
  ) {

    loginScreen(
      onNavigateToMain = { navController.navigateToMain() },
      onNavigateToSignUp = { navController.navigateToSignUp() }
    )

    signUpScreen(
      onNavigateToMain = { navController.navigateToMain() },
      onNavigateUp = { navController.navigateUp() }
    )

    mainScreen(
      onOpenEmailDetails = { emailId -> navController.navigateToEmailDetails(emailId) },
      onComposeNewEmail = { navController.navigateToComposer() }
    )

    emailDetailsScreen(
      onReplyToEmail = { navController.navigateToComposer() },
      onNavigateUp = { navController.navigateUp() }
    )

    composerScreenRoot(
      onNavigateUp = { navController.navigateUp() }
    )
  }
}