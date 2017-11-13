package com.jwkramer.lists.repositories;

import com.jwkramer.lists.models.Note;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by joekramer on Nov, 2017
 */

public interface NoteRepository extends CrudRepository<Note, Long> {
}
