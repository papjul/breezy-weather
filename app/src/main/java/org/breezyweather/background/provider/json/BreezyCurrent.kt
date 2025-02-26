/**
 * This file is part of Breezy Weather.
 *
 * Breezy Weather is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License.
 *
 * Breezy Weather is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Breezy Weather. If not, see <https://www.gnu.org/licenses/>.
 */

package org.breezyweather.background.provider.json

import kotlinx.serialization.Serializable

@Serializable
data class BreezyCurrent(
    /**
     * Description of the weather condition. Usually provided by the source, otherwise fallbacks
     * to a description of the weather code
     */
    val weatherText: String? = null,
    /**
     * See WeatherCode enum to see which codes we support
     */
    val weatherCode: String? = null,
    val temperature: BreezyTemperature? = null,
    val wind: BreezyWind? = null,
    val uV: BreezyUV? = null,
    val airQuality: BreezyAirQuality? = null,
    val relativeHumidity: BreezyPercent? = null,
    val dewPoint: BreezyDoubleUnit? = null,
    /**
     * Pressure at sea level
     */
    val pressure: BreezyDoubleUnit? = null,
    val cloudCover: BreezyPercent? = null,
    val visibility: BreezyDoubleUnit? = null,
    val ceiling: BreezyDoubleUnit? = null,
)
