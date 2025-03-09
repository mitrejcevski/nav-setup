package nl.jovmit.navsetup.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import nl.jovmit.navsetup.shared.ui.theme.NavSetupTheme

@Composable
fun MainScreen(
  onOpenEmailDetails: (emailId: Int) -> Unit,
  onComposeNewEmail: () -> Unit
) {

}

@Composable
private fun MainBottomBar(
  hierarchy: Sequence<NavDestination>?,
  onNavigateToEmails: () -> Unit,
  onNavigateToProfile: () -> Unit
) {
  NavigationBar {
    NavigationBarItem(
      selected = true,
      icon = { Icon(imageVector = Icons.Default.Email, "emails") },
      onClick = onNavigateToEmails
    )
    NavigationBarItem(
      selected = false,
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