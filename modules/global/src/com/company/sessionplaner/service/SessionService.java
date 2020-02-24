package com.company.sessionplaner.service;

import com.company.sessionplaner.entity.Session;

import java.util.Date;

public interface SessionService {
    String NAME = "sessionplaner_SessionService";

    boolean rescheduleSession(Session session, Date newStartDate);
}