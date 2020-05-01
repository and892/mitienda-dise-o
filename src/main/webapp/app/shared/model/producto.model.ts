import { IProductoDetalle } from 'app/shared/model/producto-detalle.model';
import { EstadoProducto } from 'app/shared/model/enumerations/estado-producto.model';
import { Talla } from 'app/shared/model/enumerations/talla.model';

export interface IProducto {
  id?: number;
  nombre?: string;
  descripcion?: string;
  precioCompra?: number;
  precioVenta?: number;
  estado?: EstadoProducto;
  talla?: Talla;
  imageContentType?: string;
  image?: any;
  productoDetalles?: IProductoDetalle[];
  productCategoriaNombre?: string;
  productCategoriaId?: number;
}

export class Producto implements IProducto {
  constructor(
    public id?: number,
    public nombre?: string,
    public descripcion?: string,
    public precioCompra?: number,
    public precioVenta?: number,
    public estado?: EstadoProducto,
    public talla?: Talla,
    public imageContentType?: string,
    public image?: any,
    public productoDetalles?: IProductoDetalle[],
    public productCategoriaNombre?: string,
    public productCategoriaId?: number
  ) {}
}
