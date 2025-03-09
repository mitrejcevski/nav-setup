package nl.jovmit.navsetup.feature.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import nl.jovmit.navsetup.feature.emails.EmailsListDestination
import nl.jovmit.navsetup.feature.emails.emailsListScreen
import nl.jovmit.navsetup.feature.emails.navigateToEmailsList
import nl.jovmit.navsetup.feature.profile.ProfileDestination
import nl.jovmit.navsetup.feature.profile.navigateToProfile
import nl.jovmit.navsetup.feature.profile.profileScreen
import nl.jovmit.navsetup.shared.ui.theme.NavSetupTheme

@Composable
internal fun MainScreen(
  onOpenEmailDetails: (emailId: Int) -> Unit,
  onComposeNewEmail: () -> Unit
) {
  val navController = rememberNavController()
  Scaffold(
    modifier = Modifier.fillMaxSize(),
    bottomBar = {
      MainBottomBar(
        hierarchy = navController.currentBackStackEntryAsState().value?.destination?.hierarchy,
        onNavigateToEmails = { navController.navigateToEmailsList() },
        onNavigateToProfile = { navController.navigateToProfile() }
      )
    }
  ) { paddingValues ->
    NavHost(
      modifier = Modifier.padding(paddingValues),
      navController = navController,
      startDestination = EmailsListDestination
    ) {
      emailsListScreen(
        onOpenEmailDetails = onOpenEmailDetails,
        onComposeNewEmail = onComposeNewEmail
      )
      profileScreen()
    }
  }
}

@Composable
private fun MainBottomBar(
  hierarchy: Sequence<NavDestination>?,
  onNavigateToEmails: () -> Unit,
  onNavigateToProfile: () -> Unit
) {
  NavigationBar {
    NavigationBarItem(
      selected = hierarchy?.any { it.hasRoute(EmailsListDestination::class) } == true,
      icon = { Icon(imageVector = Icons.Default.Email, "emails") },
      onClick = onNavigateToEmails
    )
    NavigationBarItem(
      selected = hierarchy?.any { it.hasRoute(ProfileDestination::class) } == true,
      icon = { Icon(imageVector = Icons.Default.Person, "profile") },
      onClick = onNavigateToProfile
    )
  }
}

@Composable
@Preview
private fun PreviewMainScreen() {
  NavSetupTheme {
    MainScreen(
      onOpenEmailDetails = {},
      onComposeNewEmail = {}
    )
  }
}