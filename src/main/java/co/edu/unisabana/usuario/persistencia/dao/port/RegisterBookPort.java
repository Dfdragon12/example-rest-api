package co.edu.unisabana.usuario.persistencia.dao.port;

import co.edu.unisabana.usuario.negocio.service.library.model.Book;

import java.util.List;

public interface RegisterBookPort {

    List registerBook(Book newBook);
}

