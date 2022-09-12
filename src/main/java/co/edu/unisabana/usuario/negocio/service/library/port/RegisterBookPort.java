package co.edu.unisabana.usuario.negocio.service.library.port;

import co.edu.unisabana.usuario.negocio.service.library.model.Book;

import java.util.List;

public interface RegisterBookPort {

    List registerBook(Book newBook);
}

