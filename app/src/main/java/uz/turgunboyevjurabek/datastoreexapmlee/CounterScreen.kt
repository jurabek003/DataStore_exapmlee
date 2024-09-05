package uz.turgunboyevjurabek.datastoreexapmlee

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(viewModel: CounterViewModel) {
    val counter by viewModel.counter.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//        Text(text = "Counter: $counter", fontSize = 24.sp)
        AnimatedCounter(count = counter)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { viewModel.incrementCounter() }) {
            Text(text = "Increment Counter")
        }
    }
}
