package in.bushansirgur.online.book.store.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_category")
public class BookCategory 
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="category_name")
		private String categoryname;
		
		@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
		private Set<Book> book;
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCategoryname() {
			return categoryname;
		}

		public void setCategoryname(String categoryname) {
			this.categoryname = categoryname;
		}

		public Set<Book> getBook() {
			return book;
		}

		public void setBook(Set<Book> book) {
			this.book = book;
		}
		
		

		@Override
		public String toString() {
			return "BookCategory [id=" + id + ", categoryname=" + categoryname + ", book=" + book + "]";
		}

		public BookCategory(Long id, String categoryname, Set<Book> book) {
			super();
			this.id = id;
			this.categoryname = categoryname;
			this.book = book;
		}

		public BookCategory() {
			
		}
		
}
