package com.elibrary.server.service.impl;


import com.elibrary.server.dao.LibraryBookDao;
import com.elibrary.server.service.LibraryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("libraryService")
public class LibraryServiceImpl implements LibraryService {

    private final Logger LOGGER = Logger.getLogger(LibraryServiceImpl.class);

    @Autowired
    private LibraryBookDao libraryBookDao;

}
