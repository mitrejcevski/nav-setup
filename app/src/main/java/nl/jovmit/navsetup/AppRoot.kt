package nl.jovmit.navsetup

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import nl.jovmit.navsetup.login.LoginDestination
import nl.jovmit.navsetup.login.loginScreen
import nl.jovmit.navsetup.signup.navigateToSignUp

@Composable
fun AppRoot() {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = LoginDestination
  ) {
    loginScreen(
      onNavigateToMain = {},
      onNavigateToSignUp = { navController.navigateToSignUp() }
    )
  }
}
