package com.wizard_of_tomorrow.controller;

import static java.util.concurrent.CompletableFuture.completedFuture;

import java.util.concurrent.CompletableFuture;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class AbstractViewController {

  final String view;

  protected CompletableFuture<String> redirectTo(String url) {
    return completedFuture("redirect:%s".formatted(url));
  }

  protected CompletableFuture<String> getView() {
    return completedFuture(view);
  }

}
