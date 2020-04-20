package in.bushansirgur.online.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bushansirgur.online.book.store.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>
{

}
