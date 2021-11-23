package parcialfinal;

import javax.swing.JOptionPane;

public class opciones {
    // Atributos
    int cantidadProductos[];
    int codigoProductos[];
    int precioproductos[];
    String nombreProductos[];
    int aux;
    int auxCantidad[];
    int cantidadFacturacion;
    int pagoEfectivo;
    double iva; 
    double costoProducto;
    double descuento;
    
    // Funciones
    public void ingresarProductos(){
        aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que desee"));
        cantidadProductos = new int[aux];
        codigoProductos = new int[aux];
        precioproductos = new int[aux];
        nombreProductos = new String[aux];
        for (int i = 0; i < cantidadProductos.length; i++) {
            codigoProductos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto " + (i+1)));
        }
        
        for (int j = 0; j < cantidadProductos.length; j++) {
            precioproductos[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto " + (j+1)));
        }
        
        for (int k = 0; k < cantidadProductos.length; k++) {
            nombreProductos[k] = JOptionPane.showInputDialog("Digite el nombre del producto " + (k+1));
        }
    }
    
    public void busquedaProductos() {
        aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));
        
        for (int l = 0; l < cantidadProductos.length; l++) {
            if (aux == codigoProductos[l]) {
                JOptionPane.showMessageDialog(null, "Informacion del producto\n"
                        + "El codigo del producto es: " + codigoProductos[l] + "\n"
                        + "El precio del producto es: " + precioproductos[l] + "\n"
                        + "El nombre del producto es: " + nombreProductos[l]);
            }
        }
    }
    
    public void facturacion() {
        aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto a facturar"));
        cantidadFacturacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de venta"));
        auxCantidad = new int[cantidadFacturacion];
        for (int m = 0; m < cantidadProductos.length; m++) {
            costoProducto = precioproductos[m];
            iva = costoProducto * 0.19;
            descuento = costoProducto - iva;
            if (aux == codigoProductos[m]) {
                pagoEfectivo = Integer.parseInt(JOptionPane.showInputDialog("Desea pagar en efectivo, 1 para Si y 2 para No"));
                switch (pagoEfectivo) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Valor de compra:\n"
                            + "Codigo producto: " + codigoProductos[m] + "\n"
                            + "Nombre de producto: " + nombreProductos[m] + "\n"
                            + "Cantidad: " + auxCantidad.length + "\n"
                            + "Costo del producto: " + costoProducto + "\n"
                            + "IVA del 19%: " + iva + "\n"
                            + "Descuento: " + descuento + "\n"
                            + "Valor total a pagar: " + (descuento*auxCantidad.length));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Valor de compra:\n"
                            + "Codigo producto: " + codigoProductos[m] + "\n"
                            + "Nombre de producto: " + nombreProductos[m] + "\n"
                            + "Cantidad: " + auxCantidad.length + "\n"
                            + "Costo del producto: " + costoProducto + "\n"
                            + "IVA del 19%: " + 0 + "\n"
                            + "Descuento: " + 0 + "\n"
                            + "Valor total a pagar: " + (costoProducto*auxCantidad.length));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida intente de nuevo",
                                "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
        }
    }
}
