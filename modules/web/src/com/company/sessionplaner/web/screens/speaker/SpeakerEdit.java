package com.company.sessionplaner.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplaner.entity.Speaker;

@UiController("sessionplaner_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}