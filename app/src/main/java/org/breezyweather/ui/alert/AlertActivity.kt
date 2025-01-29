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

package org.breezyweather.ui.alert

import android.os.Bundle
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import org.breezyweather.common.basic.GeoActivity

@AndroidEntryPoint
class AlertActivity : GeoActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AlertScreen(
                onBackPressed = {
                    finish()
                }
            )
        }
    }

    companion object {
        const val KEY_FORMATTED_ID = "formatted_id"
        const val KEY_ALERT_ID = "alert_id"
    }
}
