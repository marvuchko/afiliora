package com.wizard_of_tomorrow.controller;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class AbstractViewController {

    final String view;

}
