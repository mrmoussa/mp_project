package com.plcoding.weatherapp.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherForecast(
    state: WeatherState,
    modifier: Modifier = Modifier,
    dayIndex: Int
) {
    state.weatherInfo?.weatherDataPerDay?.get(dayIndex)?.let { data ->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            LazyRow(
                content = {
                items(data) { weatherData ->
                    HourlyWeatherDisplay(
                        weatherData = weatherData
                    )
                }
            })
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}