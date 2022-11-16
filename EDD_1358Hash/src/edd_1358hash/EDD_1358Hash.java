package edd_1358hash;

public class EDD_1358Hash {
    public static void main(String[] args) {
        try {
            int i, n, res;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el tamaño de la tabla"));
            TablasHash[] h = new TablasHash[m];
            for (i = 0; i < m; i++) {
                h[i] = new TablasHash();
                h[i].estado = 0;
            }
            do {
                res = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Menú Principal "  + "Insertar (1) " + "Buscar (2) " + "Eliminar (3) " + "Salir (4) "));
                switch (res) {
                    case 1:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número a ser insertado en la tabla:"));
                        TablasHash.insertar(h, m, n);
                        break;
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número a ser buscado en la tabla:"));
                        i = TablasHash.valorDe(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número no encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número encontrado");
                        }
                        break;
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el número a ser eliminado de la tabla:"));
                        i = TablasHash.eliminar(h, m, n);
                        if (i == -1) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número no encontrado");
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(null, "Número eliminado satisfactoriamente");
                        }
                        break;
                    case 4:
                        System.exit(0);
                    default:
                }
            } while (res != 4);
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(null, "Está Saliendo del Programa");
        } catch (OutOfMemoryError ome) {
            javax.swing.JOptionPane.showMessageDialog(null, "No Hay Espacio");
        }
    }
}