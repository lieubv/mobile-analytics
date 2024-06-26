package mega.privacy.mobile.analytics.core.event.type

import mega.privacy.mobile.analytics.core.event.identifier.AppIdentifier
import mega.privacy.mobile.analytics.core.event.identifier.GeneralEventIdentifier

/**
 * General event
 *
 * @property eventIdentifier
 * @property viewId
 */
data class GeneralEvent(
    override val eventIdentifier: GeneralEventIdentifier,
    override val viewId: String?,
    override val appIdentifier: AppIdentifier
) : AnalyticsEvent() {
    override val eventTypeIdentifier = 7000

    override val eventData: Map<String, Any?>
        get() {
            return eventIdentifier.info
        }
}