package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "category")
public class Category extends BaseEntity {
    private String name;
    private Long idSubcategory;

    public Category() {
    }

    public Category(Long id) {
        super(id);
    }

    @Column(name = "category_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "id_sub_cat")
    public Long getIdSubcategory() {
        return idSubcategory;
    }

    public void setIdSubcategory(Long idSubcategory) {
        this.idSubcategory = idSubcategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(idSubcategory, category.idSubcategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, idSubcategory);
    }
}
