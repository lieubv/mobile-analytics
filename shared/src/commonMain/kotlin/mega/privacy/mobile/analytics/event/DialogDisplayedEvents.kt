package mega.privacy.mobile.analytics.event

import mega.privacy.mobile.analytics.annotations.DialogDisplayedEvent

@DialogDisplayedEvent(dialog = "DeleteAlbumsConfirmationDialog", screen = "PhotoScreen")
interface DeleteAlbumsConfirmationDialog

@DialogDisplayedEvent(dialog = "RemoveLinksConfirmationDialog", screen = "PhotoScreen")
interface RemoveLinksConfirmationDialog

@DialogDisplayedEvent(dialog = "CreateNewAlbumDialog", screen = "PhotoScreen")
interface CreateNewAlbumDialog