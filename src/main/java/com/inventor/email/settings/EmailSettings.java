package com.inventor.email.settings;

import com.inventor.email.Email;

import java.util.Date;
import java.util.List;

public interface EmailSettings {
    void addEmail(List<Email> emails);

    void deleteEmail(int index);

    void loadInFile();

    void loadOutOfFile();

    void changeDate(int index, Date newDate);

    void changeCondition(Email email);

    List<Email> getAll();

    List<Email> getUnsent();

}