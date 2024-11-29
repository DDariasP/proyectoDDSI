package Vista;

import Controlador.*;
import Modelo.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author Diego Francisco Darias Pino
 */
public class VistaSocio {

    public static JScrollPane sp;
    public static JPanel panel;
    public static JLabel label;
    public static DefaultTableModel model;
    public static JTable table;
    public static DefaultTableCellRenderer renderT;
    public static JTableHeader header;
    public static DefaultTableCellRenderer renderH;

    public static JPanel generar(ControladorSocio cs) {
        String[] columnas = {"Número", "Nombre", "DNI", "FechaNac", "Teléfono", "Correo", "FechaEnt", "Categoría"};
        model = new DefaultTableModel(columnas, 0);
        table = new JTable();
        table.setModel(model);
        table.setBackground(Color.DARK_GRAY);
        table.setFillsViewportHeight(true);
        table.setGridColor(Color.WHITE);

        VistaSocio.rellenar(cs);

        renderT = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setFont(new Font("Monospaced", Font.BOLD, 25));
                cell.setForeground(Color.WHITE);
                cell.setBackground(isSelected ? Color.BLACK : Color.DARK_GRAY);
                return cell;
            }
        };

        for (int row = 0; row < table.getRowCount(); row++) {
            table.setRowHeight(row, 35);
        }

        header = table.getTableHeader();
        header.setReorderingAllowed(false);
        header.setFont(new Font("Monospaced", Font.BOLD, 30));
        header.setForeground(Color.WHITE);
        header.setBackground(Color.DARK_GRAY);

        renderH = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderH.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            TableColumn columna = table.getColumnModel().getColumn(i);
            columna.setCellRenderer(renderT);

            Component comp = renderT.getTableCellRendererComponent(table, table.getValueAt(1, i), false, false, 1, i);
            int anchoC = comp.getPreferredSize().width;
            FontMetrics metrics = header.getFontMetrics(header.getFont());
            String titulo = columna.getHeaderValue().toString();
            int anchoT = metrics.stringWidth(titulo);
            columna.setPreferredWidth(Math.max(anchoC, anchoT));
        }

        sp = new JScrollPane(table);

        label = new JLabel("Gestión de socios", SwingConstants.CENTER);
        label.setFont(new Font("Monospaced", Font.BOLD, 35));
        label.setForeground(Color.WHITE);

        panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(sp, BorderLayout.CENTER);
        panel.setBackground(Color.DARK_GRAY);

        return panel;
    }

    public static void rellenar(ControladorSocio cs) {
        ArrayList<Socio> lista = cs.listaSocio();
        Object[] fila = new Object[8];
        for (Socio s : lista) {
            fila[0] = s.getNumeroSocio();
            fila[1] = s.getNombre();
            fila[2] = s.getDni();
            fila[3] = s.getFechaNacimiento();
            fila[4] = s.getTelefono();
            fila[5] = s.getCorreo();
            fila[6] = s.getFechaEntrada();
            fila[7] = s.getCategoria();
            model.addRow(fila);
        }
    }

    public static void vaciar() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

}
