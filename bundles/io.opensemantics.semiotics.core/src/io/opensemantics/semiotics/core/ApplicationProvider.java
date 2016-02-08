package io.opensemantics.semiotics.core;

import io.opensemantics.semiotics.search.Application;

public interface ApplicationProvider {

  boolean add(Application application);

  boolean remove(Application application);

  Iterable<Application> getApplications();
}
