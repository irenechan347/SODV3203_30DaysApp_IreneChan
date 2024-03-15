package com.example.sodv3203_30daysapp_irenechan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sodv3203_30daysapp_irenechan.model.FitnessTip
import com.example.sodv3203_30daysapp_irenechan.model.FitnessTipRepository.fitnessTips
import com.example.sodv3203_30daysapp_irenechan.ui.theme.SODV3203_30DaysApp_IreneChanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SODV3203_30DaysApp_IreneChanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirtyDaysApp()
                }
            }
        }
    }
}

@Composable
fun ThirtyDaysApp(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) {
        FitnessTipList(fitnessTips = fitnessTips, contentPadding = it)
    }
}

@Composable
fun FitnessTipList(
    fitnessTips: List<FitnessTip>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(contentPadding = contentPadding) {
        items(fitnessTips) {
            FitnessTipItem(
                fitnessTip = it,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun FitnessTipItem(
    fitnessTip: FitnessTip,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    Button(
        onClick = { expanded = !expanded },
        shape = RoundedCornerShape(40.dp),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.tertiaryContainer)
        ) {
            Column(
                modifier = Modifier
                    .animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioNoBouncy,
                            stiffness = Spring.StiffnessMedium
                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(R.dimen.padding_small))
                ) {
                    Text(
                        text = stringResource(fitnessTip.dayRes),
                        style = MaterialTheme.typography.displayMedium
                    )
                    Text(
                        text = stringResource(fitnessTip.titleRes),
                        style = MaterialTheme.typography.displaySmall
                    )
                    Image(
                        painter = painterResource(fitnessTip.imageRes),
                        contentDescription = stringResource(fitnessTip.dayRes),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(194.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                if(expanded) {
                    Text(
                        text = stringResource(fitnessTip.descriptionRes),
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displayLarge
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.tertiaryContainer)
    )
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysAppPreview() {
    SODV3203_30DaysApp_IreneChanTheme(useDarkTheme = false) {
        ThirtyDaysApp()
    }
}
