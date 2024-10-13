/**
 * This file is part of Breezy Weather.
 *
 * Breezy Weather is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, version 3 of the License.
 *
 * Breezy Weather is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Breezy Weather. If not, see <https://www.gnu.org/licenses/>.
 */

package org.breezyweather.sources.wmosevereweather.json

import kotlinx.serialization.Serializable
import org.breezyweather.common.serializer.DateSerializer
import java.util.Date

@Serializable
data class WmoSevereWeatherAlertProperties(
    val capurl: String?,
    val rlink: String?, // Alternative cap URL for other languages
    val identifier: String?,
    @Serializable(DateSerializer::class) val sent: Date?,
    val description: String?,
    val event: String?,
    val s: Int?,
    @Serializable(DateSerializer::class) val effective: Date?,
    @Serializable(DateSerializer::class) val onset: Date?,
    val url: String?,
    @Serializable(DateSerializer::class) val expires: Date?
)
