package ch.bfh.swos.bookapp.service;

import java.util.Collection;

import ch.bfh.swos.bookapp.service.dto.BookDTO;

public interface BookService {

	public BookDTO create(BookDTO book);

	public BookDTO read(long id);

	public Collection<BookDTO> list();

	public BookDTO update(BookDTO book);

	public void delete(BookDTO book);
}
