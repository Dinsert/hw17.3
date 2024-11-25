package org.skypro.skyshop.service;

import java.util.Collection;
import org.skypro.skyshop.model.search.SearchResult;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    private final StorageService storageService;

    public SearchService(StorageService storageService) {
        this.storageService = storageService;
    }

    public Collection<SearchResult> search(String string) {
        return storageService.getAllSearchable()
                             .stream()
                             .filter(searchable -> searchable.searchTerm(string))
                             .map(SearchResult::fromSearchable)
                             .toList();

    }
}
