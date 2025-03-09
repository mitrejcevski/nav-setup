package nl.jovmit.navsetup.feature.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object ProfileDestination

fun NavGraphBuilder.profileScreen() {
  composable<ProfileDestination> {
    ProfileScreen()
  }
}

fun NavController.navigateToProfile() {
  navigate(ProfileDestination) {
    popUpTo(graph.id)
  }
}