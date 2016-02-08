package io.opensemantics.semiotics.search.spi;

import java.util.List;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchResult;

public interface SearchService {

  List<SearchResult> search(Search search, List<SearchResult> prior);
}
