package in.bushansirgur.online.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bushansirgur.online.book.store.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{

}
