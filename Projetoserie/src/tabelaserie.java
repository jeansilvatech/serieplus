import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;


public class tabelaserie extends JInternalFrame {
	public static String [] colunas=new String []{"Nome","temporada","episodio"};
	public static DefaultTableModel modelo=new DefaultTableModel(colunas,0);
	public static JTable tabela=new JTable(modelo){ 
		public boolean isCellEditable(int rowIndex, int mColIndex) {  
		return false; 
		
	}};
	public static JScrollPane rolagem=new JScrollPane(tabela);
	public static manipulaserie seri=new  manipulaserie();
	private final JLabel jlB = new JLabel("");
	private final JLabel jlC = new JLabel("");
	private final JLabel jlD = new JLabel("");
	private final JLabel jlE = new JLabel("");
	private final JLabel jlF = new JLabel("");
	private final JLabel jlAr = new JLabel("Arrow");
	private final JLabel jlFl = new JLabel("The Flash");
	private final JLabel jlSu = new JLabel("Supergirl");
	private final JLabel jlLe = new JLabel("Legends of Tomorrow");
	private final JLabel jlDe = new JLabel("Demolidor");
	private final JLabel jlGr = new JLabel("Grimm");
	public tabelaserie() {
		setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setTitle("Detalhes");
		getContentPane().setBackground(Color.WHITE);
		setBounds(0, 0, 990, 570);
		//setVisible(false);//
		tabela.setForeground(Color.WHITE);
		tabela.setBackground(Color.BLACK);
		tabela.setFont(new Font("Arial",Font.BOLD,11));
		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(120);
		preencheTabela(seri.listagem());
		getContentPane().setLayout(null);
		rolagem.setBounds(263, 30, 423, 120);
		getContentPane().add(rolagem);
		
		jlAr.setVisible(false);
		jlFl.setVisible(false);
		jlSu.setVisible(false);
		jlLe.setVisible(false);
		jlDe.setVisible(false);
		jlGr.setVisible(false);
		
		JLabel jlA = new JLabel("");
		jlA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jlAr.setVisible(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			public void mouseExited(MouseEvent arg0) {
				jlAr.setVisible(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		jlA.setIcon(new ImageIcon(tabelaserie.class.getResource("/arrow-season-1-posters-3.jpg")));
		jlA.setBounds(50, 220, 100, 150);
		getContentPane().add(jlA);
		jlB.setIcon(new ImageIcon(tabelaserie.class.getResource("/The_Flash_(2014_TV_Series)_Poster.jpg")));
		jlB.setBounds(200, 220, 100, 150);
		jlB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jlFl.setVisible(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			public void mouseExited(MouseEvent arg0) {
				jlFl.setVisible(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		
		getContentPane().add(jlB);
		jlC.setIcon(new ImageIcon(tabelaserie.class.getResource("/Poster-supergirl-2015-tv-series-38643473-680-1000.jpg")));
		jlC.setBounds(350, 220, 100, 150);
		jlC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jlSu.setVisible(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			public void mouseExited(MouseEvent arg0) {
				jlSu.setVisible(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		
		getContentPane().add(jlC);
		jlD.setIcon(new ImageIcon(tabelaserie.class.getResource("/LegendsKeyArt_5661d7e99d5e60.02559670.PNG")));
		jlD.setBounds(500, 220, 100, 150);
		jlD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jlLe.setVisible(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			public void mouseExited(MouseEvent arg0) {
				jlLe.setVisible(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		
		getContentPane().add(jlD);
		jlE.setIcon(new ImageIcon(tabelaserie.class.getResource("/dd_vertical-bloodyknuckles_us-main.jpg")));
		jlE.setBounds(650, 220, 100, 150);
		jlE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jlDe.setVisible(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			public void mouseExited(MouseEvent arg0) {
				jlDe.setVisible(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		
		getContentPane().add(jlE);
		jlF.setIcon(new ImageIcon(tabelaserie.class.getResource("/GRIMM-Season-3-Poster.jpg")));
		jlF.setBounds(800, 220, 100, 150);
		jlF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jlGr.setVisible(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			public void mouseExited(MouseEvent arg0) {
				jlGr.setVisible(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		
		getContentPane().add(jlF);
		jlAr.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlAr.setForeground(Color.BLACK);
		jlAr.setHorizontalAlignment(SwingConstants.CENTER);
		jlAr.setBounds(50, 192, 100, 22);
		
		getContentPane().add(jlAr);
		jlFl.setForeground(Color.BLACK);
		jlFl.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlFl.setHorizontalAlignment(SwingConstants.CENTER);
		jlFl.setBounds(200, 192, 100, 22);
		
		getContentPane().add(jlFl);
		jlSu.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlSu.setForeground(Color.BLACK);
		jlSu.setHorizontalAlignment(SwingConstants.CENTER);
		jlSu.setBounds(350, 192, 100, 22);
		
		getContentPane().add(jlSu);
		jlLe.setForeground(Color.BLACK);
		jlLe.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlLe.setHorizontalAlignment(SwingConstants.CENTER);
		jlLe.setBounds(480, 192, 140, 22);
		
		getContentPane().add(jlLe);
		jlDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlDe.setForeground(Color.BLACK);
		jlDe.setHorizontalAlignment(SwingConstants.CENTER);
		jlDe.setBounds(650, 192, 100, 22);
		
		getContentPane().add(jlDe);
		jlGr.setForeground(Color.BLACK);
		jlGr.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlGr.setHorizontalAlignment(SwingConstants.CENTER);
		jlGr.setBounds(800, 192, 100, 22);
		
		getContentPane().add(jlGr);

	}
	
	public void preencheTabela(ResultSet resultado)
	{
	
		try
		{
			modelo.setNumRows(0);
			while(resultado.next())
			{
				modelo.addRow(new String[]{resultado.getString("Nome"),resultado.getString("Temporada"),resultado.getString("Episodio")});
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
}
