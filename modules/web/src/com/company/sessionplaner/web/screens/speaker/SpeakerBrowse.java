package com.company.sessionplaner.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplaner.entity.Speaker;

@UiController("sessionplaner_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}