package co.edu.unisabana.usuario.service.library.port;

import co.edu.unisabana.usuario.persistencia.dao.entity.BookEntity;

import java.util.List;

public interface SearchBookPort {

    boolean validateExistsBook(String nameBook);
    List<BookEntity> searchBook (String autor);
}
