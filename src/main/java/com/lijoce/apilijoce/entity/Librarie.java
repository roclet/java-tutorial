package com.lijoce.apilijoce.entity;

import java.io.*;
import java.util.*;

public class Librarie {

    // reference to refer to listr of books.
    private  final List<Book> books;

    Librarie(List<Book> books){
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary(){
        return  books;
    }
}
