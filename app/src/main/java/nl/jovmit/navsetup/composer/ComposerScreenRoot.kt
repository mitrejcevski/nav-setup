package nl.jovmit.navsetup.composer

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import nl.jovmit.navsetup.shared.ui.theme.NavSetupTheme

@Composable
fun ComposerScreenRoot(
  onNavigateUp: () -> Unit
) {

}

@Preview
@Composable
private fun PreviewComposer() {
  NavSetupTheme {
    ComposerScreenRoot(
      onNavigateUp = {}
    )
  }
}