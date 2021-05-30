package com.example.notebook.service.impl;

import com.example.notebook.entity.Notebook;
import com.example.notebook.repository.NoteBookRepository;
import com.example.notebook.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NotebookServiceImpl implements NotebookService {

    NoteBookRepository noteRepository;

    @Autowired
    public NotebookServiceImpl(NoteBookRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    @Transactional
    public Notebook create(Notebook note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Notebook> getAllNotebook() {
        return noteRepository.findAll();
    }

    @Override
    public List<Notebook> getAllNotebookSortedByProducerDesc() {
        return noteRepository.getAllByOrderByProducerDesc();
    }

    @Override
    public List<Notebook> getNotesWithMemoryGreaterThan16() {
        return noteRepository.findByMemoryGreaterThan(16);
    }

    @Override
    public List<Notebook> getNotesByMemory(int memory) {
        return noteRepository.findByMemory(memory);
    }

    @Override
    public List<Notebook> getNotesByUsed(boolean isUsed) {
        return noteRepository.findByIsUsed(isUsed);
    }
}
