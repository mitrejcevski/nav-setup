package nl.jovmit.navsetup

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import nl.jovmit.navsetup.login.LoginDestination
import nl.jovmit.navsetup.login.loginScreen
import nl.jovmit.navsetup.main.mainScreen
import nl.jovmit.navsetup.main.navigateToMain
import nl.jovmit.navsetup.signup.navigateToSignUp
import nl.jovmit.navsetup.signup.signUpScreen

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
      onOpenEmailDetails = {},
      onComposeNewEmail = {}
    )
  }
}
