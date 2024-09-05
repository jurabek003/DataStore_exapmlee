package uz.turgunboyevjurabek.datastoreexapmlee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import uz.turgunboyevjurabek.datastoreexapmlee.ui.theme.DataStoreExapmleeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Application'dan DataStore'ni olish
        val dataStore = (application as MyApplication).dataStore

        enableEdgeToEdge()
        setContent {
            DataStoreExapmleeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                    ) {
                        val viewModel=CounterViewModel(dataStore)
                        CounterScreen(viewModel)
                    }
                }
            }
        }
    }
}
