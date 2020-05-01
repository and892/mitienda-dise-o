package com.themakers.mitienda.service.dto;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Lob;
import com.themakers.mitienda.domain.enumeration.EstadoProducto;
import com.themakers.mitienda.domain.enumeration.Talla;

/**
 * A DTO for the {@link com.themakers.mitienda.domain.Producto} entity.
 */
@ApiModel(description = "Product sold by the Online store")
public class ProductoDTO implements Serializable {

    private Long id;

    @NotNull
    private String nombre;

    private String descripcion;

    @NotNull
    @DecimalMin(value = "0")
    private BigDecimal precioCompra;

    @NotNull
    @DecimalMin(value = "0")
    private BigDecimal precioVenta;

    private EstadoProducto estado;

    @NotNull
    private Talla talla;

    @Lob
    private byte[] image;

    private String imageContentType;

    private Long productCategoriaId;

    private String productCategoriaNombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public Long getProductCategoriaId() {
        return productCategoriaId;
    }

    public void setProductCategoriaId(Long productoCategoriaId) {
        this.productCategoriaId = productoCategoriaId;
    }

    public String getProductCategoriaNombre() {
        return productCategoriaNombre;
    }

    public void setProductCategoriaNombre(String productoCategoriaNombre) {
        this.productCategoriaNombre = productoCategoriaNombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductoDTO productoDTO = (ProductoDTO) o;
        if (productoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), productoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", precioCompra=" + getPrecioCompra() +
            ", precioVenta=" + getPrecioVenta() +
            ", estado='" + getEstado() + "'" +
            ", talla='" + getTalla() + "'" +
            ", image='" + getImage() + "'" +
            ", productCategoriaId=" + getProductCategoriaId() +
            ", productCategoriaNombre='" + getProductCategoriaNombre() + "'" +
            "}";
    }
}
