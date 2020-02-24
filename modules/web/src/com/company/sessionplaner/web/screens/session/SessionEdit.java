package com.company.sessionplaner.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplaner.entity.Session;

@UiController("sessionplaner_Sessions.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}