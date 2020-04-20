package in.bushansirgur.online.book.store.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_book")
public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name="sku")
		private String sku;
		
		@Column(name="name")
		private String name;
		
		@Column(name="description")
		private String description;
		
		
		@Column(name="unitPrice")
		private BigDecimal unitPrice;
		
		@Column(name="imageUrl")
		private String imageUrl;
		
		@Column(name="active")
		private boolean active;
				
		@Column(name="unitsInStock")
		private int unitsInStock;
		
		@Column(name="createdOn")
		private Date createdOn;
		
		@Column(name="updatedOn")
		private Date updatedOn;
		
		@ManyToOne
		@JoinColumn(name="category_id",nullable = false)
		private BookCategory category;
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSku() {
			return sku;
		}

		public void setSku(String sku) {
			this.sku = sku;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public BigDecimal getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(BigDecimal unitPrice) {
			this.unitPrice = unitPrice;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

		public int getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(int unitsInStock) {
			this.unitsInStock = unitsInStock;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}

		public Date getUpdatedOn() {
			return updatedOn;
		}

		public void setUpdatedOn(Date updatedOn) {
			this.updatedOn = updatedOn;
		}
		
		

		public BookCategory getCategory() {
			return category;
		}

		public void setCategory(BookCategory category) {
			this.category = category;
		}

		
		
		@Override
		public String toString() {
			return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description
					+ ", unitPrice=" + unitPrice + ", imageUrl=" + imageUrl + ", active=" + active + ", unitsInStock="
					+ unitsInStock + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", category=" + category
					+ "]";
		}

		public Book() {
			
		}

		public Book(int id, String sku, String name, String description, BigDecimal unitPrice, String imageUrl,
				boolean active, int unitsInStock, Date createdOn, Date updatedOn, BookCategory category) {
			super();
			this.id = id;
			this.sku = sku;
			this.name = name;
			this.description = description;
			this.unitPrice = unitPrice;
			this.imageUrl = imageUrl;
			this.active = active;
			this.unitsInStock = unitsInStock;
			this.createdOn = createdOn;
			this.updatedOn = updatedOn;
			this.category = category;
		}

	
		
		
		
	}